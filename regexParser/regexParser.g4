grammar regexParser;

@header {
	import java.util.Stack;
}

//JAVA Code
@members{

	public static boolean beginOperation = false;
	public static Stack stack = new Stack();

	public static String regex = "";

	public void add(String addition)
	{
		regex += addition;
		System.out.println("Regex:" + regex);
	}

	public void pushToStack(String val)
	{
		stack.push(val);
	}

	public static int nthOccurrence(String str, char c, int n) 
	{
	    int pos = str.indexOf(c, 0);
	    while (n-- > 0 && pos != -1)
	        pos = str.indexOf(c, pos+1);
	    return pos;
	}

	public void insertParam(String param)
	{
		if (param == "ALL")
		{
			regex += "(.*)";
		}
		else if (param.contains("range "))
		{
			param = param.substring(nthOccurrence(param, '"', 0), nthOccurrence(param, '"', 1));
			regex += "[" + param + "]";
		}
		else if (param.matches("\"[^\"]+\""))
		{
			regex += param.substring(1, param.length()-1);
//			regex += "\\b";
		}
		else if (param.contains("all_before "))
		{
			param = param.substring(11);
			regex += "[^" + param + "]*";
		}
		else if (param.contains("all_until "))
		{
			param = param.substring(10);
			regex += "[^" + param.substring(1, param.length()-1) + "]*" + param.substring(1, param.length()-1);
		}
	}

	public void performOP(String inputParams, String opType)
	{
		if (stack.isEmpty())
		{
			System.err.println("Syntax error seems to exist, or is not currenlty supported");
			System.exit(1);
		}

		String textToFind = String.valueOf(stack.pop());
		String param1 = "";
		String param2 = "";

		if (opType == "BETWEEN")
		{
			param1 = inputParams.substring(nthOccurrence(inputParams, '(', 0)+1, inputParams.indexOf(','));
			param2 = inputParams.substring(nthOccurrence(inputParams, '"', 2), nthOccurrence(inputParams, '"', 3)+1);
		}
		else if (opType == "BEFORE")
		{
			param1 = inputParams.substring(nthOccurrence(inputParams, '"', 0), nthOccurrence(inputParams, '"', 1)+1);
		}

		while (param1.length() != 0)
		{
			if (param1.contains("+"))
			{
				insertParam(param1.substring(0, param1.indexOf('+')));
				param1 = param1.substring(param1.indexOf('+')+1);
				continue;
			}
			else
			{
				insertParam(param1);
				param1 = "";
			}
		}

		if (opType == "BETWEEN")
		{
			if (textToFind == "ALL")
			{
				regex += "(.*)";
			}
			else if (textToFind.contains("range"))
			{
				regex += "[" + textToFind.substring(nthOccurrence(textToFind, '"', 0)+1, nthOccurrence(textToFind, '"', 1)) + "]+";
			}

			while (param2.length() != 0)
			{
				if (param2.contains("+"))
				{
					insertParam(param2.substring(0, param2.indexOf('+')));
					param2 = param2.substring(param2.indexOf('+')+1);
					continue;
				}
				else
				{
					insertParam(param2);
					param2 = "";
				}
			}
		}
		else if (opType == "BEFORE")
		{
			if (textToFind == "ALL")
			{
				regex = "(.*)(?=" + regex  + ")";
			}
			else if (textToFind.contains("range"))
			{
				regex = "[" + textToFind.substring(nthOccurrence(textToFind, '"', 0)+1, nthOccurrence(textToFind, '"', 1)) + "]+" + "(?=" + regex + ")";
			}
		}
	}

	public void printRegex()
	{
		String input = "";

		if (beginOperation)
		{
			while(!stack.isEmpty())
			{
				input = String.valueOf(stack.pop());

				switch (input)
				{
				case "ALL":
					break;

				case "BETWEEN":
					performOP(String.valueOf(stack.pop()), "BETWEEN");
					break;

				case "BEFORE":
					performOP(String.valueOf(stack.pop()), "BEFORE");
					break;

				default:
					System.err.println("Unrecognized input: " + input);
					break;
				}
			}

			System.out.println("Regex: (" + regex + ")");
			stack.clear();
		}
		else
		{
			System.err.println("No valid expression detected.");
			System.exit(1);
		}
	}
}


//---------------------------
//     Lexer Rules
//---------------------------
BEGIN_OP : ('select') {beginOperation = true;};

CONST_ANYTHING : ('ANYTHING') {};
CONST_ALL : ('ALL') {pushToStack("ALL");};
CONST_START : ('START') {};
CONST_END : ('END') {};

RPAREN : ')';
LPAREN : '(';
DQUOTE : '"';
RANGE : ('range 'DQUOTE~'"'+DQUOTE) {pushToStack(getText());};

OP_BETWEEN : ('between'LPAREN~')'+RPAREN) {pushToStack(getText()); pushToStack("BETWEEN");};
OP_BEFORE : ('before'LPAREN~')'+RPAREN) {pushToStack(getText()); pushToStack("BEFORE");};
OP_AND : ('and') {};

THEN : ('THEN') {};
NOT : ('NOT') {};

WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : '\''~'\''+'\'' {};
MULTIPLE_CHARS : ('"'~'"'+'"') {stack.push(getText());};


QUIT : ';' {printRegex();};

//---------------------------
//     Parser Rules
//---------------------------

start:
	(BEGIN_OP expr QUIT)
	; 

expr:
	CONST_ANYTHING
	| expr expr
	| THEN
	| NOT
	| addition
	| MULTIPLE_CHARS
	;

start_expr:
	CONST_START expr
	| CONST_START THEN expr
	;

end_expr:
	expr CONST_END
	| CONST_END THEN expr
	;

between_and:
	 OP_BETWEEN expr OP_AND expr;

between_func:
	OP_BETWEEN;

single_quote:
	'\'';

double_quote:
	'\"';

addition:
	'+';
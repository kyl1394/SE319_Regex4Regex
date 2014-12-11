grammar regexParser;

@header {
	import java.util.Stack;
}

//JAVA Code
@members{

	public static boolean beginOperation = false;
	public static Stack stack = new Stack();

	public static String regex = "(";

	public void add(String addition)
	{
		System.out.println("Addition:" + addition);
		regex += addition;
		System.out.println("Regex:" + regex);
	}

	public void pushToStack(String val)
	{
//		System.out.println("\n\nValue: " + val + "\n\n");
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
		System.out.println("PARAM: " + param);
		if (param == "ALL")
		{
			regex += "(.*)";
		}
		else if (param.matches("\"[^\"]+\""))
		{
			System.out.println("you are a string!");
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

	public void performBetweenOP(String inputParams)
	{
		String textToFind = String.valueOf(stack.pop());
		Boolean searchParams = true;
		
		while(searchParams)
		{
			String param1 = inputParams.substring(nthOccurrence(inputParams, '(', 0)+1, inputParams.indexOf(',')); //more than just a string should be able to be passed into this function, meaning the user should be able to pass in "<xml" + ANY BEFORE ">" as valid input.

			System.out.println(inputParams.charAt(nthOccurrence(inputParams, '"', 1)+1));
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

			String param2 = inputParams.substring(nthOccurrence(inputParams, '"', 2)+1, nthOccurrence(inputParams, '"', 3));

			if (textToFind == "ALL")
			{
				regex += param1 + "(.*)" + param2;
			}
			else
			{
				regex += param1 + textToFind.substring(nthOccurrence(textToFind, '"', 0)+1, nthOccurrence(textToFind, '"', 1)) + param2;
			}
			searchParams = false;
		}
	}

	public void printRegex()
	{
		String input = "";

		if (beginOperation)
		{
			System.out.println("\nBEGINNING");

			while(!stack.isEmpty())
			{
				input = String.valueOf(stack.pop());

//				System.out.println("while loop");
				switch (input)
				{
				case "ALL":
					break;

				case "BETWEEN":
					performBetweenOP(String.valueOf(stack.pop()));
					break;

				default:
					System.err.println("Unrecognized input: " + input);
					break;
				}
			}

			System.out.println("Regex:" + regex + ")");
			stack.clear();
		}
//		else
//		{
//			System.err.println("No valid expression detected.");
//		}
	}
}


//---------------------------
//     Lexer Rules
//---------------------------
BEGIN_OP : ('select') {beginOperation = true; System.out.println("SELECT");};

CONST_ANYTHING : ('ANYTHING') {System.out.println("ANYTHING");};
CONST_ALL : ('ALL') {System.out.println("ALL"); pushToStack("ALL");};
CONST_START : ('START') {};
CONST_END : ('END') {};

RPAREN : ')';
LPAREN : '(';

OP_BETWEEN : ('between'LPAREN~')'+RPAREN) {System.out.println("BETWEEN"); pushToStack(getText()); pushToStack("BETWEEN");};
OP_AND : ('and') {System.out.println("AND");};

THEN : ('THEN') {};
NOT : ('NOT') {};

WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : '\''~'\''+'\'' {};
MULTIPLE_CHARS : ('"'~'"'+'"') {stack.push(getText());};


QUIT : ';' {System.out.println("DONE!"); printRegex();};

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
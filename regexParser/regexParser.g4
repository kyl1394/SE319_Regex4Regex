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

	public void performBetweenOP(String inputParams)
	{
		String textToFind = String.valueOf(stack.pop());
		String param1 = inputParams.substring(nthOccurrence(inputParams, '"', 0)+1, nthOccurrence(inputParams, '"', 1)); //more than just a string should be able to be passed into this function, meaning the user should be able to pass in "<xml" + ANY BEFORE ">" as valid input.
		String param2 = inputParams.substring(nthOccurrence(inputParams, '"', 2)+1, nthOccurrence(inputParams, '"', 3));
		
		if (textToFind == "ALL")
		{
			regex += param1 + "(.*)" + param2;
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

OP_BETWEEN : ('between "'~'"'+'" and "'~'"'+'"') {System.out.println("BETWEEN"); pushToStack(getText()); pushToStack("BETWEEN");};
OP_AND : ('and') {System.out.println("AND");};

THEN : ('THEN') {};
NOT : ('NOT') {};

WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : 'asdfa' {};
MULTIPLE_CHARS : '"'~'"'+'"' {System.out.println("words");};

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
	 OP_BETWEEN MULTIPLE_CHARS OP_AND MULTIPLE_CHARS;

single_quote:
	'\'';

double_quote:
	'\"';


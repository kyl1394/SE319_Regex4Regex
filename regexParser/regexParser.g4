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
		if (beginOperation)
		{
			System.out.println("Addition:" + addition);
			regex += addition;
			System.out.println("Regex:" + regex);
		}
	}

	public void printRegex()
	{
		if (beginOperation)
		{
			System.out.println("Regex:" + regex + ")");
		}
		else
		{
			System.err.println("No valid expression detected. " + beginOperation);
		}
	}

	public void begin()
	{
		beginOperation = true;
		System.out.println("hit this: " + beginOperation);
	}
}


//---------------------------
//     Lexer Rules
//---------------------------
BEGIN_OP : ('select') {begin(); System.out.println("SELECT");};

CONST_ANYTHING : ('ANYTHING') {System.out.println("ANYTHING");};
CONST_ALL : ('ALL') {System.out.println("ALL");};
CONST_START : ('START') {};
CONST_END : ('END') {};

OP_BETWEEN : ('between') {System.out.println("BETWEEN");};
OP_AND : ('and') {System.out.println("AND");};

THEN : ('THEN') {};
NOT : ('NOT') {};

WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : 'asdfa' {};
MULTIPLE_CHARS : '"'~'"'+'"' {System.out.println("words");};

QUIT : ';' {System.out.println("DONE! " + beginOperation);};

//---------------------------
//     Parser Rules
//---------------------------

start:
	(BEGIN_OP expr QUIT EOF {printRegex();})
	; 

expr:
	CONST_ANYTHING
	| CONST_ALL
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


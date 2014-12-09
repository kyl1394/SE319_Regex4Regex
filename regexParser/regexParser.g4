grammar regexParser;

@header {
	import java.util.Stack;
}

//JAVA Code
@members{

	public static String regex = "(";

	public void add(String addition)
	{
		System.out.println("Addition:" + addition);
		regex += addition;
		System.out.println("Regex:" + regex);
	}

	public void printRegex()
	{
		System.out.println("Regex:" + regex + ")");
	}
}


//---------------------------
//     Lexer Rules
//---------------------------

CONST_ANYTHING : ('ANYTHING') {add(".*");};
CONST_START : ('START') {add("^");};
CONST_END : ('END') {add("$");};
OP_BETWEEN : ('between');
THEN : ('THEN') {add(")(");};
NOT : ('NOT') {add("!");};
OP_AND : ('and');
WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : [a-z] {add(getText());};
MULTIPLE_CHARS : [a-z]+ ;

//---------------------------
//     Parser Rules
//---------------------------

start:
	(expr EOF {printRegex();})
	; 

expr:
	CONST_ANYTHING
	| regex_char
	| regex_string
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
	 char_or_string OP_BETWEEN char_or_string OP_AND expr;
	

regex_char:
	single_quote SINGLE_CHAR single_quote;

regex_string:
	double_quote MULTIPLE_CHARS double_quote;

char_or_string:
	(regex_char | regex_string);

single_quote:
	'\'';

double_quote:
	'\"';


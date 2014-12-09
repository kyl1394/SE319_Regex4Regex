grammar regexParser;

@header {
	import java.util.Stack;
}

//JAVA Code
@members{

	public String regex = "";

	public void add(String addition)
	{
		System.out.println("Addition:" + addition);
		regex += addition;
		System.out.println("Regex:" + regex);
	}

	public void printRegex()
	{
		System.out.println("Regex:" + regex);
	}
}


//---------------------------
//     Lexer Rules
//---------------------------

CONST_ANYTHING : ('ANYTHING') {add(".*");};
OP_BETWEEN : ('between');
OP_AND : ('and');
WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : [a-z] {add(getText());};
MULTIPLE_CHARS : [a-z]+ ;

//---------------------------
//     Parser Rules
//---------------------------

start:
	(expr ';'{printRegex();})
	;

expr:
	CONST_ANYTHING
	| regex_char
	| regex_string
	| expr expr
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


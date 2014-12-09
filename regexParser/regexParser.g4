grammar regexParser;

@header {
	import java.util.Stack;
}

//JAVA Code
@members{
}


//---------------------------
//     Lexer Rules
//---------------------------

CONST_ANYTHING : ('ANYTHING') {System.out.print(".*");};
WS : [ \t\r\n]+ -> skip ;
SINGLE_CHAR : [a-z] {System.out.print(getText());};
MULTIPLE_CHARS : [a-z]+ ;

//---------------------------
//     Parser Rules
//---------------------------

start:
	(expr ';')
	;

expr:
	CONST_ANYTHING
	| SINGLE_CHAR
	| between_and
	;

between_and:
	 expr BETWEEN expr AND expr;
	

regex_char:
	single_quote SINGLE_CHAR single_quote;

regex_string:
	double_quote MULTIPLE_CHARS double_quote;

char_or_string:
	(regex_char | regex_string)

single_quote:
	'\'';

double_quote:


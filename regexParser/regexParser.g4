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
SINGLE_CHAR : [a-z] {};

//---------------------------
//     Parser Rules
//---------------------------

start:
	(expr ';')
	;

expr:
	regex_char CONST_ANYTHING regex_char;

regex_char:
	single_quote SINGLE_CHAR single_quote;

single_quote:
	'\'';


grammar regexParse;

@header {
	import java.util.stack;
}

//JAVA Code
@members{
}


//---------------------------
//     Lexer Rules
//---------------------------

CONST_ANYTHING : 'ANYTHING' -> .*;
WS : [ \t\r\n]+ -> skip ;

//---------------------------
//     Parser Rules
//---------------------------

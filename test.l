/*
** This is another simple example.
** This is used to detect numbers and words.
** Note that yytext is used to print what was matched and yyleng is used
** to number of characters in the matched string
*/

%{
#include <stdio.h>
#include "y.tab.h"
%}

%%
(select) return START;
(\ all) return ALL_STATEMENT;
(\ between\(\"[a-zA-Z0-9]+\"[,]\ \"[a-zA-Z0-9]+\"\)) return BETWEEN_STATEMENT;
(\;) return END;
%%

int yywrap(){ return 1;}
int main()
{
	int state = yylex();

	if (state == START) //START of statement
	{
		int end = 0;
		printf("Start of new statement\n");
		state = yylex();
		if (state == ALL_STATEMENT)
		{
			printf("Select all text");
			state = yylex();

			if (state == BETWEEN_STATEMENT)
			{
				printf(" btw %s", yytext);
			}
						
			if (state = END)
			{
				printf("\nEND\n\n");
			}
		}
	}

}

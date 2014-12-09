// Generated from regexParser.g4 by ANTLR 4.2

	import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regexParserParser}.
 */
public interface regexParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regexParserParser#regex_string}.
	 * @param ctx the parse tree
	 */
	void enterRegex_string(@NotNull regexParserParser.Regex_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#regex_string}.
	 * @param ctx the parse tree
	 */
	void exitRegex_string(@NotNull regexParserParser.Regex_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull regexParserParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull regexParserParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#double_quote}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quote(@NotNull regexParserParser.Double_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#double_quote}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quote(@NotNull regexParserParser.Double_quoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#single_quote}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quote(@NotNull regexParserParser.Single_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#single_quote}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quote(@NotNull regexParserParser.Single_quoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull regexParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull regexParserParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#between_and}.
	 * @param ctx the parse tree
	 */
	void enterBetween_and(@NotNull regexParserParser.Between_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#between_and}.
	 * @param ctx the parse tree
	 */
	void exitBetween_and(@NotNull regexParserParser.Between_andContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#char_or_string}.
	 * @param ctx the parse tree
	 */
	void enterChar_or_string(@NotNull regexParserParser.Char_or_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#char_or_string}.
	 * @param ctx the parse tree
	 */
	void exitChar_or_string(@NotNull regexParserParser.Char_or_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link regexParserParser#regex_char}.
	 * @param ctx the parse tree
	 */
	void enterRegex_char(@NotNull regexParserParser.Regex_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParserParser#regex_char}.
	 * @param ctx the parse tree
	 */
	void exitRegex_char(@NotNull regexParserParser.Regex_charContext ctx);
}
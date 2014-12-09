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
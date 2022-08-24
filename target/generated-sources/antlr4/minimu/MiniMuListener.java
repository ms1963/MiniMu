// Generated from minimu/MiniMu.g4 by ANTLR 4.3
package minimu;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniMuParser}.
 */
public interface MiniMuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull MiniMuParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull MiniMuParser.BooleanAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull MiniMuParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull MiniMuParser.IdAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniMuParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MiniMuParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMuParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MiniMuParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniMuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MiniMuParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MiniMuParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull MiniMuParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull MiniMuParser.AtomExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull MiniMuParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull MiniMuParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull MiniMuParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull MiniMuParser.NilAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniMuParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull MiniMuParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMuParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull MiniMuParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull MiniMuParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull MiniMuParser.AdditiveExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull MiniMuParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull MiniMuParser.RelationalExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull MiniMuParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull MiniMuParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull MiniMuParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull MiniMuParser.ParExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull MiniMuParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull MiniMuParser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull MiniMuParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull MiniMuParser.UnaryMinusExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull MiniMuParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull MiniMuParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull MiniMuParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull MiniMuParser.MultiplicationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniMuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniMuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniMuParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniMuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull MiniMuParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull MiniMuParser.Stat_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniMuParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(@NotNull MiniMuParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniMuParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(@NotNull MiniMuParser.WriteContext ctx);

	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull MiniMuParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull MiniMuParser.EqualityExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull MiniMuParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull MiniMuParser.AndExprContext ctx);
}
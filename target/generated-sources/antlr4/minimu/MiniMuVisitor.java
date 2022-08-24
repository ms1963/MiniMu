// Generated from minimu/MiniMu.g4 by ANTLR 4.3
package minimu;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniMuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniMuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull MiniMuParser.BooleanAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull MiniMuParser.IdAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniMuParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull MiniMuParser.StatContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniMuParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull MiniMuParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull MiniMuParser.AtomExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull MiniMuParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(@NotNull MiniMuParser.NilAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniMuParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull MiniMuParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull MiniMuParser.AdditiveExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull MiniMuParser.RelationalExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull MiniMuParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull MiniMuParser.ParExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull MiniMuParser.NotExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(@NotNull MiniMuParser.UnaryMinusExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniMuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull MiniMuParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull MiniMuParser.MultiplicationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniMuParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MiniMuParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniMuParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull MiniMuParser.Stat_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniMuParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(@NotNull MiniMuParser.WriteContext ctx);

	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull MiniMuParser.EqualityExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniMuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull MiniMuParser.AndExprContext ctx);
}
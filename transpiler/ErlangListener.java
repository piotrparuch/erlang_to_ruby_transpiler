// Generated from Erlang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErlangParser}.
 */
public interface ErlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErlangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ErlangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ErlangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ErlangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ErlangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(ErlangParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(ErlangParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#compile}.
	 * @param ctx the parse tree
	 */
	void enterCompile(ErlangParser.CompileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#compile}.
	 * @param ctx the parse tree
	 */
	void exitCompile(ErlangParser.CompileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ErlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ErlangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ErlangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ErlangParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(ErlangParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(ErlangParser.FuncDecContext ctx);
}
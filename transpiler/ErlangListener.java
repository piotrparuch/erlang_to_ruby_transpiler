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
	 * Enter a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ErlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ErlangParser.TypeContext ctx);
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
	 * Enter a parse tree produced by {@link ErlangParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(ErlangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(ErlangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ErlangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ErlangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ErlangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ErlangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ErlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ErlangParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ErlangParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ErlangParser.TupleContext ctx);
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
	 * Enter a parse tree produced by {@link ErlangParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ErlangParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ErlangParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(ErlangParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(ErlangParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(ErlangParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(ErlangParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ErlangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ErlangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ErlangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ErlangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(ErlangParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(ErlangParser.If_statContext ctx);
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
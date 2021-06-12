
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ErlangBaseListenerChild extends ErlangBaseListener{

    String ruby_code = "";
    int tabs = 0;

    public void add_code(String code){
        ruby_code += code;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterProgram(ErlangParser.ProgramContext ctx) {
        enterModule(ctx.module());
        enterCompile(ctx.compile());
        for (ErlangParser.FuncDecContext context: ctx.funcDec()) {
            enterFuncDec(context);
        }

    }


   @Override public void exitProgram(ErlangParser.ProgramContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterModule(ErlangParser.ModuleContext ctx){

    }

    @Override public void enterDeclaration(ErlangParser.DeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclaration(ErlangParser.DeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr(ErlangParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr(ErlangParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunc(ErlangParser.FuncContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunc(ErlangParser.FuncContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFuncDec(ErlangParser.FuncDecContext ctx) {
        ruby_code += "essasito";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFuncDec(ErlangParser.FuncDecContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

}

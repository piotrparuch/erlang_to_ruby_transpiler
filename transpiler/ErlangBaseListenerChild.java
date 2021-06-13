
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ErlangBaseListenerChild extends ErlangBaseListener{

    String ruby_code = "";
    int tabs = 0;

    public void add_code(String code){
        ruby_code += code;
    }

    @Override public void enterProgram(ErlangParser.ProgramContext ctx) {
        System.out.println("elo");
        listenModule(ctx.module());
        listenCompile(ctx.compile());
        for (ErlangParser.FuncDecContext context: ctx.funcDec()) {
            listenFuncDec(context);
        }
    }


   @Override public void exitProgram(ErlangParser.ProgramContext ctx) { }


    public void listenModule(ErlangParser.ModuleContext ctx){

    }

    public void listenCompile(ErlangParser.CompileContext ctx){

    }

    public void listenDeclaration(ErlangParser.DeclarationContext ctx) {

    }

    public void listenExpr(ErlangParser.ExprContext ctx) {
        ruby_code += ctx.getText();
    }

    public void listenFunc(ErlangParser.FuncContext ctx) { }

    public void listenRead(ErlangParser.ReadContext ctx){
        ruby_code += "gets.chomp(";
        ruby_code += ctx.String().getText();
        ruby_code += ")";
    }

    public void listenPrint(ErlangParser.PrintContext ctx){
        ruby_code += "puts(";
        String text = ctx.String().getText();
        int varIndex = ctx.String().getText().indexOf("~w");
        int separatorIndex = text.indexOf(",");
        String varName = text.substring(separatorIndex + 3);
        ruby_code += text.substring(0, varIndex);
        ruby_code += "#{";
        ruby_code += varName;
        ruby_code += "}";
        ruby_code += text.substring(varIndex + 2, separatorIndex);
        ruby_code += ")";
    }

    public void listenBody(ErlangParser.BodyContext ctx) {
//        System.out.println(ctx.getRuleContext());
//        for (int i=0;i<=ctx.getRuleContexts().size();) {
//
//        }
//        if (ctx.getRuleContext() instanceof ErlangParser.ExprContext){
//            listenExpr(ctx.expr());
//        }
//        else if(ctx.getRuleContext() instanceof ErlangParser.DeclarationContext){
//            listenDeclaration(ctx.declaration());
//        }
//        else if(ctx.getRuleContext() instanceof ErlangParser.PrintContext){
//            listenPrint(ctx.print());
//        }
    }

    public void listenFuncDec(ErlangParser.FuncDecContext ctx) {
        ruby_code += "def ";
        ruby_code += ctx.func(0).funcName().Module_name().getText()+"(";
        for (ErlangParser.ExprContext expr: ctx.func(0).funcName().expr()) {
            ruby_code += "";
        }
        ruby_code += ")";
        ruby_code += "\n";
        ruby_code += "  ";
        listenBody(ctx.func(0).body());
        ruby_code += "end";
        ruby_code += "\n";
        ruby_code += "\n";
    }

    public void listenEveryRule(ParserRuleContext ctx) { }

    public void listenTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }

}

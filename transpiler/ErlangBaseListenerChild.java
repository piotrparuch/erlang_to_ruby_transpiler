
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
        if (ctx.Var() != null){

        }
        if (ctx.tuple() != null){
            listenTuple(ctx.tuple());
            ruby_code += " = ";
            if (ctx.read() != null){
                listenRead(ctx.read());
            }
        }
        if (ctx.list() != null){
            listenList(ctx.list());
        }
    }

    private void listenList(ErlangParser.ListContext ctx) {
    }

    private void listenTuple(ErlangParser.TupleContext ctx) {
        if (ctx.children.get(1).toString().equals("ok")){
            ruby_code += ctx.children.get(3);
        }
    }

    public void listenExpr(ErlangParser.ExprContext ctx) {
        if (ctx.operation() != null){
            listenOperation(ctx.operation());
        }
        if (ctx.declaration() != null){
            listenDeclaration(ctx.declaration());
        }
        if (ctx.print() != null){
            listenPrint(ctx.print());
        }
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
        //ruby_code += text.substring(varIndex + 2, separatorIndex);
        ruby_code += ")";
    }

    public void listenOperation(ErlangParser.OperationContext ctx){
        ruby_code += ctx.getText();
    }

    public void listenBody(ErlangParser.BodyContext ctx) {
        for (ErlangParser.ExprContext expr: ctx.expr()) {
            listenExpr(expr);
            ruby_code += "\n";
        }
    }

    public void listenFuncDec(ErlangParser.FuncDecContext ctx) {
        ruby_code += "def ";
        ruby_code += ctx.func(0).funcName().Name().getText()+"(";
        for (ErlangParser.ArgContext arg: ctx.func(0).funcName().arg()) {
            ruby_code += "";
        }
        ruby_code += ")";
        ruby_code += "\n";
        ruby_code += "  ";
        for (ErlangParser.FuncContext func: ctx.func()) {
            listenBody(func.body());
        }
        ruby_code += "\n";
        ruby_code += "end";
        ruby_code += "\n";
        ruby_code += "\n";
    }

    public void listenEveryRule(ParserRuleContext ctx) { }

    public void listenTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }

}

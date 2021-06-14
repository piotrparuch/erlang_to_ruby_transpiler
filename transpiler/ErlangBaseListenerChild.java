
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Locale;

public class ErlangBaseListenerChild extends ErlangBaseListener{

    String ruby_code = "";
    int tabs = 0;

    public void add_code(String code){
        ruby_code += code;
    }

    public void add_tabs(){
        for (int i=0;i<tabs;i++)
        ruby_code += "  ";
    }

    @Override public void enterProgram(ErlangParser.ProgramContext ctx) {
        listenModule(ctx.module());
        listenCompile(ctx.compile());
        for (ErlangParser.FuncDecContext context: ctx.funcDec()) {
            listenFuncDec(context);
        }
        listenMain(ctx.main());
    }


   @Override public void exitProgram(ErlangParser.ProgramContext ctx) { }


    public void listenModule(ErlangParser.ModuleContext ctx){

    }

    public void listenCompile(ErlangParser.CompileContext ctx){

    }

    public void listenDeclaration(ErlangParser.DeclarationContext ctx) {
        if (ctx.Var() != null){
            ruby_code += ctx.Var().getText().toLowerCase();
            ruby_code += " = ";
            if (ctx.read() != null){
                listenRead(ctx.read());
            }
            if (ctx.type() != null){
                listenType(ctx.type());
            }
        }
        if (ctx.tuple() != null){
            listenTuple(ctx.tuple());
            ruby_code += " = ";
            if (ctx.read() != null){
                listenRead(ctx.read());
            }
            if (ctx.type() != null){
                listenType(ctx.type());
            }
        }
        if (ctx.list() != null){
            listenList(ctx.list());
        }
    }

    private void listenType(ErlangParser.TypeContext ctx) {
        ruby_code += ctx.getText().toLowerCase();
    }

    private void listenList(ErlangParser.ListContext ctx) {
    }

    private void listenTuple(ErlangParser.TupleContext ctx) {
        if (ctx.children.get(1).toString().equals("ok")){
            ruby_code += ctx.children.get(3).toString().toLowerCase();
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
        if (ctx.type() != null){
            ruby_code += "return ";
            listenType(ctx.type());
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
        String textFull = ctx.getText();
        String text = ctx.children.get(2).getText();

        if (textFull.contains("~w")) {
            int varIndex = text.indexOf("~w");
            int separatorIndex = textFull.indexOf(",");
            int closeBrackIndex = textFull.indexOf("]");
            String varName = textFull.substring(separatorIndex + 2, closeBrackIndex);
            varName = varName.toLowerCase();
            ruby_code += text.substring(0, varIndex);
            ruby_code += "#{";
            ruby_code += varName;
            ruby_code += "}\"";
        }
        else
            ruby_code += text;

        ruby_code += ")";
    }

    public void listenOperation(ErlangParser.OperationContext ctx){
        ruby_code += ctx.getText().toString().toLowerCase();
    }

    public void listenBody(ErlangParser.BodyContext ctx) {
        tabs += 1;
        for (ErlangParser.LineContext line: ctx.line()) {
            add_tabs();
            listenLine(line);
            ruby_code += "\n";
        }
        tabs -= 1;
    }

    private void listenLine(ErlangParser.LineContext ctx) {
        if (ctx.expr() != null){
            listenExpr(ctx.expr());
        }
        if (ctx.if_stat() != null){
            listenIf_stat(ctx.if_stat());
        }
        if (ctx.funcName() != null){
            ruby_code += "return ";
            listenFuncName(ctx.funcName());
        }
    }

    private void listenFuncName(ErlangParser.FuncNameContext ctx) {
        ruby_code += ctx.Name().getText();
        ruby_code += '(';
        for (ErlangParser.ArgContext arg: ctx.arg()) {
            ruby_code += arg.getText();
            if (arg != ctx.arg().get(ctx.arg().size()-1)){
                ruby_code += ", ";
            }
        }
        ruby_code += ')';
    }

    private void listenIf_stat(ErlangParser.If_statContext ctx) {
        ruby_code += "if ";
        listenOperation(ctx.operation(0));
        ruby_code += "\n";
        tabs += 1;
        add_tabs();
        listenExpr(ctx.expr(0));
        ruby_code += "\n";
        tabs -= 1;
        add_tabs();
        if (ctx.operation().size() > 1){
            for (int i = 1;i < ctx.operation().size(); i++){
                ruby_code += "elsif ";
                listenOperation(ctx.operation(i));
                ruby_code += "\n";
                tabs += 1;
                add_tabs();
                listenExpr(ctx.expr(i));
                ruby_code += "\n";
                tabs -= 1;
                add_tabs();
            }
        }
        ruby_code += "else";
        ruby_code += "\n";
        tabs += 1;
        add_tabs();
        listenExpr(ctx.expr(ctx.expr().size()-1));
        ruby_code += "\n";
        tabs -= 1;
        add_tabs();
        ruby_code += "end";
    }

    public void listenFuncDec(ErlangParser.FuncDecContext ctx) {
        ruby_code += "def ";
        ruby_code += ctx.func(0).funcName().Name().getText()+"(";
        for (ErlangParser.ArgContext arg: ctx.func(0).funcName().arg()) {
            ruby_code += arg.getText().toLowerCase();
            if (arg != ctx.func(0).funcName().arg().get(ctx.func(0).funcName().arg().size()-1)){
                ruby_code += ", ";
            }
        }
        ruby_code += ")";
        ruby_code += "\n";
        for (ErlangParser.FuncContext func: ctx.func()) {
            listenBody(func.body());
        }
        ruby_code += "end";
        ruby_code += "\n";
        ruby_code += "\n";
    }

    public void listenMain(ErlangParser.MainContext ctx){
        for (ErlangParser.LineContext line: ctx.body().line()) {
            listenLine(line);
            ruby_code += "\n";
        }
        ruby_code += "\n";
    }

    public void listenEveryRule(ParserRuleContext ctx) { }

    public void listenTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }

}

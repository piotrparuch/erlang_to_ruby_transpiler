import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import static org.antlr.v4.runtime.CharStreams.fromStream;

import java.io.*;

public class ErlangToRubyTranspiler {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("program.rb"));
        String filename = args[0];
        File input = new File(filename);
        InputStream inputStream = new FileInputStream(input);
        ErlangLexer tokenizer = new ErlangLexer(fromStream(inputStream));

        CommonTokenStream tokens = new CommonTokenStream(tokenizer);
        ErlangParser parser = new ErlangParser(tokens);
        ParseTree tree = parser.declaration();
        ParseTreeWalker walker = new ParseTreeWalker();
        ErlangBaseListenerChild listener = new ErlangBaseListenerChild();
        walker.walk(listener, tree);

        bufferedWriter.write(listener.ruby_code);
        bufferedWriter.close();

    }
}

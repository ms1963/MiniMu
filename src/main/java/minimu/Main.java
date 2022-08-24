package minimu;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/minimu/test.minimu"};
        }

        System.out.println("parsing: " + args[0]);

        MiniMuLexer lexer = new MiniMuLexer(new ANTLRFileStream(args[0]));
        MiniMuParser parser = new MiniMuParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}

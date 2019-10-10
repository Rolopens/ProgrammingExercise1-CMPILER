import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.List;

public class AntlrChecker {

    public boolean check(CharStream streamInput){
        try {
            HelloLexer helloLexer = new HelloLexer(streamInput);
            helloLexer.removeErrorListeners();
            helloLexer.addErrorListener(ThrowingErrorListener.INSTANCE);

            CommonTokenStream commonTokenStream = new CommonTokenStream(helloLexer);

            HelloParser helloParser = new HelloParser(commonTokenStream);
            helloParser.removeErrorListeners();
            helloParser.addErrorListener(ThrowingErrorListener.INSTANCE);

//            System.out.println(helloParser.r());
            helloParser.r();
            return true;
        }catch (ParseCancellationException e){
            return false;
        }
    }

    public void checkInputs(List<String> inputs){
        CharStream inputStream;
        for(int i = 0; i < inputs.size(); i++){
            inputStream = CharStreams.fromString(inputs.get(i));

            if(check(inputStream)){
                System.out.println("ACCEPT INPUT : " + inputs.get(i));
            } else {
                System.out.println("REJECT INPUT : " + inputs.get(i));
            }
        }
    }
}

class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}

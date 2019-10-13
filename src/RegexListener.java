// Generated from C:/Users/Rolo/Documents/GitHub/ProgrammingExercise1-CMPILER/grammar\Regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegexParser}.
 */
public interface RegexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegexParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(RegexParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(RegexParser.SContext ctx);
}
// Generated from Simple.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull SimpleParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull SimpleParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull SimpleParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull SimpleParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull SimpleParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull SimpleParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull SimpleParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull SimpleParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull SimpleParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull SimpleParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainStatement}
	 * labeled alternative in {@link SimpleParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(@NotNull SimpleParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainStatement}
	 * labeled alternative in {@link SimpleParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(@NotNull SimpleParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(@NotNull SimpleParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(@NotNull SimpleParser.MethodbodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code programPartDefinitionMethod}
	 * labeled alternative in {@link SimpleParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterProgramPartDefinitionMethod(@NotNull SimpleParser.ProgramPartDefinitionMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programPartDefinitionMethod}
	 * labeled alternative in {@link SimpleParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitProgramPartDefinitionMethod(@NotNull SimpleParser.ProgramPartDefinitionMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#callList}.
	 * @param ctx the parse tree
	 */
	void enterCallList(@NotNull SimpleParser.CallListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#callList}.
	 * @param ctx the parse tree
	 */
	void exitCallList(@NotNull SimpleParser.CallListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull SimpleParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull SimpleParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull SimpleParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull SimpleParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull SimpleParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull SimpleParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code min}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMin(@NotNull SimpleParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code min}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMin(@NotNull SimpleParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(@NotNull SimpleParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(@NotNull SimpleParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull SimpleParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull SimpleParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull SimpleParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull SimpleParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull SimpleParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull SimpleParser.MethodCallContext ctx);
}
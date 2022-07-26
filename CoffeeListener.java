// Generated from Coffee.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoffeeParser}.
 */
public interface CoffeeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoffeeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoffeeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(CoffeeParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(CoffeeParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_decl(CoffeeParser.Global_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_decl(CoffeeParser.Global_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CoffeeParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CoffeeParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(CoffeeParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(CoffeeParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CoffeeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CoffeeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(CoffeeParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(CoffeeParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(CoffeeParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(CoffeeParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(CoffeeParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(CoffeeParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CoffeeParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CoffeeParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoffeeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoffeeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eval}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEval(CoffeeParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eval}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEval(CoffeeParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CoffeeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CoffeeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(CoffeeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(CoffeeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(CoffeeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(CoffeeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CoffeeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CoffeeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CoffeeParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CoffeeParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak(CoffeeParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak(CoffeeParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue(CoffeeParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue(CoffeeParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pass}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPass(CoffeeParser.PassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pass}
	 * labeled alternative in {@link CoffeeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPass(CoffeeParser.PassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#loop_var}.
	 * @param ctx the parse tree
	 */
	void enterLoop_var(CoffeeParser.Loop_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#loop_var}.
	 * @param ctx the parse tree
	 */
	void exitLoop_var(CoffeeParser.Loop_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(CoffeeParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(CoffeeParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoffeeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoffeeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(CoffeeParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(CoffeeParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CoffeeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CoffeeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#bool_lit}.
	 * @param ctx the parse tree
	 */
	void enterBool_lit(CoffeeParser.Bool_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#bool_lit}.
	 * @param ctx the parse tree
	 */
	void exitBool_lit(CoffeeParser.Bool_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(CoffeeParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(CoffeeParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(CoffeeParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(CoffeeParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#low}.
	 * @param ctx the parse tree
	 */
	void enterLow(CoffeeParser.LowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#low}.
	 * @param ctx the parse tree
	 */
	void exitLow(CoffeeParser.LowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#high}.
	 * @param ctx the parse tree
	 */
	void enterHigh(CoffeeParser.HighContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#high}.
	 * @param ctx the parse tree
	 */
	void exitHigh(CoffeeParser.HighContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoffeeParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(CoffeeParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoffeeParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(CoffeeParser.StepContext ctx);
}
package stack;

public class EvaluationOfPostfix {

	
	public static void main(String[] args) {
		String postfix = "";
		
		evaluate(postfix);
	}

	/*
	 * 1] create empty stack st.
	 * 2] traverse through every symbol x of given postfix  
	 *  i] if x is operand, push to st.
	 *  else (x is oeprator)
	 *    i] op1=st.pop()
	 *    ii] op2=st.pop()
	 *    iii] compute op2 x op1 and push the result to stack
	 * 3] return st.top()
	 * 
	 */
	private static void evaluate(String postfix) {
		
	}
}

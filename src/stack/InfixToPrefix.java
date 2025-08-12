package stack;

public class InfixToPrefix {

	public static void main(String[] args) {
		String infix="";
		converToPrefix(infix);
	}

	
	/*
	 * 1] create empty stack st
	 * 2] create empty string prefix
	 * 3] do following for every character c from right to left
	 * 4] if c is :
	 *     a] operand: push it to prefix
	 *     b] right parenthesis: push to st
	 *     c] left parenthesis:  pop from st until right parenthesis is found. 
	 *           append the popped chracter to prefix
	 *     d]operator: if st is empty push c to st. else compare with st top
	 *        i] higher precedence (than st top) , push c to st
	 *        ii] lower precedence: pop st top & append the popped  item to prefix
	 *             unitl a higher prcedence operator is found (on st becomes empty)
	 *               push c to st
	 *        iii] equal precedence: use associativity
	 * 5] pop everything from st & append to prefix
	 * 6] return reverse of prefix
	 */
	private static void converToPrefix(String infix) {
		
	}
}

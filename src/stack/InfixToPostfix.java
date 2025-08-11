package stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String infix = "a+b*c";
		//output:  abc*+
		
		String postfix = convertToPostfix(infix);
		System.out.println("postfix: "+ postfix);
	}

	/*
	 * create a stack
	 * 
	 * do following for every char x from left to right
	 * 
	 * if x is:
	 *  operand: output is
	 *  left parenthesis: push to stack
	 *  right parenthesis: pop from stack until left parenthesis is found. output the popped chars
	 *  operator:  if stack empty push x to stack else compare with stack top
	 *       i] higher precednece than top , push to stack
	 *       ii] lower precendence, pop stack top & output until a lower precendence operator is found , then push to stack
	 *       iii] equal precedence, use associativity & output everything from stack
	 * 
	 */
	private static String convertToPostfix(String str) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		
		return sb.toString();
	}
}

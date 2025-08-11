package stack;

import java.util.Stack;

public class EvaluaionOfPrefix {

	public static void main(String[] args) {
		String str ="+ * 10 2 3";
		//output: 23
		
		evaluate(str);
	}

	private static void evaluate(String str) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ')
				continue;
			else if(Character.isDigit(str.charAt(i))) {
				stack.push((int)str.charAt(i));
			}
			else if(isOperator(str.charAt(i))) {
				int o1 = stack.peek();
				int o2 = stack.peek();
				
				switch (str.charAt(i)) {
                case '+':
                    stack.push(o1 + o2);
                    break;
                case '-':
                    stack.push(o1 - o2);
                    break;
                case '*':
                    stack.push(o1 * o2);
                    break;
                case '/':
                    stack.push(o1 / o2);
                    break;
                }
			}
			
		}
		System.out.println(stack.peek());
	}
	
	 public static boolean isOperator(char ch) {
	        String operators = "+-*/%^="; // Define your operators
	        return operators.indexOf(ch) != -1; // Check if the character exists in the string
	    }
}

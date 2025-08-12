package stack;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static void main(String[] args) {
		
		String str = "({}{{(([]))}}";
		
		boolean isBalancedParenthesis = isBalancedParenthesis(str, str.length());
		System.out.println("isBalancedParenthesis: "+ isBalancedParenthesis);
	}

	/*
	 * tc: O(n)
	 * sc: O(n)
	 */
	private static boolean isBalancedParenthesis(String str, int n) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<n;i++) {
			char ch= str.charAt(i);
			if(ch =='{' || ch =='[' || ch =='(' )
				stack.push(ch);
			else {
				if(stack.isEmpty()==true)
					return false;
				else if(matching(stack.peek(), ch)==false)
					return false;
				else
					stack.pop();
			}
		}
		return stack.isEmpty();
	}

	private static boolean matching(char a, char b) {
		
		return  (a=='(' && b==')') ||
				(a=='{' && b=='}') ||
				(a=='[' && b==']') ;
				
	}
}

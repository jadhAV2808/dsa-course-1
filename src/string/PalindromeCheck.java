package string;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String str = "ABCDCBA";
		
		boolean isPalindrome = isPalindrome(str);		
		System.out.println("isPalindrome: "+isPalindrome );
		
		
		isPalindrome = isPalindrome1(str);		
		System.out.println("isPalindrome: "+isPalindrome );
		
	}
	
	
	/*
	 * naive:
	 * O(n):  time
	 * O(n):aux space
	 */
	private static boolean isPalindrome1(String str) {
		String temp = new StringBuilder(str).reverse().toString();		
		return temp.equals(str);
	}

	/*
	 * efficient
	 * tc: O(n)
	 * sc: O(1)
	 */
	private static boolean isPalindrome(String str) {	
		int start =0, end = str.length()-1;
		while(start<end) {
			if(str.charAt(start)!= str.charAt(end))
				return false;
			start++;
			end--;
		}	
		return true;
	}
}

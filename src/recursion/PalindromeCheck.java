package recursion;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String str = "abbcbba";
		boolean isPalindrome = isPalindrome(str, 0, str.length()-1);
		
		System.out.println("isPalindrome: "+ isPalindrome);
	}

	private static boolean isPalindrome(String str, int start, int end) {
		
		if(start >= end)
			return true;
		
		return str.charAt(start) == str.charAt(end)
				&& isPalindrome(str, start+1, end-1);
	}
}

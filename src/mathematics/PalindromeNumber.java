package mathematics;

/*
 * PalindromeNumber = if you read from left to right is same as if you read from right to left.
 * single digit is always palindrome
 */

public class PalindromeNumber {
	
	public static void main(String[] args) {
		boolean b = isPalindrome(78987);
		System.out.println("isPAlindomre: "+ b);
		
		
		b = palindromeCheck(78987);
		System.out.println("isPAlindomre: "+ b);
	}

	private static boolean palindromeCheck(int n) {
		int temp = n;
		int rev = 0,  rem= 0;
		while(temp != 0) {
			rem = temp%10;
			rev = rev * 10 + rem;
			temp =temp/10;
		}
		return n==rev;
	}

	private static boolean isPalindrome(int n) {
		String string  = String.valueOf(n);
		int start = 0, end = string.length()-1;
		while(start<end) {
			if(string.charAt(start)!= string.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

}

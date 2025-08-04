package recursion;

/*
 * for string of length n there will be n! permutations
 */

public class AllPermutations {

	public static void main(String[] args) {
		String str = "ABC";
		
		printPermutations(0, str);
	}

	private static void printPermutations(int n, String str) {
		
		String str1 = str+ str;
		for(int i=0;i<str1.length();i++) {
			
		}
	}
}

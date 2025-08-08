package string;

/*
 * Subsequence: obtained by removing one or more chars 
 *              but keeping order as it is
 */

public class SubsequenceCheck {

	public static void main(String[] args) {
		String s1="ABCD";
		String s2 = "AD";
		
		boolean isSubSeq = isSubSeq(s1,s2);
		System.out.println("isSubSeq: "+ isSubSeq);
	}
	

	/*
	 * naive: generating all subseq and then matching each one with s2.
	 * tc:  O(2^*n *n)
	 * sc:
	 */
	private static boolean isSubSeq1(String s1, String s2) {
		
		
		return false;
	}
	
	/*
	 * efficient - using pointers for both s1 & s2 
	 * and comparing chars
	 * 
	 * tc:O(n+m)
	 * sc:O(1)
	 */
	private static boolean isSubSeq(String s1, String s2) {
		int j=0;
		
		for(int i=0;i< s1.length() &&  j<s2.length(); i++) {
			if(s1.charAt(i)==s2.charAt(j))
				j++;
		}
		return (j==s2.length());
	}
}

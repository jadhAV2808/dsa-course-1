package string;

import java.util.Arrays;

public class AnagramSearch {
	
	static final int CHAR=256;

	public static void main(String[] args) {
		
		String txt  = "geeksforgeeks";
		String pat = "frog";  //true
		String pat1 = "rseek"; // false (not contiguous)
		
		boolean isPresent  = isPresent1(txt, pat1);
		System.out.println("isPresent: "+isPresent);
	}
	
	
	
	/*
	 * naive
	 */
	private static boolean isPresent1(String txt, String pat) {
		
		int[] ct=new int[CHAR];
		int[] cp=new int[CHAR];
		
		int m = pat.length();
        int n = txt.length();

        if (m > n)
            return false;
		
		for(int i=0;i<m;i++) {
			ct[txt.charAt(i)]++;
			cp[pat.charAt(i)]++;
		}
		for(int i=m; i<n;i++) {
			if(areSame(cp,ct))
				return true;
			ct[txt.charAt(i)]++;
			ct[txt.charAt(i-m)]--;
		}
		
		// Check the last window
        return areSame(cp, ct);
	}
	

	private static boolean areSame(int[] cp, int[] ct) {
		return Arrays.equals(cp, ct);
	}



	/*
	 * naive
	 */
	private static boolean isPresent(String txt, String pat) {
		int m=pat.length();
		int n=txt.length();
		for(int i=0;i<=n-m;i++) {
			if(areAnagram(pat, txt,i))
				return true;
		}
		return false;
	}

	
	private static boolean areAnagram(String pat, String txt, int i) {
		int[] count = new int[CHAR];
		
		for(int j=0;j<pat.length();j++) {
			count[pat.charAt(j)]++;
			count[txt.charAt(i+j)]--;
			
		}
		for(int j=0;j<CHAR;j++) {
			if(count[j]!=0)
				return false;
		}		
		return true;
		
	}
	
	
	
}

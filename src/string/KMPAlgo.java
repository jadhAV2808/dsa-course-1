package string;

import java.util.Arrays;

/*
 * proper prefix/suffix = less than input str
 */

public class KMPAlgo {

	public static void main(String[] args) {
		
		String str = "ababc";
		//LPS:longest proper prefix suffix:: ""
		//LPS[]=> [0,0,1,2,0]
		int[] lps = new int[str.length()];
		
		fillLPS(str, lps);
		System.out.println(Arrays.toString(lps));
	}
	
	static int longestProperPrefixSuffix(String str, int n) {
		
		for(int len =n-1;len>0;len--) {
			boolean flag =true;
			
			for(int i=0;i<len;i++) {
				if(str.charAt(i)!=str.charAt(n-len+i))
					flag=false;
			}
			if(flag)
				return len;
		}
		
		return 0;
	}
	
	static void fillLPS(String str, int[] lps) {
		for(int i=0;i<str.length();i++) {
			lps[i]=longestProperPrefixSuffix(str, i+1);
		}
	}
}

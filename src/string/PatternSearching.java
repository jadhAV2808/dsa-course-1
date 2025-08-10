package string;
/*
 * m-pattenr length, n-txt length
 * 
 * Naive algo : O((n-m+1)*m) 
 * 
 * Rabin karb algo: O((n-m+1)*m)
 * 
 * KMP algo: O(n)
 * 
 * suffix tree: O(m)
 */

public class PatternSearching {

	public static void main(String[] args) {
		String txt  = "GEEKSFORGEEKS";
		String pat = "EKS";             
		//o/p: 2 10
		
//		search(txt,pat);
		
		String txt1 = "ABCABCDABCD";
		String pat1 = "ABCD";
		//o/p: 3 7
		search1(txt1, pat1);
		
	}

	
	
	/*
	 * naive pattern searching algo
	 * tc: O((n-m+1)*m)
	 * 
	 */
	private static void search(String txt, String pat) {
		int m=pat.length();
		int n=txt.length();
		for(int i=0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(pat.charAt(j)!=txt.charAt(i+j))
					break;
			}
			if(j==m)
				System.out.print(i +" ");
		}
	}
	
	
	/*
	 * improved naive pattern searching algo 
	 * for distinct chars in pattern
	 * tc: O((n)
	 * 
	 */
	private static void search1(String txt, String pat) {
		int m=pat.length();
		int n=txt.length();
		for(int i=0;i<=n-m;) {  //skiping incremeting i here
			int j;
			for(j=0;j<m;j++) {
				if(pat.charAt(j)!=txt.charAt(i+j))
					break;
			}
			if(j==m)
				System.out.print(i +" ");
			if(j==0)
				i++;   //bocz all pat chars are distinct
			else
				i=(i+j);
		}
	}
}

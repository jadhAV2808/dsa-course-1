package hashing;

/*
 * function that take 2 binary arrays of same size 
 * & find length of the longest common sub-array with the same sum
 */

public class LongestCommonSPan {

	public static void main(String[] args) {
		int[] a1= {0,1,0,0,0,0};
		int[] a2= {1,0,1,0,0,1};
		int n=a1.length;
		
		int len = maxCommon(a1,a2,n);
		System.out.println("len: "+ len);
	}
	
	/*
	 * effficient
	 * 
	 * tc->O(n)
	 * sc->O(n)
	 * 
	 * 1]compute difference arr temp[]
	 * 2]return lenght of the longest sub-arr with sum 0 in temp[]
	 */
	private static int maxCommon2(int[] a1, int[] a2, int n) {
		int res = 0;
		
		return res;
	}

	/*
	 * naive
	 * tc->O(n^2)
	 * sc->O(1)
	 */
	private static int maxCommon(int[] a1, int[] a2, int n) {
		int res = 0;
		
		for(int i=0;i<n;i++) {
			int sum1=0, sum2=0;
			
			for(int j=i;j<n;j++) {
				sum1+=a1[j];
				sum2+=a2[j];
				
				if(sum1==sum2)
					res=Math.max(res, j-i+1);
			}
		}
		
		
		return res;
	}
}

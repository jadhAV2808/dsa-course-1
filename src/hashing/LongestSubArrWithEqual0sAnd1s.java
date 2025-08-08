package hashing;

public class LongestSubArrWithEqual0sAnd1s {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,1,0,0};
		int n=arr.length;
		
		int len= longestLengthSubArr(arr,n);
		System.out.println("len:"+ len);
		
	}
	
	
	/*
	 * efficient
	 * will repalce 0 with -1 and 
	 * then  we can use longest sub arr with sum 0
	 */
	private static int longestLengthSubArr1(int[] arr, int n) {
		int res =0;
		
		
		return res;
		
	}

	/*
	 * naive
	 * tc->O(n^2)
	 */
	private static int longestLengthSubArr(int[] arr, int n) {
		int res =0;
		
		for(int i=0;i<n;i++) {
			int c0=0, c1=0;
			for(int j=i;j<n;j++) {
				if(arr[j]==0)
					c0++;
				else
					c1++;
			}
			if(c0==c1)
				res=Math.max(res, c0+c1);
		}
		
		return res;
	}
}

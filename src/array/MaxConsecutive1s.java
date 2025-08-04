package array;

public class MaxConsecutive1s {

	public static void main(String[] args) {
		int[] arr = {0,1,0,1,1,1,1,0,1,1,1,0,0,1};
		int n = arr.length;
		
		int max = findConsecutive1s(arr, n);
		System.out.println("max: "+ max);
		
		 max = findConsecutive1s1(arr, n);
		 System.out.println("max: "+ max);
	}
	
	/*
	 * naive
	 */
	private static int findConsecutive1s(int[] arr, int n) {
		int res = 0;
		for(int i=0; i<n; i++) {
			int cnt = 0;
			for(int j=i+1; j<n; j++) {
				if(arr[j]==1)
					cnt++;
				else break;
			}
			res = Math.max(res, cnt);
		}
		
		return res;
	}

	/*
	 * Efficient
	 */
	private static int findConsecutive1s1(int[] arr, int n) {
		int cnt = 0;
		int max = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				cnt++;
				max = Math.max(max, cnt);
			}
			else {
				cnt = 0;
			}
			
		}
		return max;
	}
}

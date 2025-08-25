package dp;

public class LongestIncreasingSubSeq {

	public static void main(String[] args) {
		int[] arr = {3,4,2,8,10};
		int n=arr.length;
		
		int cnt = longestIncreasingsubSeq(arr, n);
		System.out.println("cnt: "+ cnt);
		
		cnt = longestIncreasingsubSeq1(arr, n);
		System.out.println("cnt: "+ cnt);
	}
	

	/*
	 * better in (n logn)
	 * tc: O(n long n)
	 * sc:O(n)
	 */
	private static int longestIncreasingsubSeq1(int[] arr, int n) {
		int tail[]=new int[n];
		int len=1;
		tail[0]=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>tail[len-1]) {
				tail[len]=arr[i];
				len++;
			}else {
				int c = ceilIndex(tail, 0, len-1,arr[i]);
				tail[c]=arr[i];
			}		
		}
		
		return len;
	}
	

	private static int ceilIndex(int[] tail, int l, int r, int x) {
		while(r>l) {
			int m=l+(r-1)/2;
			if(tail[m]>=x)
				r=m;
			else
				l=m+1;
		}
		return r;
	}


	private static int longestIncreasingsubSeq(int[] arr, int n) {
		int[] lis = new int[n];
		lis[0]=1;
		for(int i=1;i<n;i++) {
			lis[i]=1;
			
			for(int j=0;j<i;j++) {
				
				if(arr[j]<arr[i])
					lis[i] = Math.max(lis[i], lis[j]+1);
			}
		}
		int res=lis[0];
		for(int i=0;i<n;i++) {
			res= Math.max(res, lis[i]);
		}
		return res;
	}
}

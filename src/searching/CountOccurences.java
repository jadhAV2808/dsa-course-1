package searching;

public class CountOccurences {

	public static void main(String[] args) {
		int[] arr = {5,10,10,15,15,15,20,20};
		int n =arr.length;
		int x =15;
		int cnt = count(arr,n,x);
		System.out.println("cnt: "+ cnt);
		
		cnt = count1(arr,n,x);
		System.out.println("cnt: "+ cnt);
	}

	/*
	 * naive
	 */
	private static int count(int[] arr, int n, int x) {
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
				cnt++;
		}
		return cnt;
	}
	
	/*
	 * efficient
	 */
	private static int count1(int[] arr, int n, int x) {
		int first = firstIndex(arr,n,x);
		if(first==-1)
			return 0;
		else {
			int last = lastIndex(arr,n,x);
			return (last-first+1);
		}
	}

	private static int firstIndex(int[] arr, int n, int x) {
		int lo =0, hi=n-1;
		while(lo<hi) {
			int mid =(hi+lo)/2;
			
			if(arr[mid]>x)
				hi=mid-1;
			else if(arr[mid]<x)
				lo=mid+1;
			else {
				if(mid == n-1 || arr[mid]!=arr[mid-1])
					return mid;
				else
					hi =mid-1;
			}
		}
		return -1;
	}

	private static int lastIndex(int[] arr, int n, int x) {
		int lo =0, hi=n-1;
		while(lo<hi) {
			int mid =(hi+lo)/2;
			
			if(arr[mid]>x)
				hi=mid-1;
			else if(arr[mid]<x)
				lo=mid+1;
			else {
				if(mid==0 || arr[mid]!=arr[mid+1])
					return mid;
				else
					lo=mid+1;
			}
		}
		return 0;
	}
}

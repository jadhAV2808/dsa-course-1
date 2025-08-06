package searching;

/*
 * PeakElement: an element which is greater than both of its neighbor
 */

public class PeakElement {

	public static void main(String[] args) {
		
		int[] arr = {6,7,8,20,12};
		int n=arr.length;
		int peak = getPeak(arr,n);
		System.out.println("peak: "+  peak);
		
		peak = getPeak1(arr,n);
		System.out.println("peak: "+  peak);
	}

	/*
	 * naive
	 */
	private static int getPeak(int[] arr, int n) {
		
		if(n==1)
			return arr[0];
		
		if(arr[0]>=arr[1])
			return arr[0];
		
		if(arr[n-1]>arr[n-2])
			return arr[n-1];
		
		for(int i=1;i<n-1;i++) {
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
				return arr[i];
		}
		return -1;
	}
	
	/*
	 * efficient
	 */
	private static int getPeak1(int[] arr, int n) {
		int lo=0, hi=n-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(mid==0 || arr[mid-1]<=arr[mid] && mid==n-1 || arr[mid+1]<=arr[mid])
				return arr[mid];
			if(mid>0 && arr[mid-1]>=arr[mid])
				hi =mid-1;
			else
				lo=mid+1;
		}
		return -1;
	}
}

package searching;

public class SearchInInfiniteArr {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,6,7,8,8,9,10,11,12,13}; // lets consider this as infinite size arr
		int x = 5;
		
		int idx = search(arr,x);
		System.out.println("idx: "+ idx);
		
		idx = search1(arr,x);
		System.out.println("idx: "+ idx);
	}

	/*
	 * naive
	 */
	private static int search(int[] arr, int x) {
		int i=0;
		while(true) {
			if(arr[i]==x) return i;
			if(arr[i]>x) return -1;
			
			i++;
		}
	}
	
	/*
	 * efficient
	 */
	private static int search1(int[] arr, int x) {
		if(arr[0]==x) return 0;
		
		int i=1;
		while(arr[i]<x) 
			i=i*2;
		
		if(arr[i]==x) return i;
		return binarySearch(arr, x,i/2,i-1);
			
			
		
	}

	private static int binarySearch(int[] arr, int k, int lo, int hi) {
		if(lo>=hi)
			return -1;
		
		int mid = (lo+hi)/2;
		
		if(arr[mid]==k)
			return mid;
		
		else if(arr[mid]>k)
			return binarySearch(arr, lo, mid-1, k);
		else
			return binarySearch(arr, mid+1, hi, k);
		
	}
	
}

package searching;

public class LastIndex {

	public static void main(String[] args) {
		int[] arr = {5,10,10,15,15};
		int n =arr.length;
		int x =15;
		
		int idx = lastIndexOf(arr,n,x);
		System.out.println("last index: "+ idx);
		
		idx = lastIndexOf1(arr,0,n-1,x);
		System.out.println("last index: "+ idx);
	}

	/*
	 * niave
	 */
	private static int lastIndexOf(int[] arr, int n, int x) {
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	
	/*
	 * efficient-recur
	 */
	private static int lastIndexOf1(int[] arr, int lo, int hi, int x) {
		if(lo>hi)
			return -1;
		int mid = (lo+hi)/2;
		
		if(arr[mid]>x)
			return lastIndexOf1(arr, lo, mid-1,x);
		else if(arr[mid]<x)
			return lastIndexOf1(arr, mid+1,hi, x);
		else {
			if(mid ==arr.length-1 || arr[mid] != arr[mid+1])
				return mid;
			else {
				return lastIndexOf1(arr, mid+1,hi, x);
			}
		}
		
	}
}

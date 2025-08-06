package searching;

public class IndexOf1stOccurence {

	public static void main(String[] args) {
		int[] arr = {5,10,10,15,15};
		int n =arr.length;
		int x =15;
		
		int index = firstIndex(arr,n,x);
		System.out.println("index: "+ index);
		
		index = firstIndex1(arr,0,n-1,x);
		System.out.println("index: "+ index);
		
		index = firstIndex2(arr,n,x);
		System.out.println("index: "+ index);
	}

	/*
	 * naive
	 */
	private static int firstIndex(int[] arr, int n, int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	
	/*
	 * efficient- recursive
	 */
	private static int firstIndex1(int[] arr, int low, int high, int x) {
		
		if(low>=high)
			return -1;
		int mid = (low+high)/2;
		
		if(x>arr[mid])
			return firstIndex1(arr, mid+1, high, x);
		else {
			if(arr[mid]==0|| arr[mid-1]!=arr[mid])
				return mid;
			else
				return firstIndex1(arr, low, mid-1, x);
		}
	}
	
	/*
	 * efficient- itr
	 */
	private static int firstIndex2(int[] arr, int n, int x) {
		int low=0, hi =n-1;
		
		while(low<=hi) {
			int mid = (low+hi)/2;
			if(arr[mid]>x) 
				hi=mid-1;
			else if(arr[mid]<x)
				low = mid+1;
			else {
				if(arr[mid]==0 || arr[mid-1] !=arr[mid])
					return mid;
				else {
					hi=mid-1;
				}
			}
		}
		return -1;
	}
}

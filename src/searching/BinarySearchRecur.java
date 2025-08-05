package searching;

public class BinarySearchRecur {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int n = arr.length;
		int k = 20;
		
		int index = search(arr,0,n-1,k);
		System.out.println("index: "+ index);
	}

	private static int search(int[] arr, int lo, int hi, int k) {
		
		if(lo>hi)
			return -1;
		
		int mid = (lo+hi)/2;
		
		if(arr[mid]==k)
			return mid;
		
		else if(arr[mid]>k)
			return search(arr, lo, mid-1, k);
		else
			return search(arr, mid+1, hi, k);
	}

}

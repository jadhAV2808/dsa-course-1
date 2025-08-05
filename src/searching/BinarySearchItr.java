package searching;

public class BinarySearchItr {

	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int n = arr.length;
		int k = 20;
		
		int index = search(arr,n,k);
		System.out.println("index: "+ index);
		
	}

	private static int search(int[] arr, int n, int k) {
		
		int low=0, high=n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]==k)
				return mid;
			else if(arr[mid]>k)
				high=mid-1;
			else
				low =mid+1;
		}
		return -1;
	}
}

package array;

public class SortedCheck {

	public static void main(String[] args) {
		int[] arr = {5,8,20,10};
		int n = arr.length;
		boolean flag = isSorted(arr,n);
		System.out.println("is sorted: "+ flag);
		
		flag = isSorted1(arr,n);
		System.out.println("is sorted: "+ flag);
	}
	
	/*
	 * naive
	 */
	private static boolean isSorted(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i])
					return false;
			}
		}
		return true;
	}

	/*
	 * efficient
	 */
	private static boolean isSorted1(int[] arr, int n) {
	
		for(int i=0;i<n-1;i++) {
			if(arr[i] > arr[i+1])
				return false;
		}
		return true;
	}
}

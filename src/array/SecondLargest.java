package array;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {5,8,20,10};
		int n = arr.length;
		
		int sL = findSecondLargest(arr,n);
		System.out.println("second largest: "+ sL);
		
		sL = findSecondLargest1(arr,n);
		System.out.println("second largest: "+ sL);
	}

	/*
	 * naive
	 */
	private static int findSecondLargest(int[] arr, int n) {
		int largest = findLargest(arr, n);
		int res=-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1)
					res =i;
				else if(arr[i]>arr[res])
					res=i;
			}
		}
		return res;
	}
	
	private static int findLargest(int[] arr, int n) {
		int idx = 0;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[idx])
				idx = i;
		}
		
		return idx;
	}
	
	/*
	 * efficient
	 */
	private static int findSecondLargest1(int[] arr, int n) {
		int res = -1; 
		int largest = 0;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest =i;
			}else if(arr[i] != arr[largest]) {
				if(res==-1 || arr[i] > arr[res])
					res =i;
			}
		}
		return res;
	}
}

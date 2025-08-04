package array;
/*
 * find the index of largest element
 */
public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {5,8,20,10};
		int n = arr.length;
		
		int idx = findLargest(arr, n);
		System.out.println("idx: "+ idx);
		
		idx = findLargest1(arr, n);
		System.out.println("idx: "+ idx);
		
	}

	/*
	 * naive approach
	 * tc- > O(n^2)
	 */
	private static int findLargest(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			boolean flag = true;
			
			for(int j=0; j<n;j++) {
				if(arr[j]> arr[i]) {
					flag =false;
					break;
				}
			}
			
			if(flag)
				return i;
		}
		return -1;
	}
	
	/*
	 * efficient approach
	 * tc-> O(n)
	 */
	private static int findLargest1(int[] arr, int n) {
		int idx = 0;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[idx])
				idx = i;
		}
		
		return idx;
	}
}

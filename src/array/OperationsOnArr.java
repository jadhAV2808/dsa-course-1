package array;


public class OperationsOnArr {

	public static void main(String[] args) {
		int[] arr = {20,5,7,25};
		int k = 5;
		
		//1. search
		int index = search(arr, k);
		System.out.println("index: "+ index);
		
		//2. insert
		int[] arr1 = {20,5,7,25,0,0};
		int pos = 2;
		int x = 21;
		int capacity = arr1.length;
		int n =4;  //how many elements filled
		
		n = insert(arr1, n, x, pos, capacity);
		System.out.println("number of element in arrr1: "+ n);
		
		//3. delete
		int[] arr2 = {3,8,12,5,6};
		int x1 = 12;
		int n1 = arr2.length;
		n1 = delete(arr2, x1,n1);
		System.out.println("number of elements in arr2: "+ n1);
		
		
		
	}

	/*
	 * tc-> O(n)
	 */
	private static int delete(int[] arr, int x, int n) {
		int i;
		for(i =0;i<n;i++) {
			if(arr[i]==x) {
				break;
			}
		}
		if(i==n)
			return n;   // element not found in arr
		for(int j=i; j<n-1;j++) {
			arr[j]=arr[j+1];
		}
		return n-1;
	}

	/*
	 * Tc-> O(1): at the end
	 * TC-> O(n): at beginning / general
	 */
	private static int insert(int[] arr, int n, int x, int pos, int capacity) {
		if(n==capacity)
			return n;
		int idx = pos-1;
		
		for(int i=n-1; i>=idx; i--) {
			arr[i+1]=arr[i];	
		}
		arr[idx]=x;
		return n+1;
	}

	/*
	 * TC-> O(n) for non-sorted arr
	 */
	private static int search(int[] arr, int k) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				return i;
		}
		return -1;
	}
}

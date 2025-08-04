package array;

public class Leaders {

	public static void main(String[] args) {
		
		int[] arr = {5,38,20,10};
		int n = arr.length;
		
		findLeaders1(arr, n);
	}

	/*
	 * naive
	 */
	private static void findLeaders(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			boolean flag = false;
			
			for(int j=i+1 ;j<n; j++) {
				if(arr[i]<=arr[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	private static void findLeaders1(int[] arr, int n) {
		int currentLeader = arr[n-1];
		System.out.print(currentLeader+" ");
		
		for(int i=n-2; i>=0; i--) {
			if(currentLeader<arr[i]) {
				currentLeader=arr[i];
				System.out.print(currentLeader+" ");
			}
		}
		
	}
	
	

		
	
	
}

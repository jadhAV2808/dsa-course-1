package hashing;

public class CountDistinctInEveryWindow {

	public static void main(String[] args) {
		int[] arr = {10,10,5,3,20,5};
		int n =arr.length;
		int k = 4; 
		countDistinctElements(arr,n,k);
	}
	
	/*
	 * efficient-using hashing
	 * tc-> O(n)
	 * 
	 */
	private static void countDistinctElements1(int[] arr, int n, int k) {
		
	}

	/*
	 * naive
	 * tc-> O(n-k)*k*k
	 * 
	 */
	private static void countDistinctElements(int[] arr, int n, int k) {
		for(int i=0;i<=n-k;i++) {
			int cnt =0;
			
			for(int j=0;j<k;j++) {
				boolean flag = false;
				
				for(int p=0;p<j;p++) {
					if(arr[i+j]==arr[i+p]) {
						flag=true;
						break;
					}		
				}
				if(!flag)
					cnt++;
			}
			System.out.print(cnt+" ");
		}
		
	}
}

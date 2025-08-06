package array;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = {3,0,1,2,5};
		int n =arr.length;
		
		int unit = getWater(arr,n);
		System.out.println("unit of rain water saved: "+ unit);
		
		unit = getWater1(arr,n);
		System.out.println("unit of rain water saved: "+ unit);
	}

	/*
	 * naive
	 */
	private static int getWater(int[] arr, int n) {
		int res = 0;
		
		for(int i =1;i<n-1;i++) {
			
			int lmax = arr[i];
			for(int j = 0;j<i;j++) {
				lmax = Math.max(lmax, arr[j]);
			}
			
			int rmax = arr[i];
			for(int j=i+1; j<n; j++) {
				rmax = Math.max(rmax, arr[j]);
			}
			
			res = res+ (Math.min(lmax, rmax) -arr[i]);
		}		
		return res;
	}
	
	
	/*
	 * efficient
	 */
	private static int getWater1(int[] arr, int n) {
		int res = 0;
		int lmax[] = new int[n];
		int rmax[] = new int[n];
		
		lmax[0]=arr[0];
		for(int i=1;i<n;i++) {
			lmax[i] = Math.max(arr[i], lmax[i-1]);
		}
		
		rmax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rmax[i] = Math.max(arr[i], rmax[i+1]);
		}
		
		for(int i=1;i<n;i++) {
			res = res+ (Math.min(lmax[i], rmax[i])-arr[i]);
		}
		return res;
	}
	
	
	
}

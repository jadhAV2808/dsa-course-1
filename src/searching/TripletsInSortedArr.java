package searching;

public class TripletsInSortedArr {

	public static void main(String[] args) {
		int []arr = {2,3,4,8,9,20,40};
		int n=arr.length;
		int x = 32;
		boolean isTriplet =  isTriplets(arr,n,x);
		System.out.println("isPair: "+ isTriplet);
		
		isTriplet = isTriplets1(arr,n,x);
		System.out.println("isPair: "+ isTriplet);
	}

	/*
	 * naive
	 */
	private static boolean isTriplets(int[] arr, int n, int x) {
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
//						System.out.println("triplets are: "+ arr[i]+", "+ arr[j]+", " +arr[k]);
						return true;
					}
						
				}
			}
		}
		return false;
	}
	
	/*
	 * efficient
	 */
	private static boolean isTriplets1(int[] arr, int n, int x) {
		
		for(int i=0;i<n-2;i++) {
				if(isPair(arr,n,x-arr[i],i+1))
					return true;			
		}
		return false;
	}

	private static boolean isPair(int[] arr, int n, int x, int start) {		
		int end =n-1;		
		while(start<end) {			
			if(arr[start]+arr[end]==x) {
//				System.out.println("pairs: "+ arr[start]+" and "+ arr[end]);
				return true;
			}				
			else if(arr[start]+ arr[end]< x) {
				start++;
			}else {
				end--;
			}
		}
		return false;
	}
}

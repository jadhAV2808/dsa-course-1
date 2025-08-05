package searching;

/*
 * given  sorted arr,
 *  find if there is a pair with sum x in a sorted arr
 */
public class TwoPointers {
	
	public static void main(String[] args) {
		int[] arr = {2,3,8,11};
		int n =arr.length;
		int x = 14;
		
		boolean isPair = isPair(arr,n,x);
		System.out.println("isPair: "+ isPair);
		
		isPair = isPair1(arr,n,x);
		System.out.println("isPair: "+ isPair);
	}
	
	/*
	 * naive
	 */
	private static boolean isPair(int[] arr, int n, int x) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+ arr[j]==x) {
//					System.out.println("pairs: "+ arr[i]+" and "+ arr[j]);
					return true;
				}
			}
		}
		return false;
	}
	
	/*
	 * efficient
	 */
	private static boolean isPair1(int[] arr, int n, int x) {		
		int start =0, end =n-1;		
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

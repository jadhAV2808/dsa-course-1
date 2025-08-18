package bst;

/*
 * ceil: smallest greater
 */

public class CeilingOnLeftSideInArr {

	public static void main(String[] args) {
		
		int[] arr = {2,8,30,15,25,12};
		//o/p: -1 -1 -1 30 30 15
		int n =arr.length;
		
		findCeilingOnLeft(arr, n);
	}

	/*
	 * naive 
	 */
	private static void findCeilingOnLeft(int[] arr, int n) {
		System.out.print(-1 +" ");
		
		for(int i=1;i<n; i++) {
			int minCeil  = Integer.MAX_VALUE;
			
			for(int j=0; j<i; j++) {
				
				if(arr[j]>=arr[i])
					minCeil  = Math.min(minCeil  , arr[j]);
			}
				
				if(minCeil ==Integer.MAX_VALUE)
					System.out.print(-1 +" ");
				else
					System.out.print(minCeil  +" ");
		}
	}
	
	
	
	/*
	 * efficient-using self-balanced BST 
	 */
}

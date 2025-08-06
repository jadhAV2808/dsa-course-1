package array;

/*
 * we can say if an array has EquilibriumPoint if 
 * 
 * EquilibriumPoint: sum of element before that and sum of element after that are same
 */

public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr = {2,8,3,9,6,5,4};
		int n =arr.length;
		
		boolean isEquilibrium = isEquilibrium(arr,n);
		System.out.println("isEquilibrium: "+ isEquilibrium);
		
		isEquilibrium = isEquilibrium1(arr,n);
		System.out.println("isEquilibrium: "+ isEquilibrium);
	}
	
	/*
	 * efficient
	 */
	private static boolean isEquilibrium1(int[] arr, int n) {
		int rs = 0;
		for(int i=0;i<n;i++) {
			rs+=arr[i];
		}
		int ls =0;
		for(int i=0;i<n;i++) {
			rs-=arr[i];
			
			if(rs == ls)
				return true;
			ls+=arr[i];
		}
		return false;
	}

	/*
	 * naive
	 */
	private static boolean isEquilibrium(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			//find left sum
			int ls =0, rs =0;
			for(int j=0;j<i;j++) {
				ls += arr[j];
			}
			//find right sum
			for(int k=i+1; k<n;k++) {
				rs += arr[k];
			}
			
			if(rs == ls)
				return true;
		}
		return false;
	}
}

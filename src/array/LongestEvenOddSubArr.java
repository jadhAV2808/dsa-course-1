package array;

public class LongestEvenOddSubArr {

	public static void main(String[] args) {
		int[] arr = {5,10,20,6,3,8};
		int n = arr.length;
		
		int len = findLengthOfAlternateEvenOddSubArr(arr, n);
		System.out.println("max lenght: "+ len);
		
		
		len = findLengthOfAlternateEvenOddSubArr1(arr, n);
		System.out.println("max lenght: "+ len);
		
	}

	/*
	 * naive
	 */
	private static int findLengthOfAlternateEvenOddSubArr(int[] arr, int n) {
		
		int res = 1;
		
		for(int i=0; i<n; i++) {			
			int current = 1;			
			for(int j =i+1;j<n; j++) {
				if((arr[j]%2 ==0 && arr[j-1]%2 !=0) ||
						(arr[j]%2 !=0 && arr[j-1]%2 ==0) )
					current++;
				else break;
			}
			res = Math.max(res, current);
		}
		
		return res;
	}
	
	/*
	 * efficient
	 * 
	 * Kadane's algo
	 */
	private static int findLengthOfAlternateEvenOddSubArr1(int[] arr, int n) {
		
		int res = 1;
		int current = 1;
		
		for(int i=1; i<n; i++) {
			
			if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || 
					arr[i]%2 != 0 && arr[i-1]%2 == 0) {
				
				current++;
				res = Math.max(current, res);
			}
			else 
				current = 1;		
		}	
		return res;
		
	}
		
		
}

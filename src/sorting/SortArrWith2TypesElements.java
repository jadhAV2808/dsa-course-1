package sorting;import java.io.CharArrayReader;
import java.util.Arrays;

/*
 * ex.1] segregate positive & negative
 * ex.2] segregate even & odd
 * ex.3] sort binary(0 &1)
 * 
 */

public class SortArrWith2TypesElements {

	public static void main(String[] args) {
		int []arr = {15,-3,-2,18};
		int n =arr.length;
		
		segregatePosNeg1(arr,n);
		System.out.println("segregated Pos&Neg: "+ Arrays.toString(arr));
	}

	/*
	 * naive- using temp[]
	 */
	private static void segregatePosNeg(int[] arr, int n) {
		
	}
	
	
	/*
	 * efficient-using hoare's partition
	 */
	private static void segregatePosNeg1(int[] arr, int n) {
		int i=-1, j=n;
		
		while(true) {
			do {
				i++;
			}while(arr[i]<0);
			
			do {
				j--;
			}while(arr[j]>=0);
			
			if(i>=j)
				return;
			swap(arr,i,j);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}

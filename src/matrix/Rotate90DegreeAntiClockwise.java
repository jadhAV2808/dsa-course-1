package matrix;

/*
 * if we Rotate 90 Degree Anti-Clockwise then 
 * last col becomes first row & 
 * and second last col becomes second row
 */

public class Rotate90DegreeAntiClockwise {

	public static void main(String[] args) {
		
		int[][] arr = { 
				{1,2,3,4}, 
				{5,6,7,8},
				{9,10,11,12}, 
				{13,14,15,16} 
			};
		int n=arr.length;
		roatet90DegreeAntiClockwise1(arr,n);
		print(arr);
	}
	
	
	/*
	 * efficient
	 * tc->O(n^2)
	 * sc->O(1)
	 * 
	 * 1] find transpose
	 * 2] reverse individual columns (1 row=>last row)
	 */
	private static void roatet90DegreeAntiClockwise1(int[][] arr,int n) {
		
		//1. transpose
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				swap(arr, i,j);
			}
		}
		
		//2. reverse individual col
		for(int i=0;i<n;i++) {
			int lo=0,hi=n-1;
			
			while(lo<hi) {
				//swap
				int temp = arr[lo][i];
				arr[lo][i]=arr[hi][i];
				arr[hi][i]=temp;
				
				lo++;
				hi--;
			}
			
		}
	}
	
	
	private static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
	
	
	
	

	/*
	 * naive
	 * tc->O(n^2)
	 * sc->O(n^2)
	 */
	private static void roatet90DegreeAntiClockwise(int[][] arr,int n) {
		
		
		int tmp[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				tmp[n-j-1][i]=arr[i][j];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=tmp[i][j];
			}
		}
	}
	
	
	
	
	private static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}

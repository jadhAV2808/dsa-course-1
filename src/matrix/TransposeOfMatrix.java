package matrix;

/*
 * TransposeOfMatrix: 
 * rows convert to col 
 * & col converts to rows
 */

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr = { 
				{1,2,3,4}, 
				{5,6,7,8},
				{9,10,11,12}, 
				{13,14,15,16} 
			};

		transpose1(arr);
		print(arr);
	}
	
	
	
	
	
	
	
	
	/*
	 * naive- efficient
	 * 
	 * diagonal elements are same 
	 */
	private static void transpose1(int[][] arr) {
		int r=arr.length;
		int c=arr[0].length;
		
		for(int i=0;i<r;i++) {
			for(int j=i+1;j<c;j++) {
				swap(arr, i,j);
			}
		}
	}
	

	
	
	private static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}








	/*
	 * naive- using temp[][]
	 * arr[i][j]= arr[j][i]
	 */
	private static void transpose(int[][] arr) {
		int r=arr.length;
		int c=arr[0].length;
		int tmp[][]=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				tmp[i][j]=arr[j][i];
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
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

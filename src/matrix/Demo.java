package matrix;

public class Demo {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4}, {3,4,5,6,7,8} };		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		//jacket array
		
		int m=3;
		int[][] arr1 = new int[m][];
		for(int i=0;i<arr1.length;i++) {
			
			arr1[i]=new int[i+1];
			
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=i;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println(" ");
		}

		
		//passing 2D array as argument in java
		print(arr);
		
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

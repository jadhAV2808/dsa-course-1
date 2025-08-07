package matrix;

public class SpiralTraversal {
	
	private static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		int[][] arr = { 
				{1,2,3,4}, 
				{5,6,7,8},
				{9,10,11,12}, 
				{13,14,15,16} 
			};
		
		int r=arr.length;
		int c=arr[0].length;

		traverse(arr,r,c);
//		print(arr);
	}

	
	private static void traverse(int[][] arr, int r, int c) {
		
		int top=0, left=0, bottom=r-1, right=c-1;
		
		while(top<=bottom && left<=right) {
			
			//top view
			for(int i=left;i<=right;i++)
				System.out.print(arr[top][i]+" ");
			
			top++;
			
			//right view
			for(int i=top;i<=bottom;i++)
				System.out.print(arr[i][right]+" ");
			
			right--;
			
			//bottom view
			if(top<=bottom) {             //this conditional check is required if only one row left 
				for(int i=right;i>=left;i--)
					System.out.print(arr[bottom][i]+" ");
				
				bottom--;
			}
			
			
			//left view
			if(left<=right) {          //this conditional check is required if only one row left 
				for(int i=bottom;i>=top;i--)
					System.out.print(arr[i][left]+" ");
				
				left++;
			}
			
		}
	}
}

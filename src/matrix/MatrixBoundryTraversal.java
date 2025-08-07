package matrix;

public class MatrixBoundryTraversal {

	public static void main(String[] args) {
		int[][] arr = { 
				{1,2,3,4}, 
				{5,6,7,8},
				{9,10,11,12}, 
				{13,14,15,16} 
			};

		treverseBoundries(arr);
	}

	private static void treverseBoundries(int[][] arr) {
		int r=arr.length,  c=arr[0].length;
		
		if(r==1) {
			for(int i=0;i<c;i++)
				System.out.print(arr[0][i]+" ");
		}
		else if(c==1) {
			for(int i=0;i<r;i++) {
				System.out.print(arr[i][0]+" ");
			}
		}else {
			
			//first row left->right
			for(int i=0;i<c;i++)
				System.out.print(arr[0][i]+" ");
			
			//last col top->bottom (start from 1 to avoid duplicating corner element)
			for(int i=1;i<r;i++)
				System.out.print(arr[i][c-1]+" ");
			
			//last row right->left (start from c-2 to avoid duplicating corner element)
			for(int i=c-2;i>=0;i--)
				System.out.print(arr[r-1][i]+" ");
			
			//first col bottom->top 
			for(int i=r-2;i>=1;i--)
				System.out.print(arr[i][0]+" ");
		}
		
	}
}

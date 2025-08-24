package backtracking;

public class SudokuProblem {
	
	private static void printMatrix(int[][] board, int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int n=4;
		int[][] grid = {
				{1,0,3,0},
				{0,0,2,1},
				{0,1,0,2},
				{2,4,0,0}
				
		};
		
		boolean isSolved = solveSudoku(grid, n);
		System.out.println("isSolved: "+ isSolved);
		printMatrix(grid, n);
	}

	private static boolean solveSudoku(int[][] grid, int n) {
	
		// find first empty cell
		int i=0,j=0;
		boolean emptyFound = false;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(grid[i][j]==0) {
					emptyFound = true;
					break;
				}	
			}
			 if(emptyFound) 
				 break;
		}
		
		// base case: no empty cell
	    if(!emptyFound)
	        return true;
		
		//trying to place values from 1 to n
		for(int x=1;x<=n;x++) {
			if(isSafe(i,j,x,grid,n)) {
				grid[i][j]=x;
				if(solveSudoku(grid, n))
					return true;
				grid[i][j]=0;
			}
		}
		
		
		
		return false;
	}

	private static boolean isSafe(int i, int j, int x, int[][] grid, int n) {
		//check if it present in row and col
		for(int k=0;k<n;k++) {
			if(grid[i][k]==x || grid[k][j]==x)
				return false;
		}
		
		//checking for sub-grid
		int s = (int) Math.sqrt(n);
		int rs=i-i%s;
		int cs=j-j%s;
		
		for(int p=0;p<s;p++) {
			for(int q=0;q<s;q++) {
				if(grid[p+rs][q+cs]==x)
					return false;
			}
		}
		return true;
	}

}

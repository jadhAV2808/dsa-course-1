package graph;
/*
 * An articulation point is a vertex whose removal, 
 * along with all its connected edges, 
 * increases the number of connected components in the graph.
 */
public class ArticulationPoint {

	public static void main(String[] args) {
		
		int n=4;
		int[][] board = new int[n][n];
		
		boolean isQueensPlaced = solve(board,n);
		System.out.println("isQueensPlaced: "+ isQueensPlaced);
		
	}

	private static boolean solve(int[][] board, int n) {
		if(!solveRec(0,n,board))
			return false;
		else {
			printMatrix(board, n);
			return true;
		}
		
	}

	

	private static boolean solveRec(int col, int n, int[][] board) {
		if(col==n)
			return true;
		
		for(int i=0;i<n;i++) {
			if(isSafe(i,col, board,n)) {
				board[i][col]=1;
				if(solveRec(col+1, n, board))
					return true;
				board[i][col]=0;
			}
		}
		
		return false;
	}

	private static boolean isSafe(int row, int col, int[][] board, int n) {
		// Check left side of the current row
		for(int i=0;i<col;i++) {
			if(board[row][i]==1)
				return false;	
		}
		// Check upper-left diagonal
		for(int i=row, j=col; i>=0 && j>=0; i--,j--) {
			if(board[i][j]==1)
				return false;	
		}
		 // Check lower-left diagonal
		for(int i=row, j=col; i < n && j >= 0; i++,j--) {
			if(board[i][j]==1)
				return false;	
		}
		return true;
	}
	
	private static void printMatrix(int[][] board, int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}

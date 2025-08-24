package backtracking;

import java.util.Arrays;

public class RatInMaze {

	public static void main(String[] args) {
		
		int[][] maze = {{1,0,0,0},
						{1,1,0,1},
						{0,1,0,0},
						{1,1,1,1}
		};
		
		int[][] maze1 = {
				{1,0,0},
				{0,1,0},
				{1,1,1}
		};
		
		int n=maze1.length;
		
		/*
		 * 
		 * rat is at top-left (0,0) & cheese at bottom-right(n-1, n-1)
		 * 
		 * only 2 moves allowed from (i,j)
		 * 1]i+1, j => top-to-bottom
		 * 2] i,j+1 => left-to-right
		 */
		int[][] sol =new int[n][n];

		
		boolean willRatReachToCheese = solveMaze(maze1,n, sol);
		System.out.println("willRatReachToCheese: "+ willRatReachToCheese);
		
		
	}

	private static boolean solveMaze(int[][] maze, int n, int[][] sol) {
		
		if(!solveMazeRec(0,0, n, sol,maze))
			return false;
		else 
			return true;
	}

	private static boolean solveMazeRec(int i, int j, int n, int[][] sol, int[][] maze) {
		
		if(i==n-1 && j==n-1) {
			sol[i][j]=1;
			return true;
		}
		
		if(isSafe(i,j,n,maze)) {
			sol[i][j]=1;
			if(solveMazeRec(i+1, j, n, sol,maze))
				return true;
			else if(solveMazeRec(i, j+1, n, sol, maze))
				return true;
			sol[i][j]=0;
		}
			
		return false;
	}

	private static boolean isSafe(int i, int j, int n, int[][] maze) {
		
		return (i<n && j<n && maze[i][j]==1);
	}
}

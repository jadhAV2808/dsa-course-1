package matrix;


public class SearchInRowWiseAndColWiseSorted {

	public static void main(String[] args) {
		
		int[][] arr = { 
				{10,20,30,40}, 
				{15,25,35,45},
				{27,29,37,48}, 
				{32,33,39,50} 
			};
		
		int r=arr.length;
		int c=arr[0].length;
		int x=29;
		
		search(arr,r,c,x);
		search1(arr,r,c,x);


	}
	
	
	/*
	 * efficient
	 * tc-> O(r+c)
	 * begin from top right corner
	 * if x is same, print position & return
	 * if x is smaller , move left
	 * if x is greater, move down
	 */
	private static void search1(int[][] arr, int r, int c, int x) {
		//begin from top right corner
		int i=0, j=c-1;
		
		while(i<r && j>=0) {
			//if x is same, print position & return
			if(arr[i][j]==x) {
				System.out.println("Found at "+ i + ", " + j);
				return;
			}
			//if x is smaller , move left
			else if(x<arr[i][j])
				j--;
			//if x is greater, move down
			else
				i++;
		}
		System.out.println("Not Found");
	}
	
	
	

	/*
	 * naive
	 */
	private static void search(int[][] arr, int r, int c, int x) {
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==x) {
					System.out.println("Found at "+ i + ", " + j);
					return;
				}	
			}
		}
		System.out.println("Not Found");
	}
}

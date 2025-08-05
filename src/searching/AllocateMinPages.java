package searching;

public class AllocateMinPages {

	public static void main(String[] args) {
		int[] pages = {10,20,30,40};
		int n=pages.length;
		int k=2;
		
		int maxPages = findMaxPages(pages,n,k);
		System.out.println("maxPages: "+ maxPages);
	}
	
	
	
	/*
	 * efficient
	 */
	private static int findMaxPages1(int[] pages, int n,int k) {
		
		return 0;
	}

	/*
	 * naive
	 */
	private static int findMaxPages(int[] pages, int n,int k) {
		if(k==1)
			return sum(pages,0,n-1);
		if(n==1)
			return pages[0];
		int res = Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			res  = Math.min(findMaxPages(pages, i, k-1), sum(pages, i, n-1));
		}
		
		return res;
	}

	private static int sum(int[] pages, int start, int end) {
		int sum=0;
		for(int i=start;i<end;i++) {
			sum+=pages[i];
		}
		return sum;
	}
}

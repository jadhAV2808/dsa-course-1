package searching;

public class SquareRoot {

	public static void main(String[] args) {
		int n = 4;
		
		int sqrt = sqrt(19);
		System.out.println("sqrt: "+ sqrt);
		
		sqrt = sqrt1(19);
		System.out.println("sqrt: "+ sqrt);
	}

	/*
	 * naive
	 */
	private static int sqrt(int n) {
		int i=1;
		while(i*i<=n)
			i++;
		return i-1;
	}
	

	/*
	 * efficient
	 */
	private static int sqrt1(int x) {
		int lo=1, hi=x;
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			int msq = mid*mid;
			if(msq==x)
				return mid;
			else if(msq>x)
				hi=mid-1;
			else {
				lo=mid+1;
				ans =mid;
			}
		}
		return ans;
	}
}

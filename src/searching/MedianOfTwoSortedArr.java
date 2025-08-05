package searching;

public class MedianOfTwoSortedArr {

	public static void main(String[] args) {
		int[] a1 = {10,20,30,40,50};
		int[] a2 = {5,15,25,27,28,55,65,75,85};
		int n1=a1.length;
		int n2=a2.length;
		
		
		int m =  median(a1,n1,a2,n2);
		System.out.println("median: "+ m);
	}

	private static int median(int[] a1, int n1, int[] a2, int n2) {
		int start =0, end=n1;
		while(start<=end) {
			int l1 = (start+end)/2;
			int l2 = (n1+n2+1)/2-l1;
			
			
		}
		return 0;
	}
}

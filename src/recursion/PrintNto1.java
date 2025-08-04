package recursion;

public class PrintNto1 {

	public static void main(String[] args) {
		 print(4);
	}

	private static void print(int n) {
		
		//base case
		if(n==0)
			return;
		
		System.out.print(n+" ");
		print(n-1);
		
	}
}

package recursion;

public class Print1toN {
	
	public static void main(String[] args) {
		 print(4);
	}

	private static void print(int n) {
		
		if(n==0)
			return;
		print(n-1);
		System.out.print(n+" ");
	}

}

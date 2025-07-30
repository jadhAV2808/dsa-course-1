package mathematics;

public class Factorial {
	
	public static void main(String[] args) {
		int fact = findFactorial(6);
		System.out.println("facttorial: "+ fact);
		
		fact = getFactorial(6);
		System.out.println("facttorial: "+ fact);
	}
	
	/*
	 * recursive solution
	 */	
	private static int getFactorial(int n) {
		if(n == 0)
			return 1;
		return n * getFactorial(n-1);
	}

	

	/*
	 * brute force approach
	 */
	private static int findFactorial(int n) {
		int fact = 1;
		for(int i = 2;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}

}

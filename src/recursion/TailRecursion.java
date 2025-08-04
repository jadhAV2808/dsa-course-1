package recursion;

public class TailRecursion {

	public static void main(String[] args) {
		
		//non tail recur
		int fact =  factorial(4);
		System.out.println("fact: "+ fact);
		
		//tail recur
		fact = factorial(4,1);
		System.out.println("fact: "+ fact);
	}

	private static int factorial(int n, int k) {
		if(n==0 || n==1)
			return k;
		return factorial(n-1, k*n);
	}

	private static int factorial(int n) {
		if(n==0 || n==1)
			return 1;
		return n*factorial(n-1);
	}
	
}

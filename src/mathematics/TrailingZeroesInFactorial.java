package mathematics;

public class TrailingZeroesInFactorial {
	
	public static void main(String[] args) {
		
		int n = coutTrailingZerosinFact(10);
		System.out.println("n: "+ n);
		
		n= getTrailingZeroscount(100);  //24
		System.out.println("n: "+ n);
	}
	
	
	/*
	 * efficient approach
	 */
	private static int getTrailingZeroscount(int n) {
		int cnt  = 0;
		
		for(int i =5; i<=n; i=i*5) {
			cnt = cnt+ n/i;
		}
		return cnt;
	}


	/*
	 * brute force
	 */
	private static int coutTrailingZerosinFact(int n) {
		
		int  fact = getFactorial(n);
		System.out.println("fact: "+ fact);
		return  coutTrailingZeros(fact);
	}

	private static int coutTrailingZeros(int fact) {
		int cnt = 0;
		while(fact%10 == 0) {
			cnt++;
			fact = fact/10;
		}
		return cnt;
	}

	private static int getFactorial(int n) {
		if(n==0)
			return 1;		
		return n * getFactorial(n-1);
	}

}

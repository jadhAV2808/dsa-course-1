package dp;

import java.util.Arrays;

public class Memoization {

	public static void main(String[] args) {
		
		int n=5;
		
		//Nth Fibonacci Number
		int res= fibonacci(n);
		System.out.println("res: "+ res);
	}


	private static int fibonacci(int n) {
		
		int[] memo=new int[n+1];
		Arrays.fill(memo, -1);
		
		return nThFibo(n, memo);
	}


	private static int nThFibo(int n, int[] memo) {
		if(n<=1)
			return n;
		
		if(memo[n]!=-1)
			return memo[n];
		
		memo[n]=nThFibo(n-1, memo) + nThFibo(n-2, memo);
		return memo[n];
	}
}

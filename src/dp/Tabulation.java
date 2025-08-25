package dp;

public class Tabulation {

	public static void main(String[] args) {
		int n=5;
		
		//Nth Fibonacci Number
		int res= fibonacci(n);
		System.out.println("res: "+ res);
	}

	private static int fibonacci(int n) {
		int f[]=new int[n+1];
		f[0]=0;
		f[1]=1;
		
		for(int i=2;i<=n;i++) {
			f[i]=f[i-1]+ f[i-2];
		}
		
		return f[n];
	}
}

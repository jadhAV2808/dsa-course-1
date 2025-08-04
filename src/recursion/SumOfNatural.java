package recursion;

public class SumOfNatural {

	public static void main(String[] args) {
		
		int sum = findSum(4);
		System.out.println("sum: "+ sum);
	}

	private static int findSum(int n) {
		
		if(n == 0)
			return n;
		return n+ findSum(n-1);
		
	}
}


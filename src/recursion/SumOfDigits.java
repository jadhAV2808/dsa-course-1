package recursion;

/*
 * n%10-> gives last digit of n
 * n/10->removes last digit of n
 */

public class SumOfDigits {

	public static void main(String[] args) {
		int sum = findDigitSum(123);
		System.out.println("sum of digits: "+ sum);
	}

	private static int findDigitSum(int n) {
//		if(n==0)
//			return 0;
		if(n<=9)
			return n;
		
		return n%10 + findDigitSum(n/10);
	}
}

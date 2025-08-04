package bitwiseOperator;

public class CheckForKthSetBit {

	public static void main(String[] args) {
		
		String str = isSet(10,2);
		
		System.out.println(str);
		
	}

	/*
	 * naive solution
	 * kth bit = 2^k - 1
	 */
	private static String isSet(int n, int k) {
		int x = n>>(k-1);
		if((x & 1) !=0)
			return "Yes";
		else 
		return  "NO";
	}
}

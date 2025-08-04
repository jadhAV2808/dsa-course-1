package recursion;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		toBinary(10);
	}

	private static void toBinary(int n) {
		
		//base case
		if(n==0)
			return;
		toBinary(n/2);
		System.out.print(n%2 +" ");
		
	}

}

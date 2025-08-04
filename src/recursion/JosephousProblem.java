package recursion;

public class JosephousProblem {

	public static void main(String[] args) {
		int n=7; 
		int k=3;
		
		int pos = findSurviorPosition(n,k);
		System.out.println("survior position is: "+ pos);
	}

	private static int findSurviorPosition(int n, int k) {
		
		if(n==1)
			return 0;
		
		return  (findSurviorPosition(n-1, k)+k)%n;
	}
}

package bitwiseOperator;

public class CountSetBits {
	
	public static void main(String[] args) {
		
		int cnt = count(7);
		System.out.println("cnt: "+ cnt);
		
		
		cnt = count1(7);
		System.out.println("cnt: "+ cnt);
		
	}

	
	private static int count1(int n) {
		 int cnt=0;
		 while(n>0) {
			 if(n%2==1)
				 cnt++;
			 n=n/2;		 
		 }
		return cnt;
	}


	/*
	 * naive solution
	 */
	private static int count(int n) {
		
		 String str = Integer.toBinaryString(n);
		 System.out.println("binary representation is: "+ str);
		 int cnt=0;
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)=='1')
				 cnt++;
		 }
		return cnt;
	}

}

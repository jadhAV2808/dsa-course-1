package mathematics;

public class CountDigits {

	public static void main(String[] args) {
		
		int n = countDigits(10);
		System.out.println("no. of digits: "+ n);
	}

	private static int countDigits(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			n = n/10;
			
		}
		return cnt;
	}

}

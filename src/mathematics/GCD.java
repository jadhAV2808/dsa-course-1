package mathematics;

/*
 * GCD: Greatest Common DIvisor
 */

public class GCD {

	public static void main(String[] args) {
		
		int gcd = findGcd(10,15);
		System.out.println("gcd: "+ gcd);
		
		gcd= getGCD(10,15);
		System.out.println("gcd: "+ gcd);
		
		gcd= gcd(10,15);
		System.out.println("gcd: "+ gcd);
	}

	
	/*
	 * more optimal approach-euclid algo.
	 */
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		
		return gcd(b, a%b);
	}

	/*
	 * optimal approach-euclid algo.
	 */
	private static int getGCD(int a, int b) {
		while(a!=b) {
			if(a>b)
				a=a-b;
			else {
				b=b-a;
			}
		}
//		return a;
		return b;  //we can return a/b
	}

	/*
	 * brute force
	 */
	private static int findGcd(int a, int b) {
		int res = Math.min(a, b);
		
		while(res>0) {
			if(a%res == 0 && b%res == 0)
				break;
			res--;
		}
		return res;
	}
}

package mathematics;

/*
 *  LCM stands for Least Common Multiple. 
 *  
 *   a * b = gcd(a,b) * lcm(a,b)
 */

public class LCM {
	
	public static void main(String[] args) {
		
		int lcm = findLCM(4,6);
		System.out.println("lcm: "+ lcm);
		
		
		lcm = lcm(4,6);
		System.out.println("lcm: "+ lcm);
		
	}

	/*
	 * efficient approach
	 */
	private static int lcm(int i, int j) {
		
		return (i * j)/ gcd(i,j);
	}

	private static int gcd(int i, int j) {
		if(j==0)
			return i;
		return gcd(j, i%j);
	}

	/*
	 * naive solution
	 */
	private static int findLCM(int a, int b) {
		
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a == 0 && res%b ==0)
				return res;
			res++;
		}
		
	}

}

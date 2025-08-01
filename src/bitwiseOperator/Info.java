package bitwiseOperator;

public class Info {
	
	/*
	 * 1]OR (|):  if any of input is 1 then 1.
	 * 
	 * 2]AND (&): if both input 1 then 1.
	 * 
	 * 3]XOR (^): if both inputs are different then 1.
	 * 
	 * 4] Left shift (<<) : to shift to left.  x<<y = x*2^y 
	 * 
	 * 4] Signed Right shift (>>) : to shift to RIght  x>>y = x/2^y
	 * 
	 * 5] NOT (~): negate input. unary(single input)
	 * 
	 * 6] UnSigned Right Shift(>>>) :
	 * 
	 * 7]  :
	 */
	
	
	/*
	 * Binary representation of negative numbers: 
	 *   negative numbers are stred using 2's complement form.
	 *   2's complement = (~ all bits) + 1;
	 *   direct formmula : 2's complement of n  = 2^n - 1;
	 */

	public static void main(String[] args) {
		
		System.out.println(3 & 6);
		System.out.println(3 | 6);
		System.out.println(3 ^ 6);
		System.out.println(~ 1);
		System.out.println(~ -1);
		
		System.out.println(3<<1);
		System.out.println(3<<2);
		
		System.out.println(3>>1);
		System.out.println(3>>2);
	}
}

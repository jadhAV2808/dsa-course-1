package string;

public class RotationsCheck {

	public static void main(String[] args) {
		String s1 = "ABCD", s2 = "CDAB";
		
		boolean isRotation = isRotation(s1,s2);
		System.out.println("isRotation: "+ isRotation);
	}

	/*
	 * naive : rotate n times clk/anti=clk
	 */
	
	
	
	
	/*
	 * efficient
	 */
	private static boolean isRotation(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		String tmp = s1+s2;
		
		//return tmp.indexOf(s2)>=0; 
		return tmp.contains(s2);
	}
}

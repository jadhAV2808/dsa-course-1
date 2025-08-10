package my.practice.string;

public class BinaryCheck {

	public static void main(String[] args) {
		String str = "0101010101";
		
		boolean isBinary = isBinary(str);
		System.out.println("isBinary:"+ isBinary);
		
	}

	private static boolean isBinary(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='0' && str.charAt(i)!='1')
				return false;
		}
		return true;
	}
}

package recursion;


public class GenerateSubsets {
	
	public static void main(String[] args) {
		
		getSubsets(0, "ABC", "");
	}

	public static void getSubsets(int i, String str, String current) {
		
		if(i==str.length()) {
			System.out.print(current+", ");
			return;
		}
		// not include
		getSubsets(i+1, str, current);
		
		//include
		getSubsets(i+1, str, current + str.charAt(i));
	}
}

package my.practice.string;

public class Permutations {

	public static void main(String[] args) {
		
		String str = "ABC";
		
		printPermutations(0,str);
	}

	private static void printPermutations(int index, String str) {
		
		if(index == str.length()) {
			System.out.println(str);
			return;
		}
		
		for(int i=index;i<str.length();i++) {
			
			String reString = swap(str, index, i);
			printPermutations(index+1, reString);
		}
		
		
	}

	private static String swap(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		char ch = str.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, ch);
		return sb.toString();
	}
}

package backtracking;

public class Permutations {

	public static void main(String[] args) {
		String str = "ABC";
		
		printPermutations(str, 0,str.length()-1);
		
	}

	private static void printPermutations(String str, int left, int right) {
		if(left==right) {
			System.out.println(str);
			return;
		}
		else {
			for(int i=left;i<right;i++) {
				str=swap(str, left,i);
				printPermutations(str, left+i, right);
				str=swap(str, left,i);
			}
		}
	}

	private static String swap(String str, int left, int i) {
		StringBuilder sb = new StringBuilder(str);
		char ch= str.charAt(i);
		sb.setCharAt(i, str.charAt(left));
		sb.setCharAt(left, ch);
		
		return sb.toString();
	}
}

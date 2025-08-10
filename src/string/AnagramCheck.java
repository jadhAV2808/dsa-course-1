package string;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {
		
		String s1 = "listen", s2 = "silent";
		
		boolean isAnagram = isAnagram(s1,s2);
		System.out.println("isAnagram: "+ isAnagram);
		
		isAnagram = isAnagram1(s1,s2);
		System.out.println("isAnagram: "+ isAnagram);
		
	}

	/*
	 * naive
	 */
	private static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		
		char[] a1=s1.toCharArray();
		Arrays.sort(a1);
		s1=new String(a1);
		
		char[] a2=s2.toCharArray();
		Arrays.sort(a2);
		s2=new String(a2);
			
		return s1.equals(s2);
	}
	
	/*
	 * efficient
	 */
	static final int CHAR=256;
	private static boolean isAnagram1(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		int[] count = new int[CHAR];
		
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
			
		}		
		for(int i=0;i<CHAR;i++) {
			if(count[i]!=0)
				return false;
		}		
		return true;
	}
	

}

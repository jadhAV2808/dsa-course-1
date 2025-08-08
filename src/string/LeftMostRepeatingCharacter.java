package string;

import java.util.Map;



public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "jgeeksforgeeks";    //leftmost repeating char is g
		
		int index = leftMostRepeating(str);
		System.out.println("LeftMost Repeating Character index: "+ index);
		
		index = leftMostRepeating1(str);
		System.out.println("LeftMost Repeating Character index: "+ index);
		
		index = leftMostRepeating2(str);
		System.out.println("LeftMost Repeating Character index: "+ index);
		
		
	}

	/*
	 * naive
	 * tc: O(n^2)
	 */
	private static int leftMostRepeating(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					return i;
			}
		}
		
		return -1;
	}
	
	
	static final int CHAR=256;
	
	/*
	 * efficient approach-1 :-count[] arr
	 * 
	 */
	private static int leftMostRepeating1(String str) {
		
		int[] count = new int[CHAR];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]>1)
				return i;
		}
		
		return-1;
	}
	
	
	/*
	 * efficient-2: using map
	 * 
	 */
	private static int leftMostRepeating2(String str) {
		
		boolean[] visited = new boolean[CHAR];
		int res =-1;
		for(int i=str.length()-1;i>=0;i--) {
			if(visited[str.charAt(i)])
				res=i;
			else
				visited[str.charAt(i)]=true;
		}
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

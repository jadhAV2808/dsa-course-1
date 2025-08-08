package string;

public class LeftMostNonRepeating {
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";  // left-most non-repeating char is f
		int index = findLeftMostNonRepeating(str);
		System.out.println("index: "+ index);
		
		index = findLeftMostNonRepeating1(str);
		System.out.println("index: "+ index);

		
	}

	/*
	 * naive
	 * tc->O(n^2)
	 * sc->O(1)
	 */
	private static int findLeftMostNonRepeating(String str) {
		
		for(int i=0;i<str.length();i++) {
			boolean flag= false;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(!flag)
				return i;
		}
		
		return -1;
		
	}
	
	
	/*
	 * better: linear time solution
	 * tc->O(n)
	 * sc->O(n)
	 */
	static final int CHAR=256;
	private static int findLeftMostNonRepeating1(String str) {
		
		int[] count = new int[CHAR];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1)
				return i;
		}
		
		return-1;
	}

}

package string;

public class LexicographicRank {
	
	public static void main(String[] args) {
		String str = "BAC";
		//output:3
		/*
		 * ABC--1
		 * ACB--2
		 * BAC--3
		 * BCA--4
		 * CAB--5
		 * CBA--6
		 */
		
		int rank = findRank(str);
		System.out.println("rank: "+ rank);
	}

	/*
	 * 
	 */
	private static int findRank(String str) {
		
		return 0;
	}

}

package my.practice.string;

/*
 * ount of substrings that start and end with 1 in given Binary String
 */

public class CountSubstringwith1 {

	public static void main(String[] args) {

		/*
		 * Input: s = "00100101"
		 * Output: 3
		 * Explanation: Valid substrings are "1001", "100101", and "101", all starting and ending with '1'.
		 * 
		 */
		String str= "100";
		int cnt = count (str);
		System.out.println("cnt: "+ cnt);
	}

	private static int count(String str) {
		/*
		 * naive
		 * 
		int cnt = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)== '1' && str.charAt(j)=='1')
					cnt++;
			}
		}		
		return cnt;
		*/
		
		 int ones = 0;
	        
        // Count of '1's using loop
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                ones++;
            }
        }

        // Return total substrings = m * (m - 1) / 2
        return (ones * (ones - 1)) / 2;
	}
}

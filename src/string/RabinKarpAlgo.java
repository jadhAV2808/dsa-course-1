package string;

public class RabinKarpAlgo {

	public static void main(String[] args) {
		String txt  = "GEEKSFORGEEKS";
		String pat = "EKS";             
		//o/p: 2 10
		
		search(txt,pat);
	}

	/*
	 * rolling hash: Ti+1
	 * Average case: O(N + M)
	 * Worst case (with many hash collisions): O(N*M)
	 */
	private static void search(String txt, String pat) {
		
		int d = 256;       // Number of characters in the input alphabet
        int q = 101;       // A prime number
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0;         // Hash value for pattern
        int t = 0;         // Hash value for text window
        int h = 1;
        
        
        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;
        
     // Calculate the hash value of pattern and first window of text
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        
     // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {
        	 // If hash values match, check characters one by one
            if (p == t) {
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == M)
                    System.out.print(i + " ");
            }
            
         // Calculate hash for next window
            // Remove leading char, add trailing char
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                // If t becomes negative, convert it to positive
                if (t < 0)
                    t = (t + q);
            }
        }

	}
}

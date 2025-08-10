package string;

import java.util.Arrays;

/*
 * String: 
 * sequence of chars.
 * small set
 * contiguous integer values for 'a' to 'z'
 *    'A' to 'Z' in both ASCII & UTF-16
 *     'a'=> 97 
 *     'A'=> 65
 * in java char data-type is 16 bit.
 * 
 * Strings are immutable
 * 
 */
public class Intro {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks" ;
		
		printFreqOfchars(str);
	}

	private static void printFreqOfchars(String str) {
		int[] cnt = new int[26];
		
		for(int i=0;i<str.length();i++) 
			cnt[str.charAt(i)-'a']++;
		for(int i=0;i<26;i++) {
			if(cnt[i]>0)
				System.out.println((char)(i+'a') +": "+ cnt[i]);
		}
			
		
	}
}

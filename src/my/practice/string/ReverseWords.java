package my.practice.string;

/*
 * In Java, the String.split() method takes a regular expression, 
 * and "." in regex means "any character" — not a literal dot. 
 * So it splits the string at every character instead of only at the dots.
 */

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		
		//Output: "much.very.program.this.like.i"
		String result = reverseWords(s);
		System.out.println("output: "+ result );
	}

	private static String reverseWords(String str) {
		//create arr
		String[] arr = str.split("\\.");
		System.out.println("arr: "+ Arrays.toString(arr));
		//reve arr
		reverse(arr);
		System.out.println("rev. arr: "+ Arrays.toString(arr));
		//reconstruct str
		return String.join(".", arr);
		
	}

	private static void reverse(String[] arr) {
		int start=0, end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	private static void swap(String[] arr, int start, int end) {
		String tmp= arr[start];
		arr[start]=arr[end];
		arr[end]=tmp;	
	}

	
}

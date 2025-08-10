package string;


import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "welcome to gfg";
		//output: gfg to welcome
		
		str = reverseWords(str);
		System.out.println(str);
		
		String str1 = "welcome to gfg";
		char[] ch =str1.toCharArray();
		reverseWords1(ch);
		System.out.println(Arrays.toString(ch));
		
	}

	/*
	 * naive :using stack
	 * create stack
	 * push words one by one to stack
	 * pop words from stack and append to output
	 * 
	 * tc->
	 * sc->O(n)
	 */
	private static String reverseWords(String str) {
		Stack<String> stack = new Stack<>();
		
		return null;
	}
	
	/*
	 * efficient          
	 * 1] reverse individual word  ==> emoclew ot gfg
	 * 2] reverse the whole string ==> gfg to welcome
	 */
	private static void reverseWords1(char[] str) {
		String res = "";
		
		int start=0;
		//1] reverse individual word
		for(int end=0;end<str.length;end++) {
			if(str[end]==' ') {
				reverse(str,start,end-1);
				start=end+1;
			}
		}
		reverse(str,start,str.length-1);
		
		//2] reverse the whole string
		reverse(str,0,str.length-1);
		
	}

	private static void reverse(char[] str, int start, int end) {
		while(start<=end) {
			swap(str, start,end);
			start++;
			end--;
		}
	}

	private static void swap(char[] str, int start, int end) {
		char temp =str[start];
		str[start]=str[end];
		str[end]=temp;
		
	}
}

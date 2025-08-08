package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * we need to find the longest sub-sequence 
 * in the form of x, x+1,x+2,...x+i 
 * with these elements appearing in any order
 */

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arr = {1,9,3,4,2,20};
		int n=arr.length;
		
		int len=findLongestConsecutiveSeq(arr,n);
		System.out.println("LongestConsecutiveSeq: "+ len);
		
		len=findLongestConsecutiveSeq1(arr,n);
		System.out.println("LongestConsecutiveSeq1: "+ len);
	}
	
	/*
	 * efficient- 
	 * insert all in hashTable(set)
	 * then with 2n lookups , we can find result.
	 *
	 * tc->O(n)
	 * sc->O(n)
	 */
	private static int findLongestConsecutiveSeq1(int[] arr, int n) {
		int res=1;
		Set<Integer> set = new HashSet<>();
		//insert all in hashTable(set)
		for(int x: arr)
			set.add(x);
		
		//then with 2n lookups , we can find result.
		for(Integer x: set) {
			if(!set.contains(x-1)) {
				int current =1;
				while(set.contains(x+current))
					current++;
				res=Math.max(current, res);
			}
		}		
		return res;
	}

	/*
	 * naive-using sorting
	 */
	private static int findLongestConsecutiveSeq(int[] arr, int n) {
		
		//sort arr
		Arrays.sort(arr);
		int res=1, current=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]+1)
				current++;
			else if(arr[i]!=arr[i-1]) { //this check is for same element(we ignore counting again if same element present)
				res = Math.max(current, res);
				current=1;
			}
		}
		return res;
	}
}

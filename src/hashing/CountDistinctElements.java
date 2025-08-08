package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {
		int[] arr = {15,12,13,12,13,13,18};
		
		int distinct = countDistinct(arr);
		System.out.println("distinct: "+ distinct);
		
		Integer[] arr1 = {15,12,13,12,13,13,18};
		distinct = countDistinct1(arr1);
		System.out.println("distinct: "+ distinct);
	}

	/*
	 * efficient
	 */
	private static int countDistinct(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);
		return set.size();
	}
	
	/*
	 * improved
	 */
	private static int countDistinct1(Integer[] arr) {
		
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		return set.size();
	}
	
}

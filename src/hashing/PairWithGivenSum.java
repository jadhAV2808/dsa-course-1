package hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {3,2,8,15,-8};
		int sum=17;
		
		boolean isPair = isPair(arr,sum);
		System.out.println("isPair: "+ isPair);
		
		isPair = isPair1(arr,sum);
		System.out.println("isPair: "+ isPair);
	}

	/*
	 * naive
	 */
	private static boolean isPair(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+ arr[j]==sum)
					return true;
			}
		}
		return false;
	}
	
	
	/*
	 * efficient
	 * tc>O(n)
	 * sc->O(n)
	 */
	private static boolean isPair1(int[] arr, int sum) {
		Set<Integer> set = new HashSet<>();
		for(int x:arr) {
			if(set.contains(sum-x))
				return true;
			else
				set.add(x);
		}
		return false;
	}
}

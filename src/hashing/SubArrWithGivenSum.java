package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {5,8,6,13,3,-1};
		int n= arr.length;
		int sum=22;
		
		boolean isSubArrSum = isSubArrSum(arr,n,sum);
		System.out.println("isSubArrSum: "+ isSubArrSum);
		
		isSubArrSum = isSubArrSum1(arr,n,sum);
		System.out.println("isSubArrSum1: "+ isSubArrSum);
	}
	
	/*
	 * efficient-using prefix sum & hashing
	 * tc-> O(n)
	 * sc->O(n)
	 */
	private static boolean isSubArrSum1(int[] arr, int n, int sum) {

		Set<Integer>set = new HashSet<>();
		int PrefixSum =0;
		for(int i=0;i<n;i++) {
			PrefixSum+=arr[i];
			if(PrefixSum==sum)
				return true;
			if(set.contains(PrefixSum-sum))
				return true;
			set.add(PrefixSum);
		}
		return false;
	}
		

	/*
	 * naive
	 * tc-> O(n^2)
	 * sc->O(1)
	 */
	private static boolean isSubArrSum(int[] arr, int n, int sum) {
		for(int i=0;i<n;i++) {
			int currentSum=0;
			for(int j=i;j<n;j++) {
				currentSum+=arr[j];
				
				if(currentSum==sum)
					return true;
			}
		}
		return false;
	}
}

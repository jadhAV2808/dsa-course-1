package hashing;

import java.util.HashSet;
import java.util.Set;


public class SubArrWithZeroSum {

	public static void main(String[] args) {
		int[] arr = {3,2,1,-1,8,1,-8};
		int n=arr.length;
		
		boolean isZeroSum = isZeroSum(arr,n);
		System.out.println("isZeroSum: "+ isZeroSum);
		
		isZeroSum = isZeroSum1(arr,n);
		System.out.println("isZeroSum1: "+ isZeroSum);
	}
	
	
	/*
	 * efficient-using prefix sum & hashing
	 */
	private static boolean isZeroSum1(int[] arr, int n) {
		Set<Integer>set = new HashSet<>();
		int PrefixSum =0;
		for(int i=0;i<n;i++) {
			PrefixSum+=arr[i];
			if(set.contains(PrefixSum))
				return true;
			if(PrefixSum==0)
				return true;
			set.add(PrefixSum);
		}
		return false;
	}

	/*
	 * naive
	 * O(n^2)
	 */
	private static boolean isZeroSum(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum==0)
					return true;
			}
		}
		return false;
	}
}

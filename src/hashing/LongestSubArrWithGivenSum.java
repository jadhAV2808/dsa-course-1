package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrWithGivenSum {

	public static void main(String[] args) {
		
		int[] arr = {5,8,-4,1,-4,-1,9,-2,2};
		int n= arr.length;
		int sum=0;
		
		int subArrSum = lengthOfLonestSubArrrSum(arr,n,sum);
		System.out.println("subArrSum: "+ subArrSum);
		
		subArrSum = lengthOfLonestSubArrrSum(arr,n,sum);
		System.out.println("subArrSum: "+ subArrSum);
	}

	/*
	 * efficient
	 * tc->O(n)
	 * sc->O(n)
	 */
	private static int lengthOfLonestSubArrrSum1(int[] arr, int n, int sum) {
		int res =0;
		Map<Integer, Integer> map = new HashMap<>();
		int preSum=0;
		
		for(int i=0;i<n;i++) {
			preSum+=arr[i];
			if(preSum==sum)
				res=i+1;
			if(map.containsKey(preSum)==false)
				map.put(preSum, i);
			if(map.containsKey(preSum-sum))
				res = Math.max(res, i-map.get(preSum-sum));
		}
		
		return res;
	}
	
	
	
	
	
	
	
	/*
	 * naive
	 * tc->O(n^2)
	 */
	private static int lengthOfLonestSubArrrSum(int[] arr, int n, int sum) {
		int res =0;
		for(int i=0;i<n;i++) {
			int currentSum=0;
			for(int j=i;j<n;j++) {
				currentSum+=arr[j];
				if(currentSum==sum)
					res=Math.max(res, j-i+1);
			}
		}
		return res;
	}
}

package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MoreThanNByK {
	
	public static void main(String[] args) {
		int[] arr = {30,10,20,20,20,10,40,30,30};
		int n=arr.length;
		int k=4;
		
		printNByK(arr,n,k);
		printNByK1(arr,n,k);
	}
	
	
	
	/*
	 * for cases where n is very greater means array is very large size 
	 * & k is very small.
	 * 
	 * efficient: Moores voting algo
	 * 
	 * tc->O(nk)
	 * sc->O(n)
	 * 
	 *1] create an empty map m
	 *2] for(int i=0;i<n;i++){
	 *     if(m.contains(arr[i]) m.(arr[i])++;
	 *     else if(m.size()<k-1 ) m.put(arr[i],1)
	 *     else  decrease all value in map by one. if value becomes 0 remove it
	 *       
	 *   }
	 * 3] for all elements in map m, print the elements 
	 *    that actually appears more than n/k times
	 */
	private static void printNByK2(int[] arr, int n, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			
		}
	}
	
	
	/*
	 * efficient-using hashing
	 * tc->O(n)
	 * sc->O(n)
	 */
	private static void printNByK1(int[] arr, int n, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int x: arr)
			map.put(x, map.getOrDefault(x, 0)+1);
		for (Map.Entry<Integer, Integer> e: map.entrySet()) {
			if(e.getValue()>n/k)
				System.out.print(e.getKey()+" ");
		}
		
		System.out.println(" ");
	}

	/*
	 * naive-using sorting
	 * tc->O(nlogn)+O(n)
	 */
	private static void printNByK(int[] arr, int n, int k) {
		Arrays.sort(arr);  // O(nlogn)
		int i=1, cnt =1;
		
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				cnt++;
				i++;
			}
			if(cnt>n/k)
				System.out.print(arr[i-1]+" ");
			cnt=1;
			i++;
		}
		System.out.println(" ");
	}

}

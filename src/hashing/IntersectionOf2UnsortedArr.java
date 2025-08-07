package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOf2UnsortedArr {

	public static void main(String[] args) {
		
		int[] arr1= {10,15,20,25,30,50};
		int[] arr2 = {30,5,15,80};
		
		printIntersection(arr1, arr1.length, arr2, arr2.length);
		printIntersection1(arr1, arr1.length, arr2, arr2.length);
	}

	/*
	 * naive 
	 */
	private static void printIntersection(int[] arr1,int m,  int[] arr2, int n) {		
		
		for(int i=0;i<m;i++) {
			boolean flag = false;
			
			for(int j=0;j<n;j++) {
				if(arr1[i]==arr2[j]) {
					flag = true;
					break;
				}
			}
			if(flag)
				System.out.print(arr1[i]+" ");
		}
		System.out.println(" ");
	}
	
	/*
	 * efficient 
	 */
	private static void printIntersection1(int[] arr1,int m,  int[] arr2, int n) {		
		Set<Integer> set = new HashSet();
		
		for(int x:arr2)
			set.add(x);
		for(int x:arr1) {
			if (set.contains(x)) {
				System.out.print(x+" ");
			}
		}
		System.out.println(" ");			
	}
}

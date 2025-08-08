package hashing;

import java.util.HashSet;

public class UnionOf2UnSortedArr {

	public static void main(String[] args) {
		int[] a1 = {15,20,5,15};
		int[] a2 = {15,15,15,20,10};
		
		union(a1,a2);
	}

	private static void union(int[] a1, int[] a2) {
		HashSet<Integer> set = new HashSet<>();
		for(int x: a1)
			set.add(x);
		for(int x: a2)
			set.add(x);
		System.out.println(set);
	}
}

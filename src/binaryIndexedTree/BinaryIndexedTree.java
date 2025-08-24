package binaryIndexedTree;

import java.util.Arrays;

import tree.BurnBTFromLeaf;

public class BinaryIndexedTree {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		//construct BIT
		int[] bITree = constructBIT(arr, arr.length);
		
		System.out.println(Arrays.toString(bITree));
		
		
		//prefix sum
		int sum = getSum(3,bITree);
		System.out.println("sum: "+ sum);
		
		//update
		update(arr, bITree,2,35);
		
		sum = getSum(3,bITree);
		System.out.println("sum: "+ sum);
		
	}

	private static int[] constructBIT(int[] arr, int n) {
		int[] res = new int[n+1];
		
		Arrays.fill(res, 0);
		
		for(int i=0;i<n;i++) {
			buildBIT(i, arr[i], res,n);
		}
		
		return res;
	}

	private static void buildBIT(int i, int data, int[] res, int n) {
		i=i+1;
		while(i<=n) {
			res[i]= res[i]+data;
			i= i+(i & (-i));
		}
	}

	private static void update(int[] arr, int[] bITree, int index, int key) {
		int n=arr.length;
		int diff =key- arr[index];
		arr[index]=key;
		
		index=index+1;
		while(index<=n) {
			bITree[index]=bITree[index]+ diff;
			index=index + (index & -index);
		}
		
		
		
	}

	private static int getSum(int i, int[] bITree) {
		i=i+1;
		int res=0;
		
		while(i>0) {
			res= res+ bITree[i];
			i=i-i&(-i);
		}
		return res;
	}

}

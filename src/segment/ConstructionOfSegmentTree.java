package segment;

import java.util.Arrays;

public class ConstructionOfSegmentTree {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		int n=arr.length;
		int[] result = buildSegmentTree(arr,n);
		
		System.out.println("segment tree: "+ Arrays.toString(result));
	}

	public static int[] buildSegmentTree(int[] arr, int n) {
		int ss=0,se=n-1,si=0;
		int[] res= new int[4*n];
		
		constrcutSt(arr,n,ss,se,si,res);
		
		return res;
	}

	public static int constrcutSt(int[] arr, int n, int ss, int se, int si, int[] res) {
		if(ss==se) {
			res[si]=arr[ss];
			return arr[ss];
		}
		int mid=(ss+se)/2;
		
		res[si]=constrcutSt(arr, n, ss, mid, 2*si+1, res) + 
				constrcutSt(arr, n, mid+1, se, 2*si+2, res);
		
		return res[si];
	}
}

package heap;

import java.util.Arrays;

public class KClosest {

	public static void main(String[] args) {
		
		int[] arr  = {10,30,5,40,38,80,70};
		int n =arr.length;
		int k =3;
		int x = 35;
		
		
		printKClosest(arr,n,k,x);
	}

	private static void printKClosest(int[] arr, int n, int k, int x) {
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		
		for(int i=0;i<k;i++) {
			int minDiff = Integer.MAX_VALUE;
			int minDiffIndex=0;
			
			for(int j=0;j<n;j++) {
				if(!visited[j] && Math.abs(arr[j]-x)<=minDiff) {
					minDiff=Math.abs(arr[j]-x);
					minDiffIndex=j;
				}
				System.out.print(arr[minDiffIndex]+" ");
				visited[minDiffIndex]=true;
			}
			
		}
	}
}

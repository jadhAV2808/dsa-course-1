package matrix;

import java.util.Arrays;



public class MedianOfRowWiseSorted {
	
	public static void main(String[] args) {
		int[][] arr = {
					{1,10,20},
					{15,25,35},
					{5,30,40}
				};
		
		int median = findMedian(arr);
		System.out.println("median: "+ median);
		
		median = findMedian1(arr);
		System.out.println("median: "+ median);
	}

	/*
	 * naive:
	 * tc- > O(rc log rc)s
	 * 
	 * 1] put all elements in an 1D arr[]
	 * 2] sort the 1D arr[]
	 * 3]return middle element of sorted 1D arr
	 */
	private static int findMedian(int[][] arr) { 
		int[] tmp = new int[arr.length *arr[0].length ];
		int k=0;
		
		//1] put all elements in an 1D arr[]
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				tmp[k]= arr[i][j];
				k++;
			}			
		}
		//2] sort the 1D arr[]
		Arrays.sort(tmp);
		
		System.out.println("sorted arr: "+ Arrays.toString(tmp));
		//3]return middle element of sorted 1D arr
		return tmp[tmp.length/2];
	}
	
	
	/*
	 * efficient:
	 * tc- > O(r * log(max-min) * log c)
	 */
	private static int findMedian1(int[][] arr) {
		int r=arr.length;
		int c=arr[0].length;
		
		//find min & max
		int min=arr[0][0],   max = arr[0][c-1];
		
		for(int i=1;i<r;i++) {
			if(arr[i][0]<min) {
				min=arr[i][0];
			}
			if(arr[i][c-1]>max) {
				max=arr[i][c-1];
			}
		}
		int medPos = (r*c+1)/2;
		
		while(min<max) {
			int mid = (min+max)/2, midPos = 0;
			
			for(int i=0;i<r;i++) {
				int pos  = Arrays.binarySearch(arr[i], mid) +1;
				midPos+=Math.abs(pos);
			}
			
			if(midPos<medPos)
				min=mid+1;
			else
				max=mid;
		}
		return min;
	}

}

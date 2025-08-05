package sorting;

import java.util.Arrays;

public class MergeFunction {

	public static void main(String[] args) {
		int[] arr = {10,15,20,11,30};
		int low=0, mid=2, high=4;
		
		
		int[] res = sort(arr, low,mid,high);
		System.out.println(Arrays.toString(res));
	}

	private static int[] sort(int[] arr, int low, int mid, int high) {
		
		int n1= mid-low+1, n2=high-mid;
		
		int[] left=new int[n1];
		int[] right =new int[n2];
		
		for(int i=0;i<n1;i++)
			left[i]=arr[i+low];
		for(int i=0;i<n2;i++)
			right[i]=arr[mid+1+i];
		
		
		return merge(left,right,n1,n2);
	}
	
	private static int[] merge(int[] arr1, int[] arr2, int n1, int n2) {
		int temp[] =new int[n1+n2];
		int i=0, j=0, k=0;
		while(i<n1 && j<n2) {
			if(arr1[i] <= arr2[j]) {
				temp[k]=arr1[i];
				i++;
				k++;
			}else {
				temp[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n1 ) {
			temp[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2 ) {
			temp[k]=arr2[j];
			j++;
			k++;
		}
		return temp;
	}
}

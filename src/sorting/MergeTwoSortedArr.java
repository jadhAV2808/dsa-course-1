package sorting;

import java.util.Arrays;

public class MergeTwoSortedArr {

	public static void main(String[] args) {
		int[] arr1= {10,15,20};
		int n1=arr1.length;
		int[] arr2= {5,6,6,15};
		int n2=arr2.length;
		
		int[] arr = merge(arr1,arr2,n1,n2);
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * efficient
	 */
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

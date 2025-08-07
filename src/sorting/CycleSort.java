package sorting;

import java.util.Arrays;

/*
 * Intro:
 *  O(n^2) worst time complexity
 *  does min memory writes & can be useful for cases where memory write is costly
 *  in-place & not-stable
 *  useful to solve que. like find min. swaps required to start an array
 */
public class CycleSort {

	public static void main(String[] args) {
		int[] arr = {20,40,50,10,30};
		int n =arr.length;
		sortDistinct(arr,n);
		System.out.println("Sorted Arr: "+ Arrays.toString(arr));
	}

	private static void sortDistinct(int[] arr, int n) {
		//count how many elelment smaleller thnn a curr element
		
		for(int cs=0;cs<n-1;cs++) {
			
			int itm=arr[cs];
			int pos = cs;
			
			for(int i=cs+1;i<n;i++) {
				if(arr[i]<itm)
					pos++;
			}
			//swap
			int temp = arr[pos];
			arr[pos]=itm;
			itm=temp;
			
			
			while(pos!=cs) {
				pos=cs;
				for(int i=cs+1;i<n;i++) {
					if(arr[i]<itm)
						pos++;
				}
				//swap
				temp = arr[pos];
				arr[pos]=itm;
				itm=temp;
			}
		}
	}
}

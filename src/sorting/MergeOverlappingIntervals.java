package sorting;

import java.util.Arrays;

/*
 * how to check if 2 intervals overlapping?
 * => 1] find larger value of start and then check if it lies in other interval. 
 * OR
 * => 2] find smaller value of end and then check if it lies in other interval. 
 */

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		Pair[] arr = { new Pair(2, 4), new Pair(1, 3),
				new Pair(6, 8), new Pair(5, 7) };
		
		int n=arr.length;
		
		megreOverlappingIntervals(arr,n);   //o/p: { [1,4], [5,8] }
		System.out.println(" ");
		
		
//		megreOverlappingIntervals1(arr,n); 
	}
	
	/*
	 * efficient
	 * 
	 * sort by start time in increasing order 
	 * OR
	 * sort by end time in decreasing order 
	 */
	private static void megreOverlappingIntervals1(Pair[] arr, int n) {
		
		//sort by start time in increasing order
		Arrays.sort(arr, (p1,p2)->p1.start-p2.start);
//		System.out.println(Arrays.toString(arr));
		
//		Pair res = arr[0];
		int res =0;
		for(int i=1;i<n;i++) {
			if(arr[res].end >=arr[i].start) {
				arr[res].end = Math.max(arr[res].end, arr[i].end);
				arr[res].start = Math.min(arr[res].start,  arr[i].start);
				
			}else {
				res++;
				arr[res]=arr[i];
			}
		}
		
		for(int i=0;i<res;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	/*****************************************************************/

	/*
	 * naive 
	 * tc->O(n3)
	 */
	private static void megreOverlappingIntervals(Pair[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1; j<n;j++) {
				
				if(isOverlapping(arr[i],arr[j])) {
					mergeIntervals(arr[i],arr[j]);
				}
			}
		}
	}

	private static void mergeIntervals(Pair pair1, Pair pair2) {
		
	
		Pair pair = new Pair();
		pair.start = Math.min(pair1.start, pair2.start);
		pair.end = Math.max(pair1.end, pair2.end);
		
		System.out.print(pair+"    ");
	}

	private static boolean isOverlapping(Pair pair1, Pair pair2) {
		
		//1] find larger value of start and then check if it lies in other interval. 
		if(pair1.start>pair2.start) {
			if(pair1.start >= pair2.start && pair1.start <= pair2.end)
				return true;
		}else {
			if(pair2.start >=pair1.start && pair2.start<=pair1.end)
				return true;
		}
		
		return false;
	}
}


class Pair{
	int start;
	int end;
	public Pair() {
		
	}
	public Pair(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "Pair [start=" + start + ", end=" + end + "]";
	}
	
	
}

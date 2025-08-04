package array;

public class MajorityElements {

	public static void main(String[] args) {
		int[]arr = {8,4,3,8,8};
		int n = arr.length;
		
		int element = findMajorityElement(arr, n);
		System.out.println("element: "+ element);
		
		element = findMajorityElement1(arr, n);
		System.out.println("element: "+ element);
	}

	/*
	 * naive
	 */
	private static int findMajorityElement(int[] arr, int n) {
		
		
		for(int i=0;i<n;i++) {
			int cnt = 1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					cnt++;				
			}
			if(cnt>n/2)
				return arr[i];
		}
		
		return -1;
	}
	
	/*
	 * efficient
	 * 
	 * Moore's algo:
	 * 
	 * 1st phase: find a candidate
	 * 2nd phase: check if the candidate is a actually a majority element
	 */
	private static int findMajorityElement1(int[] arr, int n) {
		//p1
		int res = 0; int cnt = 0;
		for(int i=1;i<n;i++) {
			if(arr[res] == arr[i])
				cnt++;
			else {
				cnt--;
			}
			if(cnt == 0) {
				res = i;
				cnt = 1;
			}
		}
		
		//p2
		cnt = 0;
		for(int i=0;i<n;i++) {
			if(arr[res] == arr[i])
				cnt++;			
		}
		if(cnt<=n/2)
			return -1;
		
		return arr[res];
		
	}
}

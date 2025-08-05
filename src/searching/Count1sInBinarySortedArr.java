package searching;


public class Count1sInBinarySortedArr {

	public static void main(String[] args) {
		int[] binaryArr = {0,0,0,1,1,1,1,1};
		int cnt1s = count1s(binaryArr, binaryArr.length, 1);
		System.out.println("1s count: "+ cnt1s);
	}
	
	
	private static int count1s(int[] arr, int n, int x) {
		int lo =0, hi=n-1;
		while(lo<hi) {
			int mid =(hi+lo)/2;
			
			if(arr[mid]>x)
				hi=mid-1;
			else if(arr[mid]<x)
				lo=mid+1;
			else {
				if(mid == n-1 || arr[mid]!=arr[mid-1])
					return (n-mid);
				else
					hi =mid-1;
			}
		}
		return 0;
	}
}

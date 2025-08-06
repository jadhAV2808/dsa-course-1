package searching;

public class SearchInSortedRotatedArr {

	public static void main(String[] args) {
		int[] arr = {10,20,40,100,1,2};
		int n =arr.length;
		int x=10;
		
		int idx = search(arr,n,x);
		System.out.println("idx: "+ idx);
	}

	private static int search(int[] arr, int n, int x) {
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = (lo+hi) / 2;
            if (arr[mid] == x) return mid;

            if (arr[lo] <= arr[mid]) {
                if (x >= arr[lo] && x < arr[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {
                if (x > arr[mid] && x <= arr[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}

package array;

public class FrequenciesInSorted {

	public static void main(String[] args) {
		int[] arr = {10, 10, 10, 25, 30,30};
		int n = arr.length;
		
		findFreq(arr,n);
	}

	private static void findFreq(int[] arr, int n) {
		int freq = 1,  i=1;
		while(i<n) {
			while (i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println("element: "+arr[i-1]+" =>  freq: "+ freq);
			
			i++;
			freq=1;
		}
		
		if(n==1 ||  arr[n-1]!=arr[n-2]) {
			System.out.println("element: "+arr[n-1]+" =>  freq: "+ 1);
		}
	}
}

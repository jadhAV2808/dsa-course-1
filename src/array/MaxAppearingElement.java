package array;

public class MaxAppearingElement {

	public static void main(String[] args) {
		int[] left = {1,2,5,15};
		int[] right = {5,8,7,18};
		int n =left.length;
		
		//output should be 5 ,
		//as it appearing most in the left to right ranges
		
		int maxAppear = maxAppear(left,right,n);
		System.out.println("maxAppear: "+ maxAppear);
		
		maxAppear = maxAppear1(left,right,n);
		System.out.println("maxAppear: "+ maxAppear);
	}

	/*
	 * naive
	 */
	private static int maxAppear(int[] left, int[] right, int n) {
		
		int[] freq = new int[100];
		for(int i=0;i<n;i++) {
			for(int j=left[i]; j<=right[i];j++)
				freq[j]+=1;			
		}
		int res= 0;
		for(int i=0;i<100;i++) {
			if(freq[i]>freq[res])
				res=i;
		}
		return res;
	}
	
	
	
	/*
	 * efficient
	 */
	private static int maxAppear1(int[] left, int[] right, int n) {
		
		int[] freq = new int[100];
		for(int i=0;i<n;i++) {
			freq[left[i]]++;
			freq[right[i]+1]--;
		}
		int res=0;
		for(int i=1;i<100;i++) {
			freq[i] = freq[i]+ freq[i-1];
			if(freq[i]>freq[res])
				res = i;
		}
		return res;
	}
}

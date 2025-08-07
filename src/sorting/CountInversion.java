package sorting;


/*
 * inversion: a pair (arr[i],arr[j])  
 * forms an inversion when 
 * i<j & arr[i]>arr[j]
 */

public class CountInversion {

	public static void main(String[] args) {
		int[ ]arr = {2,4,1,3,5};
		int n=arr.length;
		
		int cnt = inversionCount(arr,n);
		System.out.println("cnt: "+ cnt);
		
		cnt = inversionCount1(arr,0,n-1);
		System.out.println("cnt: "+ cnt);
	}
	
	
	/*
	 * efficient
	 */
	private static int inversionCount1(int[] arr, int l, int r) {
		int cnt=0;
		if(l<r) {
			int m = l+(r-l)/2;
			cnt+= inversionCount1(arr, l, m);
			cnt+= inversionCount1(arr, m+1, r);
			cnt+= countAndMerge(arr,l,m,r);
		}
		return cnt;
	}
	

	private static int countAndMerge(int[] arr, int l, int m, int r) {
		int n1=m-l+1, n2=r-m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++)
			left[i]=arr[l+i];
		for(int i=0;i<n2;i++)
			right[i]=arr[m+1+i];
		
		int res=0, i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}else {
				arr[k] =right[j];
				j++;
				res=res+(n1-i);
			}
			k++;	
		}
		
		while(i<n1 ) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] =right[j];
			j++;
			k++;
		}
		return res;
	}


	/*
	 * naive
	 */
	private static int inversionCount(int[] arr, int n) {
		int cnt=0;
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(arr[i]>arr[j])
					 cnt++;
			 }
		 }
		return cnt;
	}
}

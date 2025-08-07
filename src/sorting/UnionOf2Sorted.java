package sorting;

import java.util.Arrays;

public class UnionOf2Sorted {

	public static void main(String[] args) {
		int[] a= {3,5,8};
		int n1=a.length;
		
		int[] b = {2,8,9,10,15};
		int n2=b.length;
		
		union(a,b,n1,n2);
		union1(a,b,n1,n2);
		
	}
	
	/*
	 * efficient
	 */
	private static void union1(int[] a, int[] b, int n1, int n2) {
		int i=0, j=0;
		while(i<n1 && j<n2) {
			
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && b[j]==b[j-1]) {
				j++;
				continue;
			}
			if(a[i]<b[j]) {
				System.out.print(a[i]+ " ");
				i++;
			}	
			else if(a[i]>b[j]) {
				System.out.print(b[j]+ " ");
				j++;
			}
			else {
				System.out.print(a[i]+ " ");
				i++;
				j++;
			}
		}
		
		while(i<n1 ) {
			if(i>0 && a[i] !=a[i-1]) {
				System.out.print(a[i]+ " ");
				i++;
			}
		}
		
		while(j<n2) {
			if(j>0 && b[j]!=b[j-1]) {
				System.out.print(b[j]+ " ");
				j++;
			}
		}
		
		System.out.println(" ");
	}

	/*
	 * naive
	 */
	private static void union(int[] a, int[] b, int n1, int n2) {
		int res[] =new int[n1+n2];
		
		for(int i=0;i<n1;i++) {
			res[i]=a[i];
		}
		
		for(int i=0;i<n2;i++) {
			res[i+n1]=b[i];
		}
		
		Arrays.sort(res);
		
		for(int i=0;i<res.length;i++) {
			if(i==0 || res[i] != res[i-1])
				System.out.print(res[i]+" ");
		}
		System.out.println(" ");
	}
}

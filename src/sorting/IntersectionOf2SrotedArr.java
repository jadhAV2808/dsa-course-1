package sorting;

import java.util.Arrays;

public class IntersectionOf2SrotedArr {

	public static void main(String[] args) {
		int a[] = {3,5,10,10,10,15,15,20};
		int n1=a.length;
		
		int b[] = {5,10,10,15,30};
		int n2=b.length;
		
//		int[] res = findInterSection(a,b,n1,n2);
//		System.out.println("inttercestion: "+ Arrays.toString(res));
		
		findInterSection(a,b,n1,n2);
		findInterSection1(a,b,n1,n2);
	}
	
	/*
	 * efficient
	 */
	private static void findInterSection1(int[] a, int[] b, int n1, int n2) {
		int i=0, j=0;
		
		while(i <n1 && j<n2) {
			
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			
			if(a[i]<b[j])
				i++;
			else if(a[i]>b[j])
				j++;
			else {
				System.out.print(a[i] + " ");
	            i++;
	            j++;
			}
				
		}
		System.out.println(" ");
	}

	/*
	 * naive
	 */
	private static void findInterSection(int[] a, int[] b, int n1, int n2) {
		
		for(int i=0;i<n1;i++) {
			if(i>0 && a[i]==a[i-1])
				continue;
			
			for(int j=0;j<n2;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
		System.out.println(" ");
	}
	
}

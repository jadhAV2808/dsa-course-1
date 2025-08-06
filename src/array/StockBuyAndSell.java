package array;

import java.io.CharArrayReader;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int[]arr = {1,5,3,8,12};
		int n =arr.length;
		int maxProfit = maxProfit(arr, 0,n-1);
		System.out.println("max. Profit: "+ maxProfit);
		
		maxProfit = maxProfit(arr,n);
		System.out.println("max. Profit: "+ maxProfit);
	}
	

	/*
	 * naive solution
	 */
	private static int maxProfit(int[] arr, int start, int end) {
		
		if(end<=start) 
			return 0;
		int profit = 0;
		
		for(int i = start; i<end; i++) {
			for(int j = i+1; j<=end; j++) {
				if(arr[j]>arr[i]) {
					int currenP = arr[j]-arr[i] + 
							maxProfit(arr, start, i-1) +
							maxProfit(arr, j+1, end);
					
					profit = Math.max(profit, currenP);
				}
			}
		}
		return profit;
	}
	
	/*
	 * efficient
	 */
	private static int maxProfit(int[] arr, int n) {
		 
		int profit = 0;
		for(int i = 1; i<n; i++) {
			if(arr[i]>arr[i-1])
				profit += (arr[i]-arr[i-1]);
		}
		
		
		return profit;
		
	}
	
	
	
}

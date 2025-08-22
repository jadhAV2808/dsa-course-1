package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.ZipEntry;

public class CoinsProblem {

	public static void main(String[] args) {
		
		Integer[] coins = {1,2,5,10};
		int n=coins.length;
		int amount = 52;
		
		int cnt = minimumCoinsToPay(coins,n,amount);
		System.out.println("minimum coins to pay: "+ cnt);
	}

	/*
	 * naive 
	 */
	private static int minimumCoinsToPay(Integer[] coins, int n, int amount) {
		int res =0;
		//sort arr  in descending order
		Arrays.sort(coins, (a,b)->b-a);
		
		for(int i=0;i<n;i++) {
			if(coins[i]<=amount) {
				int c = amount/coins[i];
				res+=c;
				amount = amount-c*coins[i];
			}
			if(amount==0)
				break;
		}
		return res;
	}
	
	/*
	 * general structure of greedy
	 * 
	 * 
	 */
}

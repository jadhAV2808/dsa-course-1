package sorting;

import java.util.Arrays;

public class MeetingMaximumGuests {

	public static void main(String[] args) {
		int[] arr = {600,700,900};  //arrival time
		int[] dp = {730,800,1000};   // departure time
		int n = arr.length;
		int maxMeetCnt = maxGuestsMeetCount(arr, dp,n);
		
		System.out.println("maxMeetCnt: "+ maxMeetCnt);
	}

	private static int maxGuestsMeetCount(int[] arr, int[] dp, int n) {
		
		
		Arrays.sort(arr);
		Arrays.sort(dp);
		
		int i=1, j=0, res=1, curr=1;
		
		while(i<n && j<n) {
			if(arr[i]<=dp[j]) {
				curr++;
				i++;
			}else {
				curr--;
				j++;
			}
			
			res = Math.max(res, curr);
		}
		
		return res;
	}
}

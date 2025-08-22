package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		
		Activity[] arr = { new Activity(10,20), new Activity(20,30), new Activity(12,25)};
		int cnt = maxActivities(arr, arr.length);
		System.out.println("max actviites ot completesd " + cnt);
		
	}
	
	/*
	 * 1] sort activities according to finish time
	 * 2] initialize solution as first activity
	 * 3] do following for remaining activities:
	 *   a] if current activity overlaps with the last picked activity in the solution the ignore the current activity.
	 *   b] else add the current activity to the solution.
	 */
	public static int maxActivities(Activity[] arr, int n) {
		
		Arrays.sort(arr, new MyComp());
		int res=1;
		int prev=0;
		for(int current=1; current<arr.length;current++) {
			
			if(arr[current].startTime>=arr[prev].endTime) {
				res++;
				prev=current;
			}
		}
		return res;
	}
}


class Activity{
	int startTime;
	int endTime;
	
	public Activity() {}
	
	public Activity(int startTime, int endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}	
}

class MyComp implements Comparator<Activity>{

	@Override
	public int compare(Activity o1, Activity o2) {
		
		return o1.endTime-o2.endTime;
	}
	
}
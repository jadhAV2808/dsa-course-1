package greedy;

import java.util.Arrays;

public class JobSequencingProblem {

	public static void main(String[] args) {
		JobModel[] arr = {  new JobModel("j0", 3, 70), 
							new JobModel("j1", 1, 80),
							new JobModel("j2", 1, 30),
							new JobModel("j3", 1, 100)
				
		};
		int n=arr.length;
		
		int maxProfit = getMaxProfit(arr,n);
		System.out.println("maxProfit: "+ maxProfit);
		
	}

	/*
	 * 1] sort jobs in decreasing order
	 * 2] initialize  the reslt as first job in the sorted list, 
	 *     assign the latest possible slot.
	 * 3] do the following for the remaining (n-1) jobs:
	 *       a] if this job can not added, ignore it.
	 *       b] else add it to the latest possible slot.
	 *       
	 * 
	 */
	private static int getMaxProfit(JobModel[] arr, int n) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int[] slot = new int[n];
		Arrays.fill(slot, 0);
		
		slot[arr[0].deadline]=1;
		int res = arr[0].profit;
				
		for(int i=1;i<n;i++) {
			
			if(slot[arr[i].deadline]==0) {
				res+=arr[i].profit;
				slot[arr[i].deadline]=1;
			}
		}
		return res;
	}
}

class JobModel implements Comparable<JobModel>{
	String jname;
	int deadline;
	int profit;
	
	public JobModel() {}
	
	public JobModel(String jname,int deadline,int profit) {
		this.jname =jname;
		this.deadline=deadline;
		this.profit=profit;
	}

	@Override
	public int compareTo(JobModel o) {
		
		return o.profit-this.profit;
	}

	@Override
	public String toString() {
		return "JobModel [jname=" + jname + ", deadline=" + deadline + ", profit=" + profit + "]";
	}
}

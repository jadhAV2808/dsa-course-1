package stack;


import java.util.Stack;

public class LargestRectAreaInHistogram {

	public static void main(String[] args) {
		int[] arr = {6,2,5,4,1,5,6};
		int n=arr.length;
		
		int maxArea = getMaxRect(arr, n);
		System.out.println("max rect. area: "+maxArea );
		
		maxArea = getMaxRect1(arr, n);
		System.out.println("max rect. area: "+maxArea );
	}

	/*
	 * naive
	 */
	private static int getMaxRect(int[] arr, int n) {
		int res=0;
		
		for(int i=0;i<n;i++) {
			int curr = arr[i];
			
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>=arr[i])
					curr+=arr[i];
				else
					break;
			}
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]>=arr[i])
					curr+=arr[i];
				else
					break;
			}
			res= Math.max(res, curr);
		}
		return res;
	}
	
	/*
	 * better
	 * tc: O(n)
	 * 
	 * 1] initialize res=0;
	 * 2] find previous smaller element for every element
	 * 3] find next smaller element for every element
	 * 4] do following for every element arr[i]
	 *     curr = arr[i]
	 *     curr+= (i-ps[i]-1) * arr[i]
	 *     curr+= (ns[i]-i-1) * arr[i]
	 *     res = max(res, curr)
	 * 5] return res;
	 */
	private static int getMaxRect1(int[] arr, int n) {
		int res=0;
		Stack<Integer> stack= new Stack<>();
		
		for(int i=0;i<n;i++) {
			while (!stack.isEmpty() && arr[stack.peek()]>=arr[i]) {
				int tp = stack.pop();
				int curr = arr[tp]*(stack.isEmpty() ? i : (i-stack.peek()-1));
				res = Math.max(res, curr);
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			int tp=stack.pop();
			int curr = arr[tp]*(stack.isEmpty() ? n : (n-stack.peek()-1));
			res = Math.max(res, curr);	
		}
		return res;
	}
}

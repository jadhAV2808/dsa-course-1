package segment;

public class UpdateQuery {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		int n=arr.length;
		int[] result = ConstructionOfSegmentTree.buildSegmentTree(arr,n);
		
		int index=1;
		int newVal=25;
		update(arr,n,result,index,newVal);
	}

	/*
	 * tc> O(logn)
	 */
	private static void update(int[] arr,int n, int[] tree, int index, int newVal) {
		int diff = newVal-arr[index];
		int ss=0,se=n-1,si=0;
		
		updateRec(tree,index,diff,ss,se,si);
		
		
	}

	private static void updateRec(int[] tree, int index, int diff, int ss, int se, int si) {
		if(index < ss || index > se)
			return;
		tree[si]=tree[si]+ diff;
		if(se>ss) {
			int mid = (ss+se)/2;
			
			updateRec(tree, index, diff, ss, mid, 2*si+1);
			updateRec(tree, index, diff, mid+1, se, 2*si+2);
		}
		
	}

}

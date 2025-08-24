package segment;

public class RangeQueryOnST {
	
	
	public static int[] buildSegmentTree(int[] arr, int n) {
		int ss=0,se=n-1,si=0;
		int[] res= new int[4*n];
		
		constrcutSt(arr,n,ss,se,si,res);
		
		return res;
	}

	public static int constrcutSt(int[] arr, int n, int ss, int se, int si, int[] res) {
		if(ss==se) {
			res[si]=arr[ss];
			return arr[ss];
		}
		int mid=(ss+se)/2;
		
		res[si]=constrcutSt(arr, n, ss, mid, 2*si+1, res) + 
				constrcutSt(arr, n, mid+1, se, 2*si+2, res);
		
		return res[si];
	}

	
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {10,20,30,40};
		int n=arr.length;
		int[] segmentTree = buildSegmentTree(arr,n);
		
		int sum = getSum(segmentTree,n,1,2);
		System.out.println("sum "+ sum);
	}

	
	
	public static int getSum(int[] segmentTree, int n, int qs, int qe) {
		int ss=0, se=n-1, si=0;
		
		return getSumRec(segmentTree, qs,qe,ss,se,si);
	}

	public static int getSumRec(int[] segmentTree, int qs, int qe, int ss, int se, int si) {
		if(se<qs || ss>qe)
			return 0;
		if(qs<=ss && qe>=se)
			return segmentTree[si];
		
		int mid=(ss+se)/2;
		
		return getSumRec(segmentTree, qs, qe, ss, mid, 2*si+1) +
				getSumRec(segmentTree, qs, qe, mid+1, se, 2*si+2);
	}
}

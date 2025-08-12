package stack;

public class KStacksImplInArr {

}


class KStack{
	int []arr;
	int[] top;
	int[] next;
	int k;
	int cap;
	int freeTop=0;
	
	public KStack(int n,int k) {
		arr=new int[n];
		k=k;
		cap=n;
		top=new int[k];
		next=new int[n];
		for(int i=0;i<k;i++) {
			top[i]=-1;			
		}
		for(int i=0;i<n;i++) {
			next[i]= i+1;;			
		}
		next[n-1]=-1;
	}
	
	void push(int sn,int x) {
		int i=freeTop;
		freeTop=next[i];
		next[i]=top[sn];
		top[sn]=i;
		arr[i]=x;
		
	}
	
	int pop(int sn) {
		int i=top[sn];
		top[sn]=next[i];
		next[i]=freeTop;
		freeTop=i;
		return arr[i];
	}
	
	boolean isEmpty(int sn) {
		return top[sn]==-1;
	}
}
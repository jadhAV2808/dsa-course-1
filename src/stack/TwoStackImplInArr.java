package stack;

public class TwoStackImplInArr {
	
	
	public static void main(String[] args) {
		
	}

}

/*
 * we divide array from middle
 * use 1st half for stack1 & 2nd half for tack2
 */
class TwoStack{
	int[] arr;
	int cap;
	int top1;
	int top2;
	
	public TwoStack(int n) {
		arr= new int[n];
		cap=n;
		top1=-1;
		top2=n;		
	}
	
	
	boolean push1(int x) {
		if(top1<top2-1) {
			top1++;
			arr[top1]=x;
			return true;	
		}
		return false;
	}
	
	boolean push2(int x) {
		if(top1<top2-1) {
			top2--;
			arr[top2]=x;
			return true;	
		}
		return false;
	}
	
	Integer pop1() {
		if(top1>=0) {
			int x= arr[top1];
			top1--;
			return x;
		}
		return null;
	}
	
	Integer pop2() {
		if(top2<cap) {
			int x= arr[top2];
			top2++;
			return x;
		}
		return null;
	}
	
	int size1() {
		return top1+1;
	}
	
	int size2() {
		return cap-top2;
	}
	
	
	
	
	
	
}

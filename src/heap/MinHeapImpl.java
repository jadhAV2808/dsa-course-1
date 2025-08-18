package heap;

public class MinHeapImpl {

}


class MinHeap{
	int []arr; 
	int size;
	int cap;
	
	public MinHeap(int c) {
		arr = new int[c];
		size=0;
		cap =c;		
	}
	
	int left(int i) {
		return (2*i+1);
	}
	
	int right(int i) {
		return (2*i+2);
	}
	
	int parent(int i) {
		return (i-1)/2;
	}
	
	
}

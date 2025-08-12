package queue;

public class QueueImplUsingArr {

	public static void main(String[] args) {
		ArrQueue queue=new ArrQueue(10);
		queue.enque(2);
		queue.enque(9);
		queue.enque(12);
		
		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
	}
}

class ArrQueue{
	int[] arr;
	int size;
	int cap;
	
	public ArrQueue(int c) {
		this.cap=c;
		size=0;
		arr=new int[c];
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	
	void enque(int x) {
		if(isFull())
			return;
		
		arr[size]=x;
		size++;
	}
	
	void deque() {
		if(isEmpty())
			return;
		
		for(int i=0;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		size--;
	}
	
	int getFront() {
		if(isEmpty())
			return -1;
		else 
			return 0;
	}
	
	int getRear() {
		if(isEmpty())
			return -1;
		else 
			return size-1;
	}
}
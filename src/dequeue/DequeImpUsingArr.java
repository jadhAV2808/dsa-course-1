package dequeue;

public class DequeImpUsingArr {

	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
}

class ArrDqeue{
	int[] arr; 
	int cap;
	int size;
	int front;
	int rear;
	
	public ArrDqeue(int c) {
		arr= new int[c];
		cap=c;
		size=0;
		front=0;
		rear=0;
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	
	// Delete element from the front
    public int deleteFront() {
        // Empty deque
        if (isEmpty())
            return -1;
        int res = arr[front];

        // Move front index circularly
        front = (front + 1) % cap;
        size--;
        return res;
    }
    
 // Insert element at the front
    public void insertFront(int x) {
        // Full deque
        if (isFull())
            return;

        // Move front index circularly
        front = (front - 1 + cap) % cap;
        arr[front] = x;
        size++;
    }
	
    
    // Insert element at the rear
    public void insertRear(int x) {
        // Full deque
        if (size == cap)
            return;

        // Calculate rear index
        int rear = (front + size) % cap;
        arr[rear] = x;
        size++;
    }
    
 // Delete element from the rear
    public int deleteRear() {
        // Empty deque
        if (size == 0)
            return -1;

        // Calculate rear index
        int rear = (front + size - 1) % cap;
        size--;
        return arr[rear];
    }
    
    // Get the front element
    public int frontEle() { return arr[front]; }

    // Get the rear element
    public int rearEle() {
        // Calculate rear index
        int rear = (front + size - 1) % cap;
        return arr[rear];
    }

}
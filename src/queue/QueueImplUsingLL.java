package queue;

import linkedList.Node;

public class QueueImplUsingLL {

	public static void main(String[] args) {
		
		LLQueue q = new LLQueue();

        // Enqueue elements into the queue
        q.enqueue(10);
        q.enqueue(20);

        // Dequeue elements from the queue
        q.dequeue();
        q.dequeue();

        // Enqueue more elements into the queue
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Dequeue an element from the queue (this should print 30)
        q.dequeue();
	}
}


class LLQueue{
	Node front;
	Node rear;
	
	public LLQueue() {
		front=rear=null;
	}
	
	// Function to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
    
 // Function to print the current state of the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Current Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
 // Function to remove an element from the queue
    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) rear = null;
        temp = null;
        printQueue();
    }

    
    
 // Function to add an element to the queue
    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = rear = node;
            printQueue();
            return;
        }
        rear.next = node;
        rear = node;
        printQueue();
    }
	
	
}
package linkedList;

/*
 * Applications of LL:
 *   1] worst case insertion at the end & begin are O(1)
 *   2] worst case deletion from begin are O(1)
 *   3] insertions & deletions in the middle are O(1) if we have ref. of previous node
 *   4] round robin algo
 *   5] merging 2 sorted LL is faster than arrays
 *   6] implementation of simple memory manager
 *   7] easier implementation of queue & dequeue DS.
 *   
 */

public class Intro {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
	}

}

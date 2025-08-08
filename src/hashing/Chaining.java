package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 *  Chaining:
 *    Linked List (or a Dynamic Sized Array) is used to implement this technique. 
 *    So what happens is, when multiple elements are hashed into the same slot index, 
 *    then these elements are inserted into a singly-linked list which is known as a chain.
 *    
 *  Performance:
 *  
 *  m = Number of slots in hash table
	n = Number of keys to be inserted in hash table

	Load factor α = n/m
	
	Expected time to search = O(1 + α)
	Expected time to delete = O(1 + α)
	
	Time to insert = O(1)
	Time complexity of search insert and delete is O(1) if  α is O(1)
 *  
 *  
 *  DS fr storing chains:
 *     LL
 *     Dynamic sized arr
 *     Self Balancing BST
 */

public class Chaining {

	public static void main(String[] args) {
		int[] keys = {50,21,58,17,15,49,56,22,23,25};
		
	}
}


class MyHash{
	int BUCKET;
	ArrayList<LinkedList<Integer>> tableArrayList;
	
	
	void insert(int key) {
		int i = key%BUCKET;
		tableArrayList.get(i).add(key);
	}
	
	void remove(int key) {
		int i = key%BUCKET;
		tableArrayList.get(i).remove((Integer)key);
	}
	
	boolean search(int key) {
		int i = key%BUCKET;
		return tableArrayList.get(i).contains(key);
		
	}
}




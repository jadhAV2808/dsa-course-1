package hashing;

import java.util.zip.ZipEntry;

/*
 * Open Addressing:  
 *   no. of slots in hash table>=no of keys to be inserted.
 *   cache friendly.
 *   
 *   linear probing: linearly search for next empty slot.
 * 
 * 
 * 1. Linear Probing: 
 * Operations:
 *  Insert(k): 
 *     Keep probing until an empty slot is found.
 *      Once an empty slot is found, insert k. 
	Search(k): 
	    Keep probing until the slot's key doesn't become equal to k or an empty slot is reached. 
	Delete(k): 
	    Delete operation is interesting. 
	    If we simply delete a key, then the search may fail. 
	    So slots of deleted keys are marked specially as "deleted". 
	    The insert can insert an item in a deleted slot, 
	    but the search doesn't stop at a deleted slot. 
	
	
   2. Quadratic Probing :
     
	
 */

public class OpenAddressingHash {
	
	//-1: means empty
	//-2: means delete

	int[] arr;
	int cap, size;
	
	public OpenAddressingHash(int c) {
		cap=c;
		size=0;
		for(int i=0;i<cap;i++) {
			arr[i]=-1;
		}
	}
	
	int hash(int key) {
		return key%cap;
	}
	
	
	boolean search(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {  //-1:empty slot
			if(arr[i]==key)
				return true;
			i=(i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
	}
	
	
	boolean insert(int key) {
		if(size==cap)
			return false;
		
		int i=hash(key);
		while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
			i=(i+1)%cap;
		
		if(arr[i]==key)
			return false;
		else {
			arr[i]=key;
			size++;
			return true;
		}
	}
	

	boolean delete(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if(arr[i]!=-1) {
				arr[i]=-2;         //-2:means delete
				return true;
			}
			i=(i+1)%cap;
			if(i==h)
				return false;			
		}
		return false;
	}
	
	
	
	
	
}

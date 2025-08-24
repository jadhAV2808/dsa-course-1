package trie;

import java.util.Arrays;

public class Representation {

	public static void main(String[] args) {
		String[] data = {"bad", "bat", "geek", "geeks", "cat", "cut", "zoo"};
		TrieNode root=new TrieNode();
		String key ="cat";
		
		
		
		for(int i=0;i<data.length;i++) {
			
			//insert
			insert(root, data[i]);
		}
		
		
		//search
		boolean isFound = search(root, key);
		System.out.println("isFound: "+ isFound);
		
		//delete
		root = delete(root, key,0);
		
		isFound = search(root, key);
		System.out.println("isFound: "+ isFound);
		
	}

	
	
	private static TrieNode delete(TrieNode root, String key,int i) {
		if(root==null)
			return root;
		if(i==key.length()) {
			root.isEnd=false;
			if(isEmpty(root)) 
				root=null;		
			return root;
		}
		int index = key.charAt(i)-'a';
		root.child[index]= delete(root.child[index], key, i+1);
		if(isEmpty(root) && root.isEnd==false)
			root=null;
		
		return root;
		
	}



	private static boolean isEmpty(TrieNode root) {
		
		for(int i=0;i<26;i++) {
			if(root.child[i]!=null)
				return false;
		}
		return true;
	}



	private static void insert(TrieNode root, String key) {
		
		TrieNode curr = root;
		for(int i=0;i<key.length();i++) {
			int index = key.charAt(i)-'a';
			
			if(curr.child[index]==null)
				curr.child[index]=new TrieNode();
		
			curr=curr.child[index];
		}
		curr.isEnd=true;
	}
	
	

	private static boolean search(TrieNode root, String key) {
		TrieNode curr = root;
		for(int i=0;i<key.length();i++) {
			int index = key.charAt(i)-'a';
			
			if(curr.child[index]==null)
				return false;		
			curr=curr.child[index];
		}
		return curr.isEnd;
	}
}




class TrieNode{
	TrieNode[] child = new TrieNode[26];         //26 bcoz a to z
	boolean isEnd;
	
	public TrieNode() {}

	public TrieNode(TrieNode[] child, boolean isEnd) {
		super();
		this.child = child;
		this.isEnd = isEnd;
	}

	@Override
	public String toString() {
		return "TrieNode [child=" + Arrays.toString(child) + ", isEnd=" + isEnd + "]";
	}
	
	
}
package greedy;

import java.util.PriorityQueue;



/*
 * Huffman Coding: 
 * lossless compression technique.
 * variable length coding;
 * used for lossless compression.
 */


/*
 * Huffman Algo:
 * 
 * 1] create leaf nodes and build a min heap h of all the leaves initially.
 * 2] while(h.size>1): 
 *      a] left = h.extractMin()
 *      b] right = h.extractMin()
 *      c] create a new two nodes with:  
 *           i] character as $.
 *           ii] frequency as left.freq + right.freq
 *           iii]  left and right children as left & right respectively.
 *      d] insert new node into h
 * 3] the only node left in h is our required binary tree.
 */

/*
   
   printing huffman codes from the built binary tree
   
   void printCodes(root, str=""){
      if(root==null) 
         return;
      if(roog.ch!="$"){
         print(root.ch+" "+ str);
         return
      }
      printCodes(root.left, str+"0");
      printCodes(root.right, str+"1");   
   }
   
   
 */

public class HuffmanCoding {

	public static void main(String[] args) {
		
		String s = "abcdef";
		int[] freq = {5, 9, 12, 13, 16, 45};
		char[] arr = s.toCharArray();
		
		printHcodes(s,freq);
	}

	private static void printHcodes(String str, int[] freq) {
		
		//building tree
		PriorityQueue<Node> h = new PriorityQueue<>((n1,n2)-> n1.freq-n2.freq);
		
		for(int i=0;i<str.length();i++) {
			h.add(new Node(freq[i], str.charAt(i)));
		}
		
		while(h.size()>1) {
			Node leftNode=h.poll();
			Node rightNode=h.poll();
			
			h.add(new Node(leftNode.freq+rightNode.freq, '$', leftNode,rightNode));		
		}
		
		//printing the codes
		printCodes(h.peek(), "");
	}

	private static void printCodes(Node root, String str) {
		if(root.ch!= '$') {
			System.out.println(root.ch +" "+ str);
			return;
		}
		printCodes(root.left, str+"0");
		printCodes(root.right, str+"1");
		
	}
	
	
}

class Node{
	int freq;
	char ch;
	Node left, right;
	
	public Node() {}

	public Node(int freq, char ch) {
		super();
		this.freq = freq;
		this.ch = ch;
		this.left=null;
		this.right=null;
	}

	public Node(int freq, char ch, Node left, Node right) {
		super();
		this.freq = freq;
		this.ch = ch;
		this.left = left;
		this.right = right;
	}
	
	
	
	
}

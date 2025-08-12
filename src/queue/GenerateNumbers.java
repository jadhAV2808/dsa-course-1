package queue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * given a number n , print  first n numbers(in increassing order) 
 * such that all these numbers have digits in set {5,6}
 */
public class GenerateNumbers {
	
	public static void main(String[] args) {
		int n =10;
		
		//o/p: 5, 6,55,56,65,66,555,556,565,566
		int n1 = 4;
		//o.p: 5,6,55,56
		
		printNumbers(n);
	}

	private static void printNumbers(int n) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("5");
		queue.add("6");
		
		for(int cnt =0; cnt<n; cnt++) {
			String curr = queue.poll();
			System.out.print(curr+" ");
			queue.add(curr+"5");
			queue.add(curr+"6");
		}
	}

}

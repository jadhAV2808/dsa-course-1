package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrElement {

	public static void main(String[] args) {
		int[] arr = {15,12,13,12,13,13,18};
		int n=arr.length;
		
		frequencies(arr,n);
	}

	private static void frequencies(int[] arr, int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet())
			System.out.println(entry.getKey()+": "+ entry.getValue());
	}
}

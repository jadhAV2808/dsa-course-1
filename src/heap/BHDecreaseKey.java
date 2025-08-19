package heap;

import java.util.Arrays;

public class BHDecreaseKey {

	int[] arr; 
	int size, cap;
	
	public BHDecreaseKey(int c) {
//		arr = new int[c];
		size=0;
		cap =c;	
		arr = new int[] {10,20,40,80,100,70};
	}
	
	int left(int i) {
		return (2*i+1);
	}
	
	int right(int i) {
		return (2*i+2);
	}
	
	int parent(int i) {
		return (i-1)/2;
	}
	
	
	
	
	public static void main(String[] args) {
		BHDecreaseKey key = new BHDecreaseKey(6);
		
		key.decreaseKey(3, 5);
		
		System.out.println(Arrays.toString(key.arr));
	}
	
	void decreaseKey(int i, int x) {
		arr[i]=x;
		
		while(i!=0 && arr[parent(i)]>arr[i]) {
			swap(arr, i, parent(i));
			i=parent(i);
		}
	}
	
	private void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

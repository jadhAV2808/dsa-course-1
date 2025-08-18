package heap;

import java.util.Arrays;

public class BinaryHeapHeapify {
//	
//	int []arr; 
//	int size;
//	int cap;
//	
	
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
		
		int[] arr = {40,20,30,35,100,70,25,60,80,32 };
		
		BinaryHeapHeapify heapify = new BinaryHeapHeapify();
		
		heapify.minHeapify(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		int min = heapify.extractMin(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

	private int extractMin(int[] arr, int size) {
		if(size==0)
			return Integer.MAX_VALUE;
		
		if(size==1) {
			size--;
			return arr[0];
		}
		swap(arr, 0, size-1);
		size--;
		minHeapify(arr, 0, size);
			
		return arr[size];
	}

	private  void minHeapify(int[] arr,int i, int size) {
		int lt = left(i), rt = right(i);
		int smallest=0;
		int smaller = i;
		
		if(lt<size && arr[lt]<arr[i])
			smallest=lt;
		
		if(rt<size && arr[rt]<arr[smaller])
			smallest = rt;
		if(smaller!=i) {
			swap(arr, i, smallest);
			minHeapify(arr, smallest, size);
		}
		
	}
	private void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

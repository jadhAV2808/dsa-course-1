package heap;

public class InsertionInBH {
	
	int []arr; 
	int size;
	int cap;
	
	public InsertionInBH(int c) {
		arr = new int[c];
		size=0;
		cap =c;		
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
		
		
	}
	
	
	//insert
	void insert(int x) {
		if(size==cap)
			return;
		size++;
	
		for(int i=size-1;  i!=0 && arr[parent(i)]>arr[i];) {
			swap(arr,i, parent(i));
			i=parent(i);
		}
		
	}

	private void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

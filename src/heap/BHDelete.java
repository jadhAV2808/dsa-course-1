package heap;

public class BHDelete {

	
	int[] arr; 
	int size, cap;
	
	public BHDelete(int c) {
//		arr = new int[c];
		size=0;
		cap =c;	
		arr = new int[] {10,20,30,40,50,35,38,45};
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
		
		BHDelete obj  = new BHDelete(8);
		
		obj.delete(3);
		
	}

	private void delete(int i) {
		
	}
	
}

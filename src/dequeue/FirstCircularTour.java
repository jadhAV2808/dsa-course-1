package dequeue;

public class FirstCircularTour {

	public static void main(String[] args) {
		
		int[] petrol = {4,8,7,4};
		int[] dist =   {6,5,3,5};
		
		int res =startTour(petrol, dist,petrol.length);
		System.out.println("res: "+ res);
	}

	private static int startTour(int[] petrol, int[] dist, int n) {
		for(int start=0;start<n;start++) {
			int curr_petrol = 0;
			int end = start;
			
			while(true) {
				curr_petrol+= (petrol[end]-dist[end]);
				
				if(curr_petrol<0)
					break;
				end =(end+1)%n;
				if(end==start)
					return start+1;
			}
		}
		return -1;
	}
}

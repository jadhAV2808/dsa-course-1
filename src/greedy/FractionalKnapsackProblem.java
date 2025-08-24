package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackProblem {

	public static void main(String[] args) {
		
		ItemModel[] arr = { new ItemModel(50,600),
							new ItemModel(20,500),
							new ItemModel(30,400)
		};
		
		int cap = 70;
		
		double value = fillKnapsack(arr, cap);
		System.out.println("vale: "+ value);
	}

	private static double fillKnapsack(ItemModel[] arr, int cap) {
		
		Arrays.sort(arr);
		double res = 0.0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].weight<=cap) {
				res= res+ arr[i].value;
				cap=cap-arr[i].weight;
			}
			else {
				res=res+ arr[i].value * cap/arr[i].weight;
				break;
			}
		}
		
		
		return res;
	}
}


class ItemModel implements Comparable<ItemModel>{
	int weight;
	int value;
	
	public ItemModel() {}
	
	public ItemModel(int w, int v) {
		this.weight=w;
		this.value=v;
	}

	@Override
	public int compareTo(ItemModel item) {
		
		//sorting based on value versus weight ratio
		return  this.weight*item.value -  this.value*item.weight;
		
		/*
		 * item.value/item.weight - this.value/this.weight >=0
		 */
	}
}



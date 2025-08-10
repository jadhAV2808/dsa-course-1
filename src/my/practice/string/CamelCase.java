package my.practice.string;



public class CamelCase {
	
	public static void main(String[] args) {
		/*
		 * Input: "i got intern at geeksforgeeks"
		 * Output: "iGotInternAtGeeksforgeeks"
		 */
		String str = "i got intern at geeksforgeeks";
		converCamelCase(str);
		converCamelCase1(str);
	}

	private static void converCamelCase(String str) {
		String []arr = str.split("\\ ");
//		System.out.println(Arrays.toString(arr));
		
		StringBuilder sb = new StringBuilder(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0)))
              .append(arr[i].substring(1));
		}
		
		System.out.println(sb.toString());
	}

	
	private static void converCamelCase1(String str) {
		
		boolean capitalizeNext=false;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)== ' ')
				capitalizeNext=true;
			else if(capitalizeNext) {
				sb.append(Character.toUpperCase(str.charAt(i)));
				capitalizeNext=false;
			}else {
				sb.append(str.charAt(i));
			}			
		}
		
		
		System.out.println(sb.toString());
	}
}

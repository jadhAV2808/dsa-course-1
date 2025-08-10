package string;
/*
 * ways to create string:
 * 
 * 1] character Array/arraylist
 *   char[] c = {'a', 'n', 'm'}
 *   
 * 2] String class: (immutable & thread-safe )
 *     String str = "ads";
 *     String str1 = new String("ASC");
 * 3] StringBuffer class: (thread safe)
 *    StringBuffer b = new StringBuffer("abc");
 * 
 * 4] StringBuilder class: (not thread safe)
 *    StringBuilder b = new StringBuilder("abcd");
 */
public class JavaStrings {
	
	public static void main(String[] args) {
		
		String str = "geeks";
		String str1 = "geeks";		
		String s3 = new String("geeks");
		String s4=str;
		String s5="geeksforgeeks";
		
		System.out.println("len: "+ str.length());
		
		System.out.println("char at index 2: "+ str.charAt(2));
		
		System.out.println("substring: "+ str.substring(2));
		
		System.out.println("substring start index included & end index excluded: "+ str.substring(2,5));
		
		System.out.println(str == str1);
		
		System.out.println(str==s3);
		
		System.out.println(str == s4);
		
		System.out.println("cotains: "+ str.contains("geeks"));
		
		System.out.println("equals: "+ str.equals(s3));
		
		System.out.println("compare: compare lexicographically: "+ str1.compareTo("pooja"));
		
		System.out.println("indexOf: returns -ve if not present: "+ s5.indexOf("eks"));
		
		System.out.println("indexOf: returns -ve if not present: "+ s3.indexOf("eks", 1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

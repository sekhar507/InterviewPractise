package oh.first;

/**
 * ReverseString.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
public class ReverseString {
	
/*******************************************without any functions******************************************/
	public static void main(String[] args) {
		String word = "hello";
		String reverse = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse);
	}
	
	/*public static void main(String[] args) {
		String word="hello";
		String reverse=new StringBuffer(word).reverse().toString();
		System.out.println(reverse);
		String reverse1= new StringBuilder(word).reverse().toString();
		System.out.println(reverse1);
		
	}*/
	
	

}

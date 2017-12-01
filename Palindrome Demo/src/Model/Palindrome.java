package Model;

public class Palindrome {
	
	public static String isPalindrome(String text){
		
		
		String textInverse = new StringBuffer(text).reverse().toString();
		
		if(text.contentEquals(textInverse)){
			return "Palindrome!";
		}
		else{
			return "not a Palindrome.";
		}	
	}; //end of if
}//end of class


public class Palindrome {
	public static void main(String[] args){
		System.out.println(isTextPalindrome("madam"));
	}
	public static boolean isTextPalindrome(String text) {
	    if (text == null) {
	        return false;
	    }
	    int left = 0;
	    int right = text.length() - 1;
	    while (left < right) {
	        if (text.charAt(left++) != text.charAt(right--)) {
	            return false;
	        }
	    }
	    return true;
	}
}

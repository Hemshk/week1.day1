package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "madam";
		
		String revstr = "";
		
	    for (int i = str1.length()-1; i >=0; i--) {
			
	    	revstr+= str1.charAt(i);
		}
	    
	    if (revstr.equals(str1)) {
			System.out.println("Entered word "  +str1  +" is a palindrome");
		}
		
	}

}

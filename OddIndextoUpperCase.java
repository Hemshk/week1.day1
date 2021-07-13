package week1.day2;

public class OddIndextoUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		String upperCase = "";
		char[] ch = test.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (i%2!=0) {				
				char c = Character.toUpperCase(ch[i]);
				upperCase += Character.toString(c);
			}
			else
			{
				upperCase += Character.toString(ch[i]);
			}
			
		}
		System.out.println(upperCase);

	}

}

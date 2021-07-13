package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String hem = "Keerthana";
		int count = 0;
		char[] poo = hem.toCharArray();
		
		for (int i = 0; i < poo.length; i++) {
			
			if ((poo[i]) == 'e') {
			count = count+1;
			}
		}
		System.out.println("Count of e is : " +count);

	}

}

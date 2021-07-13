package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "$$Welcome to the 2nd class of automation:";

		int letter = 0, space = 0, num = 0, specialcharacter = 0;

		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			if (Character.isLetter(charArray[i])) {
				letter = letter + 1;
			}

			else if (Character.isDigit(charArray[i])) {
				num = num + 1;
			} else if (Character.isSpaceChar(charArray[i])) {
				space = space + 1;																																				
			} else {
				specialcharacter = specialcharacter + 1;
			}
		}
		System.out.println("Count of letter is : " + letter);
		System.out.println("Count of number is : " + num);
		System.out.println("Count of space is : " + space);
		System.out.println("Count of specialcharacter is : " + specialcharacter);



	}
}

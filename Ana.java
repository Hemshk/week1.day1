package week1.day2;

import java.util.Arrays;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String text1 = "stops";
				String text2 = "poats";

				int length1 = text1.length();
				int length2 = text2.length();
				if (length1 == length2) {
					char[] charArray1 = text1.toCharArray();
					char[] charArray2 = text2.toCharArray();
					Arrays.sort(charArray1);
					Arrays.sort(charArray2);
					Arrays.equals(charArray1, charArray2);
					System.out.println("The given strings is an anagram");
				} else {
					System.out.println("The given strings is not an anagram");
				}
			}

}

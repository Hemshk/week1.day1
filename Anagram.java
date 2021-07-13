package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "stops";
		String str2 = "posts";
		
		if (str1.length()==str2.length()) {			
			char[] charArray = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);	
		if(Arrays.equals(charArray, charArray2));{
		System.out.println("Anagram");
			}
		}
		else {
			System.out.println("Not anagram");
		}
			}
	}



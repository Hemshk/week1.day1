package week1.day1;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArmstrongnumberAssignment {
//Armstrong number is or not
//153
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 153, calculated = 0 , original, remainder;
		original = input;
		while (input>0) {
		remainder = input % 10;
		input = input / 10;
		calculated = calculated+(remainder * remainder * remainder);
		}
		if (calculated == original) {
			System.out.println("Given number is Armstrong number");
		}
		else {
			System.out.println("Given number is not Armstrong  number");
		}
	}

	
	

	
}


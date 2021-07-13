package week1.day1;

import java.awt.print.Printable;

public class LearnWhilw {

	//stoppinf it based on some condition.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int number = 456;
	int sum = 0;
	
	while (number>0) {
	int remainder = number % 10;
	//rem=456%10 which is 6
	int quotient = number/10;
	//quot=456/10 which is 45
	sum = sum+remainder;
	//sum=0+6
	number = quotient;
	System.out.println("Remainder is:"+ remainder);
	System.out.println("Quotient is:"+ quotient);
	System.out.println("Sum is:"+ sum);
	System.out.println("Remainder is:"+ remainder);
	System.out.println("Complete***********");

	}
	}

}

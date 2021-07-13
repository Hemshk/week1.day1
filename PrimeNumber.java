package week1.day1;

public class PrimeNumber {
	
public static void main(String[] args) {

	int input = 12, remainder = 0;
	boolean isPrimeNumber = false;
	for (int i = 2; i <= input/2; i++) {
		//remainder = input / i;
	if(input % i == 0)
		isPrimeNumber=true;
	}
	if(!isPrimeNumber)
	{
	System.out.println("Is a Prime Number");
	}
	else
	{
	System.out.println("Is not a Prime Number");
	}
}
}

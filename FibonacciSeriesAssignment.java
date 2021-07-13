package week1.day1;

public class FibonacciSeriesAssignment {

//input number:8 output:0,1,1,2,3,5,8,13
	public static void main(String[] args) {

		int range = 8, firstNum = 0, secondNum = 1, sum;
		System.out.println("First number:" +firstNum);
		for (int i = 1; i <range; i++) {
		sum = (firstNum + secondNum);
		secondNum=firstNum;
		firstNum = sum;
		System.out.println(sum);
		}
	}

}

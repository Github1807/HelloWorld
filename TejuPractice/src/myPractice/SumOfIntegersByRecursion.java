package myPractice;

public class SumOfIntegersByRecursion {
	public static int sumOfDigits(int x) {
		
		if(x>0) {
			return(x+sumOfDigits(x-1));
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(10));
	}

}

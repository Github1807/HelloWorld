package myPractice1;

public class LargestOfThreeUsingTernaryOperator {

	public static void main(String[] args) {
		int a=90;
		int b=80;
		int c=45;
		int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
				System.out.println(result);
	}

}

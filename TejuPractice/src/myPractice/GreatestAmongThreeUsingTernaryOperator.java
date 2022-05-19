package myPractice;

public class GreatestAmongThreeUsingTernaryOperator {

	public static void main(String[] args) {
	int a=20;
	int b=29;
	int c=3;
	int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
	System.out.println(result);

	}

}

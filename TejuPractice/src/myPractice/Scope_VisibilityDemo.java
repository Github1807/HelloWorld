package myPractice;

public class Scope_VisibilityDemo {

	public static void main(String[] args) {
		int x=20;
		{
			int y=40;
			System.out.println(y);
		}
		int y=40;
		System.out.println(x);
		System.out.println(y);
	}

}

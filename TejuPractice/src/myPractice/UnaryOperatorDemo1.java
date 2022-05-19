package myPractice;

public class UnaryOperatorDemo1 {

	public static void main(String[] args) {
		int a=4;
//		a++;
//		System.out.println(a);
//		++a;
//		System.out.println(a++ + ++a);
//		System.out.println(a-- + ++a);
		System.out.println((a-- * --a) + ++a);
	}

}

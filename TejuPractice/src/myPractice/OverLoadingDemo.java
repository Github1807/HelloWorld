package myPractice;

public class OverLoadingDemo {
//	public static int sum(int a, int b) {
//		System.out.println("INt+INt");
//		return a+b;	
//		
//	}
	public static double sum(int a,double c) {
		System.out.println("INt+INt+double");
		return a+c;
		
	}
//	public static double sum(int a, int b,int c) {
//		System.out.println("INt+INt+int");
//		return a+b+c;
//		
//	}

	public static void main(String[] args) {
		System.out.println(sum(5,10));
//		System.out.println(sum(5,23.5));
//		System.out.println(sum(5,10,12));
		
	}

}
 
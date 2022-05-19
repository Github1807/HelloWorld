package myPractice;

class SumDemo{
	public  int sum(int a) {
		return a;
	}
	public int sum(int a, int b) {
		return a+b;
	}
	public  int sum(int a,int b,int c) {
		return a+b+c;
	}
	public String sum(String a,String b) {
		return a+b;
	}
} 
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		SumDemo s1=new SumDemo();
		int result=s1.sum(2);
		int result1=s1.sum(2,3);
		int result2=s1.sum(2,3,4);
		String result3=s1.sum("3","5");
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}

package myPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0,n=10;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		
	}

}

package myPractice;
import java.util.*;
public class FibonacciByRecursion {
private static Scanner sc;
 public static int fibonacci(int x) {
	 int fibo=0;
	 if(x==1||x==0) {
		 return 1;
	 }else
	 {
		 fibo=fibonacci(x-1)+fibonacci(x-2);
		 return fibo;
	 }
 } 
	public static void main(String[] args) {
	 sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.println(fibonacci(n));

	}

}

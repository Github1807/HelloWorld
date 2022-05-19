package myPractice;
import java.util.*;
public class StringConcat {
private static Scanner sc;
public static String StrngConcat(String m,String n) {
	String c=m+n;
	return c;
}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
	String m=sc.nextLine();
	String n=sc.nextLine();
	System.out.println(StrngConcat(m,n));
	}

}

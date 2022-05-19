package myPractice;
import java.util.*;
public class NamePassedAsParameter {
	private static Scanner sc;
	public static String StringAsParameter (String name) {
		return ("Tejaswini " +name);
	}

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		String Name=sc.nextLine();
		System.out.println(StringAsParameter(Name));

	}

}

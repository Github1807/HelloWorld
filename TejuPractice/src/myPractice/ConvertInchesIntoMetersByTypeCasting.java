package myPractice;
import java.util.Scanner;
public class ConvertInchesIntoMetersByTypeCasting {
	private static Scanner sc;
		public static void main(String[] args) 
		{
		sc=new Scanner(System.in);
		System.out.println("Enter inches");
		int i=sc.nextInt();
		double m=(double)(i*0.0254);
		System.out.println("the inches in metres are "+ m);

	}

}

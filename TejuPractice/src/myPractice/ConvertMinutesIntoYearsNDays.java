package myPractice;
import java.util.Scanner;
public class ConvertMinutesIntoYearsNDays {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the minutes");
		int minutes=sc.nextInt();
		int day=minutes/1440;
		if(day>=1)
		{
			int years=day/365;
			day=day%365; 
			System.out.println("In "+ minutes +" there are"+ years + "years" + day +"Days");
		}
		else
		{
			System.out.println("In "+ minutes+ " there are "+ day + " days");
		}
	}

}
//
//double minutesInYear = 60 * 24 * 365;
//
//Scanner input = new Scanner(System.in);
//
//System.out.print("Input the number of minutes: ");
//
//double min = input.nextDouble();
//
//long years = (long) (min / minutesInYear);
//int days = (int) (min / 60 / 24) % 365;
//
//System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
//}

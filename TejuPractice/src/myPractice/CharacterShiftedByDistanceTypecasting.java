package myPractice;
import java.util.Scanner;
public class CharacterShiftedByDistanceTypecasting {
private static Scanner sc;
	public static void main(String[] args)
	{
	sc=new Scanner(System.in);
	char A1=sc.nextLine().charAt(0);
	int A=A1;
	int D=sc.nextInt();
	int E=D+A;
	char G=(char)E;
	System.out.println(G);

		
		// Another Approach :
//		char A='a';
//		int D= 3;
//		char result=(char)(A+D);
//		System.out.println(result);

	}

}

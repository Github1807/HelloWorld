package Assignments;
import java.util.Scanner;

public class PrintAsciiValueExample4 {
	private static Scanner sc;  
	 
	public static void main(String args[])  
	{  
	System.out.print("Enter a character: ");  
	 sc = new Scanner(System.in);  
	char chr = sc.next().charAt(0);  
	int asciiValue = chr;  
	System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
	}  
	}  
                       
 
 
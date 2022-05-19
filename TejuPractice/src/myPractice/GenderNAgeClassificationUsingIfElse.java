package myPractice;
import java.util.Scanner;
public class GenderNAgeClassificationUsingIfElse {
 private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
	    System.out.println("Enter gender");
	    char gender=sc.nextLine().charAt(0);
	    System.out.println("age");
	    int age=sc.nextInt();
	    if(gender=='M')
	    { 
	    	if(age<25) 
	    	{
	    		System.out.println("Boy");
	    	}
	    	else
	    	{
	    		System.out.println("Men");
	    	}
	    }
	    else if(gender=='F')
	    {
	    	if(age>25)
	    	{
	    		System.out.println("Women");
	    	}
	    	else
	    	{
	    		System.out.println("Girl");
	    	}	
	    }
	    else
	    {
	    	System.out.println("Invalid input");
	    }
	 
	  
 
	}

}

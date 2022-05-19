package myPractice;
import java.util.Scanner;
public class DullIntelligentAverage {
		 private static Scanner sc;
			public static void main(String[] args) {
				sc=new Scanner(System.in);
			    System.out.println("Enter gender");
			    String gender=sc.nextLine();
			    System.out.println("Arks");
			    int marks=sc.nextInt();
			    if(gender.equals("male"))
			    { 
			    	if(marks>60) 
			    	{
			    		System.out.println("intelligent Boy");
			    	}
			    	else if(marks<60 && marks>35)
			    	{
			    		System.out.println("Average Men");
			    	}
			    	else {
			    		System.out.println("Dull Men");
			    	}
			    }
			    else if(gender.equals("Female"))
			    {
			    	if(marks>60)
			    	{
			    		System.out.println("Intelligent Women");
			    	}
			    	else if(marks<60 && marks>35)
			    	{
			    		System.out.println(" Average Girl");
			    	}
			    	else {
			    		System.out.println("Girl");
			    	}
			    }
			    else
			    {
			    	System.out.println("Invalid input");
			    }
			 
			  
		 
			}

		


	}



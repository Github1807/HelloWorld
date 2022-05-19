package myPractice;

public class PrintingNoByWhile 
{
	
	    public static void main(String[] args) 
	    {
	        int x=15,count=0;
	        for(int i=1;i<=x;i++)
	        {
	        	if(x%i==0)
	        	{
	        		count=count+1;
	        	}
	        }
	       if(count==2)
	       {
	    	   System.out.println("The no is prime");
	       }
	       else
	       {
	    	   System.out.println("The no is not prime");
	       }
	    }
}
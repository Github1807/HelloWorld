//package myPractice;
//import java.util.Scanner;
//
//public class CheckIfGivenStringsAreAnagramOrNotByApproach2 {
//private static Scanner sc;
//	
//	
//	    public static void main(String[] args) {
//	        sc=new Scanner(System.in);
//	        String first= sc.nextLine();
//	        String second= sc.nextLine();
//	        int arr[]=new int[26];
//	        boolean is_anagram=true;
//	        if(first.length()!=second.length()){
//	            is_anagram=false;
//	        }
//	        for(int i=0;i<first.length();i++){
//	            arr[Character.valueOf(first.charAt(i))-(Character.valueOf('a'))]+=1;
//	        }
//	        for(int i=0;i<second.length();i++){
//	            arr[Character.valueOf(second.charAt(i))-(Character.valueOf('a'))]-=1;
//	        }
//	        for(int i=0;i<arr.length;i++){
//	            if(arr[i]!=0){
//	                is_anagram=false;
//	            }
//	        }
//	        System.out.println(is_anagram);
//	    
//}}

package myPractice;
import java.util.Scanner;
public class CheckIfGivenStringsAreAnagramOrNotByApproach2{
	private static Scanner sc;
	public static void main(String args[]) {
		sc=new Scanner(System.in);
		String name=sc.nextLine();
		String name1=sc.nextLine();
		int arr[]=new int[26];
		boolean status=true; 
		if(name.length()!=name1.length())
		{
			status=false; 
		}
		for(int i=0;i<name.length();i++) 
		{
			arr[Character.valueOf(name.charAt(i))-(Character.valueOf('a'))]+=1;
		}
		  
		for(int i=0;i<name1.length();i++) 
		{
			arr[Character.valueOf(name1.charAt(i))-(Character.valueOf('a'))]-=1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				status=false;	
			}
			
		}
		System.out.println(status);
	}
}
 

 
 
 







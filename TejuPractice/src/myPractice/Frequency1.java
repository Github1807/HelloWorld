package myPractice;
import java.util.Scanner;
public class Frequency1 {
	private static Scanner sc;
	
public static void main(String[] args) {
		
	sc=new Scanner(System.in);
    int []arr=new int[5];
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
    int no=73; 
    int count=0; 
    for(int i=0;i<5;i++) 
    {
        if(arr[i]==no)
        count=count+1;
    }
    System.out.println(count);
}
}
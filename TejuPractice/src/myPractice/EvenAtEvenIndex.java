package myPractice;
import java.util.Scanner;
public class EvenAtEvenIndex {
	private static Scanner sc;
	public static void main(String[] args) {
		int arr[]=new int[8];
		sc=new Scanner(System.in);
		int even_index=0;
		int odd_index=1; 
		for(int i=0;i<8;i++) 
		{
			int n=sc.nextInt(); 
			if(n%2==0)
			{
				arr[even_index]=n;
				even_index+=2;
			} 
			else 
			{
				arr[odd_index]=n;
				odd_index+=2;  
			}
		}
	//	System.out.println(arr);
		for(int j=0;j<8;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
  
}

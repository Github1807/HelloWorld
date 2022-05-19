package myPractice;
import java.util.Scanner;
public class Frequency {
	private static Scanner sc;
//	public static void main(String[] args) {
		int arr[]=new int[10];
		int n;
		void getData()
		{
			sc=new Scanner(System.in);	
			for(int i=0;i<10;i++)
			{
				System.out.println("Enter the elements");
				 arr[i]=sc.nextInt();
			}
		System.out.println("Enter the element to be searched");
		n=sc.nextInt(); 
		}
		void Count() 
		{
		int i,count=0;
		for(i=0;i<10;i++)
		{
			if(arr[i]==n)
			{
				count=count+1;
			}
		}
		System.out.println("frequency of"+n+"is"+count);
	}
}
		class FrequencyTrial1{
			public static void main(String args[]) {
				Frequency aa=new Frequency();
				aa.getData();
				aa.Count();
	 		} 
	}



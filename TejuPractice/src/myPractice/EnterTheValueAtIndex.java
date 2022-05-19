package myPractice;
import java.util.Scanner;
public class EnterTheValueAtIndex {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int arr[]=new int[10];
		sc=new Scanner(System.in);
		System.out.println("Enter the index");
		int index=sc.nextInt();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		while(index>=arr.length) 
		{
			System.out.println("Enter valid index");
			index=sc.nextInt(); 
		}
		arr[index]=value;
		
		System.out.println(value+" is at index "+index);

	}

}

package myPractice;
import java.util.Scanner;
public class CheckConsecutivity {
	private static Scanner sc;
		public static boolean consecutive(int arr[],int n) {
					boolean consec=false;
					for(int i=0;i<arr.length-1;i++)	
					{
						if(arr[i]==arr[i+1]) {
							consec=true;
						}
					} 
					return consec;
				} 
					public static void main(String args[])
					{
						int ch;
						sc=new Scanner(System.in);
						do
						{
							System.out.println("Size");
							int m=sc.nextInt();
							int arr[]=new int[m];
							System.out.println("Start filling array");
							for(int i=0;i<arr.length;i++) {
								arr[i]=sc.nextInt();
							}
							System.out.println("enter n");
							int n=sc.nextInt();
							System.out.println(consecutive(arr,n));
							System.out.println("press 1 to continue");
							ch=sc.nextInt();
							
						}while(ch==1);
					}
			
 
		}





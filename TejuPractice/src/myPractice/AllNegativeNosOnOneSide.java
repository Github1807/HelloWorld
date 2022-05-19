package myPractice;
import java.util.Arrays;
import java.util.Scanner;
public class AllNegativeNosOnOneSide 
{
private static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Elements");  
		for(int j=0;j<10;j++)  
		{ 
		arr[j]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++) 
		{ 
		 int temp=0;
		 	for(int a=0;a<arr.length-1;a++)
		 	{
		 		if(arr[a]>arr[a+1])
		 		{
		 			temp=arr[a];
		 			arr[a]=arr[a+1];
		 			arr[a+1]=temp;
		 		} 
		 	}
			
		}
		System.out.println(Arrays.toString(arr));
	}
 
} 
//		 public static void main(String[] args) {
//		        Scanner sc = new Scanner(System.in);
//		        int num[]=new int[10];
//		        System.out.println("enter the values");
//		        for(int j=0;j<10;j++) {
//		            num[j] = sc.nextInt();
//		        }
//		        for(int i=0;i<num.length;i++){
//		            int temp=0;
//		            for(int a=0;a<num.length-1;a++){
//		               if(num[a]>num[a+1]){
//		                   temp=num[a];
//		                   num[a]=num[a+1];
//		                   num[a+1]=temp;
//		               }
//		            } 
//		        } 
//		        System.out.println(Arrays.toString(num));
//		    }
//		}
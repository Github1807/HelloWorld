package myPractice;
import java.util.Scanner;
public class CountPrimesInArray{
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		int count=0;
	    for(int i=0;i<arr.length;i++) 
	    {
	    	arr[i]=sc.nextInt();
	        int a=arr[i];
	        int count_division=0;
	        for(int j=1;j<a+1;j++)
	        {
	            if(a%j==0)
	            {
	                count_division+=1;
	            } 
	        }
	        if(count_division==2){
	            count+=1;
	        }
	    }
	    System.out.println("There are"+" "+count+" "+"Prime nos");
	}
	}

		
//public static void main(String[] args) {
//    int arr[]={1,2,3,4,5,6,7,8,9,10,13};
//    int count=0;
//    for(int i=0;i<arr.length;i++){
//        int a=arr[i];
//        int count_division=0;
//        for(int j=1;j<a+1;j++){
//            if(a%j==0){
//                count_division+=1;
//            } 
//        }
//        if(count_division==2){
//            count+=1;
//        }
//    }
//    System.out.println(count);
//}
//}

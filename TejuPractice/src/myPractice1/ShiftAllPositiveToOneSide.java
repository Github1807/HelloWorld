package myPractice1;
import java.util.Arrays;

public class ShiftAllPositiveToOneSide {

	public static void main(String[] args) {
		int arr[]= {-2,3,-5,-6,-8,-6,0,9,8};
		//int pos=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//			if(arr[i]>arr[i+1]) {
//				pos=arr[i];  
//				arr[i]=arr[i+1];
//				arr[i+1]=pos;
//				 
//			}	
//			}
//		}
//		System.out.println(Arrays.toString(arr));
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

 

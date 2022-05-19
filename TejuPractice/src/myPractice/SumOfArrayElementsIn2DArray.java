package myPractice;
import java.util.*;
public class SumOfArrayElementsIn2DArray {
	private static Scanner sc;
		public static void main(String[] args) {
			sc=new Scanner(System.in);
			int arr[][]=new int[2][2];
			System.out.println("Enter elements");
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					arr[i][j]=sc.nextInt(); 
					
				} 
			}
			int result=0; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				result=result+arr[i][j];		
			}
				
		
			} 
		System.out.println(result);			 		    
									
	}
								
				
					

}



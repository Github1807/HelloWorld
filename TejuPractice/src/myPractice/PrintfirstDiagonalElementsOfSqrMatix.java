package myPractice;
import java.util.*;
public class PrintfirstDiagonalElementsOfSqrMatix {

	
	private static Scanner sc;
		public static void main(String[] args) {
			sc=new Scanner(System.in);
			int arr[][]=new int[3][3];
			System.out.println("Enter elements");
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					int val=sc.nextInt(); 
					arr[i][j]=val;
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(" ");
			}
//			System.out.println("enter the element to be searched");
//			int n=sc.nextInt();
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					
					if(i+j==2 || i==j) {				
						System.out.println("Diagonal elements in array are "+arr[i][j]);
						
					}
			    
					
					}
				}
			}   
			}
	 




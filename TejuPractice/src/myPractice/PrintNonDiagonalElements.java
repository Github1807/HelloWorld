package myPractice;
import java.util.*;
public class PrintNonDiagonalElements {
	private static Scanner sc;
			public static void main(String[] args) {
				sc=new Scanner(System.in);
				int arr[][]=new int[4][4];
				System.out.println("Enter elements");
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[0].length;j++) {
						int val=sc.nextInt(); 
						arr[i][j]=val;
					}
				}
				

				
						
									 

							for(int i=0;i<arr.length;i++) {
								for(int j=0;j<arr[0].length;j++) {
									if(i+j==3 || i==j) {	 
									
									System.out.print("_"+" ");
								}else {	
			 						
									System.out.print(arr[i][j]+" ");
								}
								
							}
								System.out.println(" "); 
						}
				    
						
						}
					}
				
				
		 





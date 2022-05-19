package MockPractice;
import java.util.Arrays;
import java.util.Scanner;
public class Rotate3By3Clockwise {
private static Scanner sc;
	public static void main(String[] args) {
		 int M=3;
	        int N=3;
		sc=new Scanner(System.in);
		int arr[][]=new int[M][N];
		System.out.println("Elements");
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[0].length;j++) {
				 int temp=arr[i][j];
	                arr[i][j]=arr[j][i];
	                arr[j][i]=temp;
			}
		
		} 
		for(int j=0;j<N;j++) {
	       
	            int i=0;
	            int last=M-1;  
	            while(i<=last){
	                int temp=arr[j][i]; 
	                arr[j][i]=arr[j][last];
	                arr[j][last]=temp;
	                last--; 
	                i++; 
	            }   
				  
			}	
		for(int i=0;i<M;i++) { 
			System.out.println(Arrays.toString(arr[i]));
		}
	
	}
		 
		}


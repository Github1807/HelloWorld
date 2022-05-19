package MockPractice;
import java.util.Arrays;
import java.util.Scanner;
public class Rotate2By2MatrixAntiClockwise {
	private static Scanner sc;

	
	    public static void main(String[] args) {
	        sc=new Scanner(System.in);
	        int M=3;
	        int N=3;
	        int arr[][]=new int[M][N];
//	        System.out.println("start filling the 2d array");
//	        for(int i=0;i<M;i++){
//	            for(int j=0;j<N;j++){
//	                arr[i][j]= sc.nextInt();
//	            }
//	        }
//	        for(int i=0;i< arr.length;i++){
//	            for(int j=i;j<arr[0].length;j++){
//	                int temp=arr[i][j];
//	                arr[i][j]=arr[j][i];
//	                arr[j][i]=temp;
//	            }
//	        }
//	        for (int j=0;j<N;j++){
//	            int i=0;
//	            int last=M-1; 
//	            while(i<=last){
//	                int temp=arr[i][j];
//	                arr[i][j]=arr[last][j];
//	                arr[last][j]=temp;
//	                last--;
//	                i++; 
//	            } 
// 
//	        } 
//	        System.out.println("your 2d array is");
//	        for(int i=0;i<M;i++){
//	            System.out.println(Arrays.toString(arr[i]));
//	        }
//	    }
//	}
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
  while(i<=last) {
	    
		int temp=arr[i][j];
	   arr[i][j]=arr[last][j];
	   arr[last][j]=temp;
	   last--;
	   i++;
   } 
   } 
   for(int i=0;i<M;i++) {
   System.out.println(Arrays.toString(arr[i]));
   }
}        
        
} 	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

package myPractice;

public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{2,3,4},{4,5,6}};
		int arr1[][]= {{1,0,3},{2,3,0},{0,5,6}};
		int r1=arr.length;
		int c1=arr[0].length;
		int r2=arr1.length;
		int c2=arr1[0].length; 
		int cross[][]=new int[r1][c2];
		if(c1==r2) { 
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) { 
				for(int k=0;k<r1;k++) {
				cross[i][j]=cross[i][j]+arr[i][k]*arr1[k][j];	
				}
				}
			}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				
				System.out.print(cross[i][j]+" ");
				}
				
			System.out.println(" ");
			}
		
		}
		else
		{
			System.out.println("Multiplication cannot be done");
		}

	}

}

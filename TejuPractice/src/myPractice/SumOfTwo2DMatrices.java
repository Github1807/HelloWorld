package myPractice;

public class SumOfTwo2DMatrices {
	
	public static int[][] getSum2DArray(int a[][],int b[][]){
		int r=a.length;
		int c=a[0].length;
		int result[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		return result;
	}
		 public static void main(String args[]) {
		int [][]a= {{1,12},{3,5}};
		int [][]b= {{23,34},{23,56}};
		int[][]result=getSum2DArray(a,b);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				System.out.print(result[i][j]+" ");
			} 
			System.out.println(" ");
		}
		 } 
		 }
		
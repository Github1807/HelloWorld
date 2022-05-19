package myPractice;

public class DifferenceOfTwo2DMatrices {
	public static int[][] getSum(int arr[][],int arr1[][]){
		int r=arr.length;
		int c=arr[0].length;
		int result[][]=new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				result[i][j]=arr[i][j]-arr1[i][j];
			}
		}
		return result;
	} 

	public static void main(String[] args) {
		int arr[][]= {{1,2},{3,4}};    
		int arr1[][]= {{4,5},{5,6}};
		int result[][]=getSum(arr,arr1);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println(" ");
		}

	}

}

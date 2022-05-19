package myPractice;

public class MatrixIsSparseOrNot {

	public static void main(String[] args) {
		int arr[][]= {{1,0,0},{0,0,0},{0,0,5}};
		int zero=0;
		int Nonzero=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					zero++;}
					else 
					{
					Nonzero++;	
					}
				}
			}
		
	if(zero>Nonzero) {
		System.out.println("Matrix is Sparse");
	}
	else{
		System.out.println("Matrix is not Sparse");
	}
	
		
	}

}

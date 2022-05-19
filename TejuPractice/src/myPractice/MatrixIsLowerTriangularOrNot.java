package myPractice;

public class MatrixIsLowerTriangularOrNot {

	public static void main(String[] args) {
		int arr[][]= {{1,0,0},{2,4,0},{3,4,5}};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i<j) {
					if(arr[i][j]==0) {
					flag=true;	
					}
					else {
					flag=false;	
					}
				}
			}  
		}
		System.out.println(flag); 
	}

}
 
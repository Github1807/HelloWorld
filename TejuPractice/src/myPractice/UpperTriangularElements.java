package myPractice;

public class UpperTriangularElements {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{0,4,6},{0,0,8}};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i<j || i==j) {
					System.out.print(" "+arr[i][j]);
				}
				
			}
			System.out.println(" ");
		}
		 
	}


} 



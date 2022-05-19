package myPractice;

public class TranposeOfMatrix {

	public static void main(String[] args) {
	//By using Extra array	
		int i=0;
		int j=0;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int transpose[][]=new int[3][3];
//		for(i=0;i<arr.length;i++) {
//			for( j=0;j<arr[0].length;j++) { 
//				transpose[i][j]=arr[j][i];
//			} 
//			 
// 		}
//		for(i=0;i<transpose.length;i++) {
//			for( j=0;j<transpose[0].length;j++) {
//				System.out.print(transpose[i][j]+" ");
//			}
//			System.out.println(" ");
// 		}
		 //Without using extra array
		for(i=0;i<arr.length;i++) {
			for( j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");  
 		 }
		System.out.println("TransPose Of Matrix is");
		for(i=0;i<arr.length;i++) {
			for( j=0;j<arr[0].length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println(""); 
 		 }  
		
		
	} 

} 

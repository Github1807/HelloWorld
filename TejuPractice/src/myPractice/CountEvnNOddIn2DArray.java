package myPractice;

public class CountEvnNOddIn2DArray {

	public static int evenOddCount(int arr[][]) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]%2==0) {
				count++;
			}
		}
			
		}
		return count;
	
	}

	public static void main(String[] args) {
		
		int arr[][]= {{35,31,41},{23,34,45},{32,51,32}};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//			System.out.print(arr[i][j]+" ");
//		
//		}
//			 
//	System.out.println(""); 
//}
		System.out.println(evenOddCount(arr));
	}}

	

 

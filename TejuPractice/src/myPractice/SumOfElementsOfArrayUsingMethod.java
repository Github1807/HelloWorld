package myPractice;

public class SumOfElementsOfArrayUsingMethod {
	public static int sum(int arr[]) {
		int result=0;
	 	for(int i=0;i<arr.length;i++) {
			
			result=result+arr[i];
			}
		
	return result;
	}

	public static void main(String[] args) {
		
		int arr[]= {3,4,5};
		
		System.out.println(sum(arr));

	}

}



	
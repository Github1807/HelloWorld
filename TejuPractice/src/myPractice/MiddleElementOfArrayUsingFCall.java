package myPractice;

public class MiddleElementOfArrayUsingFCall {

	public static int middleElement(int arr[]) {
		int mid1=0;int result=1;
	 	for(int i=0;i<arr.length;i++) {
			
			mid1=i/2;
			result=arr[mid1];
			}
		
	return result;
	}

	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6};
		
		System.out.println(middleElement(arr));

	}


}

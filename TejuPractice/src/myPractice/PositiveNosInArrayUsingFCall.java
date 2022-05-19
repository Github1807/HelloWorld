package myPractice;

public class PositiveNosInArrayUsingFCall {

	public static void positiveNos(int arr[]) {
		
	 	for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
			else {
				continue;
			}
			}
	
	
	}

	public static void main(String[] args) {
		
		int arr[]= {3,-4,5,-6};

        positiveNos(arr);

	}


}



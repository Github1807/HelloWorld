package MockPractice;

import java.util.Arrays;

public class AllNegativeNosOnOneSide {

	public static void main(String[] args) {
		int arr[]= {-3,2,-4,-3,-4,4,-39,94,9,9,-3};
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int a=0;a<arr.length-1;a++) {
			if(arr[a]>arr[a+1]) {
				temp=arr[a];
				arr[a]=arr[a+1];
				arr[a+1]=temp;
			}
				  
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

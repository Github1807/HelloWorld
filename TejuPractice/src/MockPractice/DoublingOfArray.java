package MockPractice;

import java.util.Arrays;

public class DoublingOfArray {

	public static void main(String[] args) {
		int arr[]= {2,3,5,6,5,4,7};
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=arr[i]*2;
		}
		System.out.println(Arrays.toString(arr));
	}

}

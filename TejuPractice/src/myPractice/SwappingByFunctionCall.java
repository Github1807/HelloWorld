package myPractice;

import java.util.Arrays;

public class SwappingByFunctionCall {
public static int[] swap(int arr[],int i1,int i2) {
	try {
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
	}
	catch(Exception e) {
		System.out.println("Invalid index");
	}
	return arr;
}
	public static void main(String[] args) {
		int arr[]= {73,8954,954,589, 84384,8438489};
		System.out.println(Arrays.toString(swap(arr,3,5)));

	}

}

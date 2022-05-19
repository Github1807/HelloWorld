package myPractice;

public class MinNoInArray {

	public static void main(String[] args) {
	int min=0;
	int arr[]= {22,34,67,543,56};
	for(int i=0;i<arr.length;i++) {
	min=arr[0];
	
		if(arr[i]<min) {
			min=arr[i];
		}
	}
System.out.println(min);
	}

}

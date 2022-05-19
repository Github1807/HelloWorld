package myPractice;

public class MaxNoInArray {

	public static void main(String[] args) {
		int max=0;
		int arr[]= {73,48,54,98,535};
		for(int i=0;i<arr.length;i++) {
			max=arr[0];
			if(arr[i]>max) {
				max=arr[i];
			}
		}
    System.out.println(max);
	}

}

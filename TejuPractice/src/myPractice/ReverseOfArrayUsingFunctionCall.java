package myPractice;

public class ReverseOfArrayUsingFunctionCall {
	public static void reverse(int arr[],int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}} 
	public static void main(String[] args) {
		int arr[]= {12,13,43,435,43,44};
		reverse(arr,0,arr.length-1);
		for(int k=0;k<arr.length;k++) {
		System.out.print(arr[k]+" ");	
		}
		
	}
	}


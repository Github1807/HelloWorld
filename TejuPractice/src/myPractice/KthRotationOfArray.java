package myPractice;

public class KthRotationOfArray {
	public static void reverse(int arr[],int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		}
	public static void main(String[] args) {
		int arr[]= {36,39,20,38,73,37,31}; 
		int k=2;
		reverse(arr,0,arr.length-1-k);
		reverse(arr,arr.length-k,arr.length-1);  
		reverse(arr,0,arr.length-1);
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}

	} 

}

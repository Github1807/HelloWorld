package myPractice;

public class RecursiveBinarySearch {
public static int binarySearch(int arr[],int left, int right,int target) {
	if(right>=left) {
		int middle=(left+right)/2;
		if(target==arr[middle]) {
			return middle;
		}
		if(target>arr[middle]) {
			return binarySearch(arr,right,middle+1,target);
		}
		if(target<arr[middle]) {
			return binarySearch(arr,left,middle-1,target);
		}
		
	}
	return -1;
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(binarySearch(arr,1,7,5));

	}

}

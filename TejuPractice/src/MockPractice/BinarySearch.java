package MockPractice;

public class BinarySearch {
 
	public static int Search(int arr[],int target) {
		int low=0, high=arr.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		return -1;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,6,7,8};
		int target=7;
		System.out.println(Search(arr,target));

	}

}

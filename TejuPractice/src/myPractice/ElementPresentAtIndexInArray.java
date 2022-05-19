package myPractice;
public class ElementPresentAtIndexInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int low=0;
		int mid=0;
		int high=arr.length-1;
		int data=8;
		boolean is_found=false;
		while(low<=high) {
		mid=(low+high)/2;
			if(data<arr[mid]) {
				high=mid-1;
			}
			else if(data>arr[mid]) {
				low=mid+1;
			}
			else {  
				is_found=true;
				break;
			}
		}
		if(is_found) {
			System.out.println("Element is found at "+(mid));
		}
		else { 
			System.out.println("Element is not found");
		}
	}

}

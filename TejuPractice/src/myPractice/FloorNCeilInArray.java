package myPractice;

public class FloorNCeilInArray {
public static void main(String args[]) {
	int arr[]= {1,2,5,10,20,50,100,500,2000};
	int data=56; 
	int low=0;
	int high=arr.length-1;
	int ceil=-1; 
	int floor=-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(data<arr[mid]) { 
			high=mid-1; 
			ceil=arr[mid]; 
		}
		else if(data>arr[mid]) {
			low=mid+1;
			floor=arr[mid];
		}
		else {
			floor=arr[mid];
			ceil=arr[mid];
			break;
		}
	}
	System.out.println(floor);
	System.out.println(ceil);
}
}

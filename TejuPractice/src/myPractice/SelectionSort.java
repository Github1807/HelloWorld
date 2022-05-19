package myPractice;

public class SelectionSort {
	public static void selectSort(int arr[]) {
	int temp=0,pos=0,i=0;
	for(i=0;i<arr.length;i++) {
		pos=i;
		for(int j=i;j<arr.length;j++) {
			if(arr[j]<arr[pos]) {
			pos=j;
		}
	}
		temp=arr[pos];
		arr[pos]=arr[i];
		arr[i]=temp;
	
	} 
}
	public static void main(String args[]) {
	int arr[]= {23,54,21,1,22,2,7,5};
	selectSort(arr);
	for(int i:arr) {
		System.out.print(i+" ");
	}
	
	 
	}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	public static void selecSort(int arr[]) {
//		int pos=0,temp=0;
//		for(int i=0;i<arr.length;i++) {
//			pos=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<arr[pos]) {
//					pos=j;
//				}
//			} 
//			temp=arr[pos];
//			arr[pos]=arr[i];
//			arr[i]=temp;
//		} 
//	}
//	
//
//	public static void main(String[] args) {
//		 int[] arr = {9,14,3,2,43,11,58,22};
//		 selecSort(arr);                               //sorting array using selection sort  
//         
//	        System.out.println("After Selection Sort");  
//	        for(int i:arr){  
//	            System.out.print(i+" ");  
//	        }  
//	    }  
//		
//	}



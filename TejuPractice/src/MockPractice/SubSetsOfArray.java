package MockPractice;

public class SubSetsOfArray {

	public static void main(String[] args) {
//		int arr[]= {4,5,3,3,5};
//		int limit=(int)Math.pow(2, arr.length);
//		for(int i=0;i<limit;i++) {
//			int temp=i; String set="";
//			for(int j=arr.length-1;j>=0;j--) {
//				int rem=temp%2;
//				temp=temp/2;
//				if(rem==0) { 
//					set="_"+" "+set; 
//				}
//				else {
//					set=arr[j]+" "+set;
//				}
//			}
//			System.out.println(set); 
//			
//		}
//		System.out.println("No of Subsets are "+limit);
		int arr[]= {2,3,4,5,6};
		int limit=(int)Math.pow(2, arr.length);
		
		for(int i=0;i<limit;i++) {
			int temp=i;
			String set="";
			for(int j=arr.length-1;j>=0;j--) {
				int rem=temp%2;
				temp=temp/2; 
				if(rem==0) {
					set="_"+" "+set;
				}  
				else
				{  
					set=arr[j]+" "+set;
				}
			}
			System.out.println(set);	
		}
		
		System.out.println("The no of Subsets are "+limit);
		}

}

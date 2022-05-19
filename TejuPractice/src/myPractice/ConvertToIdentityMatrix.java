package myPractice;



public class ConvertToIdentityMatrix {

	
		public static void main(String[] args) {
			
			int arr[][]=new int[3][3];
			//System.out.println("Fill the array");
			
//			for(int i=0;i<arr.length;i++) {
//				
//				for(int j=0;j<arr[0].length;j++) {
//					
//						arr[i][j]=sc.nextInt();
//					
//					} 
//	 				
//			}
//			
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(i==j) {
						System.out.print("1"+" ");
				}
					else
					{
						System.out.print("0"+" ");	
					}
					
					
			} 
				System.out.println(" ");
	 
		}
						
	 
	}
	

	}



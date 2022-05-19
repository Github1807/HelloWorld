package myPractice;

public class StringIntoCharArray {

	public static void main(String[] args) {
		String Name="Tejaswini";
		int l=Name.length();
	//	System.out.println(Name.length());
		char arr[]=new char[l];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Name.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

} 


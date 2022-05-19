package myPractice;

public class CountOccurencesInString {

	public static void main(String[] args) {
		String str="immisi";
		
		char arr[]=str.toCharArray();
		char n='i'; 
		int count=0; 
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n) {
				count++; 
			}
		}
		System.out.println(count);
	}

}

package myPractice;

public class ReverseTheWordsInStrings {
	public static String reverseSentence(String Sentence) {
		String temp[]=Sentence.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=temp.length-1;i>=0;i--) {
			sb.append(temp[i]+" "); 
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(reverseSentence("we are Studying"));

	} 

}  

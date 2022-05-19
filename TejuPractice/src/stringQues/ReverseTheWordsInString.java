package stringQues;

public class ReverseTheWordsInString {
	
	public static String reverseWords(String str) {
		String temp[]=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=temp.length-1;i>=0;i--) {
			sb.append(temp[i]+" ");
		}  
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("We are Studying"));

	}

}
 
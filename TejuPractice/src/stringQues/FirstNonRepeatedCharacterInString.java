package stringQues;

public class FirstNonRepeatedCharacterInString {
	public static int nonRepeated(String str,char a) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==a) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str="immis";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(nonRepeated(str,ch)==1) {
				System.out.println(ch);
				break;
			}
		}
 
	}

}

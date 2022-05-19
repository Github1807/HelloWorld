package stringQues;

public class CountDigitsInString {

	public static void main(String[] args) {
		String Str="teju@123";
		int count=0;
		char ch[]=Str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(Str.charAt(i))) {
			count++;
		}}
		System.out.println(count);
	}

}

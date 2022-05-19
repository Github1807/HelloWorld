package stringQues;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String str[]= {"tejas","tejaswini","tejaswi","tejashri"};
		for(int i=0;i<=str.length;i++) {
			if(str[0].charAt(i)==str[1].charAt(i)&&str[0].charAt(i)==str[2].charAt(i)&&str[0].charAt(i)==str[3].charAt(i)) {
				System.out.print(str[0].charAt(i));
			}
			else
			break;
		}
		
	}

}
 
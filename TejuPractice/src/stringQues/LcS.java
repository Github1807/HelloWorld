package stringQues;

public class LcS {

	public static void main(String[] args) {
		String str[]= {"teju","seju","keju"};
		for(int i=str.length;i>=0;i--) {
			if(str[0].charAt(i)==str[1].charAt(i)&&str[0].charAt(i)==str[2].charAt(i)) {
				System.out.print(str[0].charAt(i));
			}
			else
				break;
		} 

	}

}
 
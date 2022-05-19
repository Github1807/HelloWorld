package stringQues;

public class ReplaceSpacesWithDash {

	public static void main(String[] args) {
		String str="Teju Fights with ravi";
		str=str.replaceAll("\\s","_");
		System.out.println(str);

	}

}

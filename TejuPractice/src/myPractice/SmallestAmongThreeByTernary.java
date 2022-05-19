package myPractice;

public class SmallestAmongThreeByTernary {

	public static void main(String[] args) {
		int x=38;
		int y=8;
		int z=40;
		int result=((x<y)?((x<z)?x:z):((y<z)?y:z));
		System.out.println(result);
	}

}

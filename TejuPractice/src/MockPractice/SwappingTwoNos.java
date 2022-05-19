package MockPractice;
import java.util.*;

public class SwappingTwoNos {
	private static Scanner sc;
		public static void main(String[] args) {
			sc=new Scanner(System.in);
			System.out.println("Enter the Nos to be Swapped");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int temp=0;
			temp=a;
			a=b;
			b=temp;
			System.out.println(a);
			System.out.println(b);

	}

}

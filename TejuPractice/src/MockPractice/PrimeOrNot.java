package MockPractice;
import java.util.*;
public class PrimeOrNot {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter No to be checked");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		

	}

}

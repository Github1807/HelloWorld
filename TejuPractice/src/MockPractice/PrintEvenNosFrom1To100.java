package MockPractice;

public class PrintEvenNosFrom1To100 {

	public static void main(String[] args) {
		int n=100;
		int count=0;
		while(n!=0) {
			if(n%2==0) {
				System.out.println(n);
				count++;
			}
			n--;
		}
		System.out.println(count);

	}

}

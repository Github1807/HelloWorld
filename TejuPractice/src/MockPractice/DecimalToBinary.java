package MockPractice;

public class DecimalToBinary {
	
	public static void toBinary(int n) {
		int i=0;
		int Binary[]=new int[50];
		while(n>0) {
			int rem=n%2;
			Binary[i]=rem;
			n=n/2;
			i++;
			
		} 
		for(int k=i-1;k>=0;k--) {
			System.out.print(Binary[k]+" ");
		}
	}

	public static void main(String[] args) {
		toBinary(15);

	}

}

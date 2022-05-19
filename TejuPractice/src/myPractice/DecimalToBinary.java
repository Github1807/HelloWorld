package myPractice;
public class DecimalToBinary {
	public static void toBinary(int n) {
		int binary[]=new int[50];
		int i=0;
		while(n>0) {
			int rem=n%2;
			binary[i]=rem;
			n=n/2;
			i++;   
		}
	for(int k=i-1;k>=0;k--) {
		System.out.print(binary[k]+" ");
	}
	}
public static void main(String[] args) {
		toBinary(15);
 
	}

}

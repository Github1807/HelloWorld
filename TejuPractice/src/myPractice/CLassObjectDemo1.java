package myPractice;

class Accounts{
	int AccNo;
	float Balance;
   String  IFSC;
	
	public float getBalance() {
		return this.Balance;
	}
	
}

public class CLassObjectDemo1 {

	public static void main(String[] args) {
		Accounts ICICI=new Accounts();
		ICICI.AccNo=3674582;
		ICICI.Balance=3674582.487f;
		ICICI.IFSC="MAHB582";
		System.out.println(ICICI.AccNo);
		System.out.println(ICICI.Balance);
		System.out.println(ICICI.IFSC); 

	
	Accounts HDFC=new Accounts();
	HDFC.AccNo=36732;
	HDFC.Balance=374582.487f;
	HDFC.IFSC="MAH582";
	System.out.println(HDFC.AccNo);
	System.out.println(HDFC.Balance);
	System.out.println(HDFC.IFSC);

}

}

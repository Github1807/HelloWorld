package myPractice;

class Bank{
	int accNo;
	float balance;
	String IFSC;
	
	Bank(){
		
	}
	Bank(int accNo, float balance, String IFSC){
		this.accNo=accNo;
    	this.balance=balance;
    	this.IFSC=IFSC;
		
	}
	
	public float getBalance() {
		return this.balance;
	}
    public void assignValues(int accNo, float balance, String IFSC) {
    	this.accNo=accNo;
    	this.balance=balance;
    	this.IFSC=IFSC;
    }
	
	
}
 

public class UsingParameterConstructor {

	public static void main(String[] args) {
		 
		Bank B1=new Bank();
		B1.assignValues(34785,45.67f,"45646");
		System.out.println(B1.accNo);
		Bank C1=new Bank();
		C1.assignValues(34685,45.887f,"489646");
		System.out.println(C1.accNo);
 
	}

}

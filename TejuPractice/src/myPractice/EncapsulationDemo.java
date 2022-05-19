package myPractice;


class MoneyStore{
	private int accNos;
	private float balance;
	private String ifsc;
	
	public int getAccNo() {
		return this.accNos;
	}
	public void setAccNo(int accNos) {
	this.accNos=accNos;
	}
	public float getbalance() {
		return this.balance;
	}
	public void setbalance(float balance) {
		this.balance=balance;
	}
	public String getifsc() {
		return this.ifsc;
	}
	public void setifsc(String ifsc) {
		this.ifsc=ifsc;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		MoneyStore s1=new MoneyStore();
		s1.setAccNo(235446324);
		System.out.println(s1.getAccNo());

	}

}

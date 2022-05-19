package MockPractice;

public class ArmstrongNoOrnot {

	public static void main(String[] args) {
		int number=153,OriginalNo,rem,result=0;
		OriginalNo=number;
		while(OriginalNo!=0) {
		rem=OriginalNo%10;
		result+=Math.pow(rem,3);
		OriginalNo/=10;
		}
		if(result==number) {
		System.out.println("ISArmStrong");	
		}
		else {
			System.out.println("IsNot");
		}
		}
		}


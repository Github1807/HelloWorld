package myPractice1;

public class StringBuilderNStringBufferDemo {
	public static void main(String args[]) {
	long startTime=System.currentTimeMillis();
	StringBuffer sb=new StringBuffer("Buffer");
	for(int i=5;i<10000;i++) {
		sb.append("Times");   
		
		
		}
	System.out.println("Time 1 = "+(System.currentTimeMillis()-startTime));
	
	
	startTime=System.currentTimeMillis();
	StringBuffer sb2=new StringBuffer("Builderr");
	for(int i=5;i<10000;i++) {
		sb2.append("Times");
		}
	System.out.println("Time 2 = "+(System.currentTimeMillis()-startTime));
	}
}

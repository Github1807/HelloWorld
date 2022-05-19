package myPractice;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("T"+"E"+"J"+"U"); //Takes as normal string
		System.out.println('T'+'E'+'J'+'U'); //TAkes the associated ASCII value & prints the sum of the same
		System.out.println("J"+'A');	     //If one input is string takes all input next to it as String 
		System.out.println('A'+"J");         //Converts into ASCII but after this Founds if next is String then converts whole into string
		System.out.println('A'+2);           //Converts into ASCII value & adds 2
		System.out.println('A'+2.0);         //Gives Output For String_Equivalent
		System.out.println("Geekster"+2+4+7);//TAkes first as string then convert rest of inputs as String only
		System.out.println(2+4+7+"Geekster");//First prints the sum & then takes the string input
		
	}

}

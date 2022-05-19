package myPractice;
public class TypeCastingDemo1 {
	public static int a=9;
	public static int b=8;
//	public static void main(String[] args) {
//		int x=10;
//		float y;
//		y=x;
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//	}	}	

		
		
//		int x=10.0; Since the double value ie 10.0 cannot be converted into int, so there comes error of lossy conversion
//		float y;     so if x=10.02 somthn like this then it can be cnvrtd to int upto 10, but there is loss of .02
//		y=x;         hence it is a lossy conversion
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//	}


		
//		float x=10.0;  again this also be the lossy convertion since 10.0, decimal value will be lost
//		int y;         while converting it to int
//		y=x;
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//	}	}
		
//		
//		double x=10.0f;
//		
//		
//		System.out.println("x = "+x); it will give x=10.0 since double to float is possible
//		
//	}	}
		
//		
//		short x=10;
//		int y;
//		y=x;
//		System.out.println("x = "+x); since short to int is possible
//		System.out.println("y = "+y);
//	}	}
		
		
//		int x=10;
//		short y=x; throws the error since short cannot be convrtd to int
//		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//	}	}
		
//		long x=10;     ideally long cannot be converted to int, but if we do explicit typecasting
//		int y=(int)x;   then it works
//		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//	}	}
	

public static void swap() {
	
	int temp=a;
	a=b;
	b=temp;
}
	public static void main(String args[])
	{
		
		
			swap();
		System.out.println(a);
		System.out.println(b);
	}
}
	
	
	
	
	
	
	


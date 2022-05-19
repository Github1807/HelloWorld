package myPractice;


class vehicles{
	int tyres;
	int seat;
	int speed;
	public void speedUp(int x) {
		this.speed=this.speed+x;
		
	}
}
class Cycle extends vehicles{
	int chain;
	public  void movePaddle() {
		System.out.println("PaddleMoved");
	}
} 
class Car extends vehicles{
	int airbags;
	public void CarCleaning() {
		System.out.println("Car Clean");
	}
	
} 
public class InheritanceDemo {

	public static void main(String[] args) {
		Cycle c=new Cycle();
		 c.chain=1;
		 c.tyres=2;
		 c.seat=1;
		 c.speed=10;
		System.out.println(c.chain);
		System.out.println(c.tyres); 
		System.out.println(c.seat);
		System.out.println(c.speed);
		
		c.speedUp(10);
		
		System.out.println(c.speed);
		
		

	}

}

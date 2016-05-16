package Duck;

import Fly.FlywithWings;
import Quack.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		setFlyBehavior(new FlywithWings());
		setQuackBehavior(new Quack());
		
	}
	
	public void display(){
		System.out.println("���� �� �����Դϴ�.");
	}
}

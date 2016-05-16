package Duck;

import Fly.FlyRocketPowered;
import Quack.MuteQuack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		setFlyBehavior(new FlyRocketPowered());
		setQuackBehavior(new MuteQuack());
		
	}
	
	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}
	
}

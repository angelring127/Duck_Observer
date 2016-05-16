package Duck;

import helloWorld.FlyBehavior;
import helloWorld.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;		//나는 행위 인터페이스
	QuackBehavior quackBehavior;	//꽥꽥 행위 인터페이스 
	public Duck() {
		
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	void swim(){
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
	public void display() {}
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior (QuackBehavior qb){
		quackBehavior = qb;
	}
	
}

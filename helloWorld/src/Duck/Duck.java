package Duck;

import helloWorld.FlyBehavior;
import helloWorld.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;		//���� ���� �������̽�
	QuackBehavior quackBehavior;	//�в� ���� �������̽� 
	public Duck() {
		
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	void swim(){
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
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

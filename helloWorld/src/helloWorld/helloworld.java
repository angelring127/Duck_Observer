package helloWorld;

import Duck.Duck;
import Duck.MallardDuck;
import Duck.ModelDuck;

public class helloworld {
	public static void main(String args[]){
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
	}
}







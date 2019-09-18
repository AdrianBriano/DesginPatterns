package com.acc.duck;

import com.acc.duck.fly.FlyNoway;
import com.acc.duck.quack.Squeak;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		Duck myDuck = new ModelDuck();
		myDuck.display();
		myDuck.setFlyBehavior(new FlyNoway());
		myDuck.setQuackBehavior(new Squeak());
		myDuck.performFly();
		myDuck.performQuack();
	}
}

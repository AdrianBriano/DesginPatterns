package com.acc.duck;

import com.acc.duck.behavior.fly.FlyWithWings;
import com.acc.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}

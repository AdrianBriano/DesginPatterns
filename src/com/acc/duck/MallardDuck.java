package com.acc.duck;

import com.acc.duck.fly.FlyWithWings;
import com.acc.quack.Quack;

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

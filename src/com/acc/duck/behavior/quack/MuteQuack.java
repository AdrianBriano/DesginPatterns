package com.acc.duck.behavior.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");

	}

}

package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String args[]) {

		double temp = 45.7;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature :" + temp);

		} else {
			System.out.println("Water will not freeze with temperature :" + temp);
		}

	}
}
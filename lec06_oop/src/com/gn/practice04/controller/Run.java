package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.startEngine();
		int defaultSpeed = c.checkSpeed();
		System.out.println("기본 속도는 "+ defaultSpeed + "km/h 입니다.");
		c.setSpeed(150);
		String destination = c.setDestination("부산"); 
		System.out.println(destination);
	}
}

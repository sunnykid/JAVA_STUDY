package com.gn.practice04.model.vo;

public class Car {
	public void startEngine() {
		System.out.println("자동차 시동이 켜졌습니다.");
	}
	
	public int checkSpeed() {
		int speed = 50;
		return speed;
	}
	
	public void setSpeed(int speed) {
		int cSpeed = speed;
		System.out.println("속도가 " + cSpeed + "km/h로 설정되었습니다." );
	}
	
	public String setDestination(String dest) {
		String destination = "목적지가 설정되었습니다.:"+dest;

		return destination;
	}
}

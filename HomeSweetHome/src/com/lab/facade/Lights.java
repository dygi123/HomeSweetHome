package com.lab.facade;

public class Lights implements Device{

	@Override
	public void On() {
		System.out.println("Lights on");
		
	}

	@Override
	public void Off() {
		System.out.println("Lights Off");
		
	}
	
}

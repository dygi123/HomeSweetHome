package com.lab.facade;

public class DvdPlayer implements Device{
	
	String dvd;

	@Override
	public void On() {
		System.out.println("DVD Player is on");
		
	}

	@Override
	public void Off() {
		System.out.println("DVD player is off");
		
		
	}
	public void eject() {
	}

	public void play (String dvd) {
	}
	
	public void stop() {
	}
	
	public void pause() {
	}
}
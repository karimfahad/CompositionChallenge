package com.challenge.CompositionChallenge;

public class Bed {
	
	private int length;
	private int width;
	
	
	public Bed(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public int getWidth() {
		return width;
	}
	
	public void beddimensions() {
		System.out.println("bed width is " + width + " and length is " + length);
	}

}

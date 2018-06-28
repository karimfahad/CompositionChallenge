package com.challenge.CompositionChallenge;

public class Furniture {
	
	private Bed bed;
	private int nightStand;
	private int chester;
	
	
	public Furniture(Bed bed, int nightStand, int chester) {
		
		this.bed = bed;
		this.nightStand = nightStand;
		this.chester = chester;
	}


	public void roomFurniture(String color) {
		System.out.println("Furniture color is "+ color);
	}
	
	/*private Bed getBed() {
		return bed;
	}*/
	
	public void beddimension() {
		bed.beddimensions();
	}


	public int getNightStand() {
		return nightStand;
	}


	public int getChester() {
		return chester;
	}
	
	

}

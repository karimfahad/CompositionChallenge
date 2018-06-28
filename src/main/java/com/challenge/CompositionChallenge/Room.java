package com.challenge.CompositionChallenge;

public class Room {
	
	private Furniture furniture;
	private Walls walls;
	
	
	public Room(Furniture furniture, Walls walls) {
		this.furniture = furniture;
		this.walls = walls;
	}


	public Furniture getFurniture() {
		return furniture;
	}


	public Walls getWalls() {
		return walls;
	}
	
	
	

}

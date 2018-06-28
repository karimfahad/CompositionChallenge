package com.challenge.CompositionChallenge;

public class Walls {
	
	private String color;
	private int doors;
	private WallsWithWindows wallswithwindows;
	
	public Walls(String color, int doors, WallsWithWindows wallswithwindows) {
		this.color = color;
		this.doors = doors;
		this.wallswithwindows = wallswithwindows;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public WallsWithWindows getWallswithwindows() {
		return wallswithwindows;
	}
	
	public void wallcolor() {
		System.out.println("Wall color is " + color);
	}

	public void doorcount() {
		System.out.println("door count is " + doors);
	}
}

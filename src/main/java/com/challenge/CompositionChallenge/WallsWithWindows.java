package com.challenge.CompositionChallenge;

public class WallsWithWindows {
	
	private int windows;

	public WallsWithWindows(int windows) {
		this.windows = windows;
	}

	public int getWindows() {
		return windows;
	}
	
	public void windowcount() {
		System.out.println("walls with windows " + windows);
	}

}

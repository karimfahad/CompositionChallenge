package com.challenge.CompositionChallenge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bed bed = new Bed(9,7); //initialized all objects passing instance variable
    	Furniture furniture = new Furniture(bed, 1, 1 );
    	
    	WallsWithWindows wallswithwindows = new WallsWithWindows(2);
    	Walls walls = new Walls("White", 3, wallswithwindows);
    	
    	Room room = new Room(furniture, walls);
    	room.getFurniture().roomFurniture("Brown"); //Brown is a local variable
    	//room.getWalls().getWallswithwindows();
    	room.getWalls().wallcolor();
    	walls.doorcount();
    	room.getWalls().getWallswithwindows().windowcount();
    	room.getFurniture().beddimension(); //removed Bed object by making bed method private but access beddimensions() method called
    	//called with beddimension() method  created in Bed object
    	//int nightStand = room.getFurniture().getNightStand();
    	System.out.println(room.getFurniture().getNightStand());
    	furniture.roomFurniture("yellow");
    }
}

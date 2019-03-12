/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * This class runs a world that contains crab critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class KingCrabRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		//Trapped bugs
		world.add(new Location(0, 0), new Rock());
		world.add(new Location(1, 1), new Rock());
		world.add(new Location(0, 2), new Bug());
		world.add(new Location(0, 1), new Bug());
		world.add(new Location(0, 3), new Rock());
		world.add(new Location(1, 3), new Rock());
		world.add(new Location(2, 2), new Rock());
		world.add(new Location(1, 2), new KingCrab());

		//Hallway bug
		world.add(new Location(0, 6), new Rock());
		world.add(new Location(1, 6), new Rock());
		world.add(new Location(2, 6), new Rock());
		world.add(new Location(3, 6), new Rock());
		world.add(new Location(4, 6), new Rock());
		world.add(new Location(0, 8), new Rock());
		world.add(new Location(1, 8), new Rock());
		world.add(new Location(2, 8), new Rock());
		world.add(new Location(3, 8), new Rock());
		world.add(new Location(4, 8), new Rock());
		world.add(new Location(5, 7), new Rock());
		world.add(new Location(3, 7), new Bug());
		world.add(new Location(4, 7), new KingCrab());
		
		//Diagonal bug
		world.add(new Location(9, 2), new KingCrab());
		world.add(new Location(9, 1), new Rock());
		world.add(new Location(8, 0), new Rock());
		world.add(new Location(6, 0), new Rock());
		world.add(new Location(7, 1), new Rock());
		world.add(new Location(8, 2), new Rock());
		world.add(new Location(7, 3), new Rock());
		world.add(new Location(9, 3), new Rock());
		world.add(new Location(8, 4), new Rock());
		world.add(new Location(6, 4), new Rock());
		world.add(new Location(7, 5), new Rock());
		world.add(new Location(9, 0), new Rock());
		world.add(new Location(9, 4), new Rock());
		world.add(new Location(7, 2), new Rock());
		world.add(new Location(6, 1), new Rock());
		world.add(new Location(6, 3), new Rock());
		world.add(new Location(6, 5), new Rock());
		world.add(new Location(8, 5), new Rock());
		world.add(new Location(9, 4), new Rock());
		world.add(new Location(8, 1), new Bug());
		world.add(new Location(8, 3), new Bug());

		world.show();
	}
}
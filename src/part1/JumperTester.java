
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
 * @author Cay Horstmann
 */

//package part1;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class JumperTester {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Grid<Actor> gr = world.getGrid();

		Jumper j1 = new Jumper();
		Jumper j2 = new Jumper();
		Jumper j3 = new Jumper();
		Jumper j4 = new Jumper();
		Jumper j5 = new Jumper();
		Jumper j6 = new Jumper();
		Rock r1 = new Rock();
		Rock r2 = new Rock();
		Rock r3 = new Rock();

		//Test rock right in front
		Location loc1 = new Location(8, 2);
		Location loc2 = new Location(7, 2);
		j1.putSelfInGrid(gr, loc1);
		r1.putSelfInGrid(gr, loc2);

		//Test rock at target location
		Location loc3 = new Location(8, 3);
		Location loc4 = new Location(6, 3);
		j2.putSelfInGrid(gr, loc3);
		r2.putSelfInGrid(gr, loc4);

		//Test rock right after target location
		Location loc5 = new Location(8, 4);
		Location loc6 = new Location(5, 4);
		j3.putSelfInGrid(gr, loc5);
		r3.putSelfInGrid(gr, loc6);

		//Test jumper with boundary at target
		Location loc7 = new Location(0, 2);
		j4.putSelfInGrid(gr, loc7);

		//Test jumper with boundary at target
		Location loc8 = new Location(1, 3);
		j5.putSelfInGrid(gr, loc8);

		//Test jumper with boundary before target
		Location loc9 = new Location(2, 4);
		j6.putSelfInGrid(gr, loc9);
		

		world.show();
	}
}

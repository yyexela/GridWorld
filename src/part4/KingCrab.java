import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter{

	public void processActors(ArrayList<Actor> actors){
		Location loc = getLocation();
		for(Actor a : actors){
			if(!(a instanceof Rock) && !(a instanceof Critter) && !(a instanceof Flower)){
				int dir = loc.getDirectionToward(a.getLocation());
				System.out.println("Facing: " + dir);
				Location toMove = a.getLocation().getAdjacentLocation(dir);
				System.out.println("Bug should move to: " + toMove.toString());
				if(getGrid().isValid(toMove) && (getGrid().get(toMove) == null || getGrid().get(toMove) instanceof Flower )){
					a.moveTo(toMove);
				} else {
					a.removeSelfFromGrid();
				}
			}
		}
	}


}
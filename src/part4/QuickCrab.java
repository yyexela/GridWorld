import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter{

    public ArrayList<Location> getMoveLocations() {
		int[] dirs = { Location.LEFT, Location.RIGHT };
        ArrayList<Location> newLocs = getMoveLocationsNew(dirs);
        if(newLocs.size() > 0) return newLocs;
        else return getMoveLocationsOld(dirs);
    }
    
    public ArrayList<Location> getMoveLocationsNew(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Location loc = getLocation();

		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			Location twiceNeighborLoc = loc.getAdjacentLocation(getDirection() + d).getAdjacentLocation(getDirection() + d);
			if (getGrid().isValid(neighborLoc) && getGrid().isValid(twiceNeighborLoc) && getGrid().get(neighborLoc) == null && getGrid().get(twiceNeighborLoc) == null)
				locs.add(twiceNeighborLoc);
		}
		return locs;
    }
    
    public ArrayList<Location> getMoveLocationsOld(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Location loc = getLocation();

		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (getGrid().isValid(neighborLoc) && getGrid().get(neighborLoc) == null)
				locs.add(neighborLoc);
		}
		return locs;
	}

    public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();

		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc))
				locs.add(neighborLoc);
		}
		return locs;
	}
}
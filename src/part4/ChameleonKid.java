//Imports
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{
    public ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int[] directions = {Location.AHEAD, Location.HALF_CIRCLE};
        for(Location loc : relativeLocations(directions)){
            Actor a = getGrid().get(loc);
            if(a != null) actors.add(a);
        }
        return actors;
    }

    private ArrayList<Location> relativeLocations(int[] directions){
        Location current = getLocation();
        ArrayList<Location> complete = new ArrayList<Location>();
        for(int dir : directions){
            dir = getDirection() + dir;
            Location toward = current.getAdjacentLocation(dir);
            if(getGrid().isValid(toward)) complete.add(current.getAdjacentLocation(dir));
        }
        return complete;
    }
}
//Imports 
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class RockHound extends Critter{
    //Changes which actors it gets, then processes the same as Critter
    /*
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> allActors = getGrid().getNeighbors(getLocation());
        ArrayList<Actor> actors = new ArrayList<Actor>();
        System.out.println("getActors()");
        for(Actor a : allActors){
            if(a instanceof Rock) actors.add(a);
            System.out.println("Added actor " + a.toString());
        }
        return actors;
    }
    */

    public void processActors(ArrayList<Actor> actors){
        for (Actor a: actors){
            if(a instanceof Rock) a.removeSelfFromGrid();
        }
    }
}
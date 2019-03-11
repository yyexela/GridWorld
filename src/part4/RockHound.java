//Imports
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;

public class RockHound extends Critter{

    public RockHound(){
        super();
    }

    public void processActors(ArrayList<Actor> actors){
        for (Actor a: actors){
            if(a instanceof Rock) a.removeSelfFromGrid();
        }
    }
}
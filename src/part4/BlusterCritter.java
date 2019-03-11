//Imports
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;

public class BlusterCritter extends Critter{

    int courage;

    public BlusterCritter(int courage){
        super();
        this.courage = courage;
    }

    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int rows = getGrid().getNumRows();
        int cols = getGrid().getNumCols();
        Location loc = getLocation();
        for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++){
            for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++){
                Location check = new Location(r, c);
                //System.out.println(check.toString());
                if(!check.equals(loc)){ //Don't count self
                    if(getGrid().isValid(check) && getGrid().get(check) != null){
                        actors.add(getGrid().get(check));
                        //System.out.println("Added " + getGrid().get(check));
                    }
                }
            }
        }
        return actors;
    }

    public void processActors(ArrayList<Actor> actors){
        int objects = 0;
        for(Actor a : actors){
            objects++;
        }
        if(objects >= courage){
            setColor(getColor().brighter());
            //System.out.println("Objects: " + objects);
            //System.out.println("brighter");
        } else {
            setColor(getColor().darker());
            //System.out.println("Objects: " + objects);
            //System.out.println("darker");
        }
    }
}
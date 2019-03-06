import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

public class Jumper extends Bug{

    //Constructors
    public Jumper(){
        super();
        setColor(Color.ORANGE);
    }
    
    public Jumper(Color bugColor){
        super(bugColor);
    }

    public void act(){
        Grid<Actor> gr = getGrid();
        Location current = getLocation();
        Location destination = current.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        //Check if destination is in boundaries
        if(!gr.isValid(destination)){
            //Destination is out of bounds, check if they can move forward
            if(canMove()){
                move();
                Flower flower = new Flower(getColor());
                flower.putSelfInGrid(gr, current);
            } else {
                turn();
            };
        } else {
            //We know destination is in bounds, check if destination contains an actor
            Actor neighbor = gr.get(destination);
            if((neighbor == null) || (neighbor instanceof Flower)){
                removeSelfFromGrid();
                putSelfInGrid(gr, destination);
                Flower flower = new Flower(getColor());
                flower.putSelfInGrid(gr, current);
            } else {
                //Destination contains a barrier
                if(canMove()){
                    move();
                    Flower flower = new Flower(getColor());
                    flower.putSelfInGrid(gr, current);
                } else {
                    turn();
                };
            }
        }
    }
}
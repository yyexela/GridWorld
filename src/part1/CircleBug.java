import info.gridworld.actor.Bug;
import java.awt.Color;

public class CircleBug extends Bug{
    private int steps;
    private int sideLength;

    //Constructors
    public CircleBug(int length){
        super();
        setColor(Color.BLUE);
        sideLength = length;
        steps = 0;
    }

    public CircleBug(int length, Color bugColor){
        super(bugColor);
        sideLength = length;
        steps = 0;
    }

    public void act(){
        if(steps < sideLength && canMove()){
            move(); 
            steps++;
        } else {
            turn();
            steps = 0;
        }
    }
}
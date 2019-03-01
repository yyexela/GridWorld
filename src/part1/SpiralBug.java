import info.gridworld.actor.Bug;
import java.awt.Color;

public class SpiralBug extends Bug{
    private int steps;
    private int sideLength;

    //Constructors
    public SpiralBug(){
        super();
        setColor(Color.GREEN);
        sideLength = 2;
        steps = 0;
    }
    
    public SpiralBug(Color bugColor){
        super(bugColor);
        sideLength = 2;
        steps = 0;
    }

    public void act(){
        if(steps < sideLength && canMove()){
            move(); 
            steps++;
        } else {
            turn();
            turn();
            steps = 0;
            sideLength += 1;
        }
    }
}
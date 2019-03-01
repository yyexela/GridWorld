import info.gridworld.actor.Bug;
import java.awt.Color;

public class ZBug extends Bug{
    private int steps;
    private int zSides;
    private int zLength;

    //Constructors
    public ZBug(int length){
        super();
        setColor(Color.PINK);
        zLength = length;
        zSides = 0;
        steps = 0;
        setDirection(90);
    }
    
    public ZBug(int length, Color bugColor){
        super(bugColor);
        zLength = length;
        steps = 0;
        zSides = 0;
        setDirection(90);
    }

    public void act(){
        if(canMove() && zSides < 3){
            if(steps < zLength){
                move();
                steps++;
            } else {
                zSides++;
                if(getDirection() == 90){
                    setDirection(225);
                    steps = 0;
                } else if(getDirection() == 225){
                    setDirection(90);
                    steps = 0;
                }
            }
        }
    }
}
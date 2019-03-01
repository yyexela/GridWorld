import info.gridworld.actor.Bug;
import java.awt.Color;

public class DancingBug extends Bug{
	private int[] dance;
	private int index;

    //Constructors
    public DancingBug(int[] dance){
        super();
		setColor(Color.MAGENTA);
		this.dance = dance;
		index = 0;
    }
    
    public DancingBug(int[] dance, Color bugColor){
		super(bugColor);
		this.dance = dance;
		index = 0;
    }

    public void act(){
        for(int i = 0; i < dance[index]; i++){
			turn();
		}
		if(canMove()) move();
		if(index+1 < dance.length) index++;
		else index = 0;
    }
}
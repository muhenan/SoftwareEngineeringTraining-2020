
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumpBug extends Actor
{

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
	private String str = "";
    public JumpBug()
    {
        setColor(Color.YELLOW);

    }
    
    public String getStr(){
    	return str;
    }
    /**
     * determine whether a Jump Bug can move
     * if yes, we will return true; else we will return false;
     */
    public boolean canJump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null){
            str = "cannot";
            return false;
        }
        Location loc = getLocation();
        Location nextone = loc.getAdjacentLocation(getDirection());
        Location nexttwo = nextone.getAdjacentLocation(getDirection());
        // 如果前面第一个格子或者第二个格子不合法就返回false
        if (!gr.isValid(nextone) || !gr.isValid(nexttwo))
        {  
            str = "cannot";
              return false;
        }
        Actor nextneighbor2 = gr.get(nexttwo);
        if(nextneighbor2 == null){
            str = "can";
            return true;
        }//如果下一个格子为null且第二个格子为flower或者rock的时候返回false
        if(!(nextneighbor2 instanceof JumpBug)){
            str = "cannot";
            return false;
        }
        if(nextneighbor2 instanceof JumpBug){
            str = "can";
            return true;
        }
        else{
            str = "cannot";   
            return false;
        }
       
    }
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
	//test if it can jump
       if(canJump())
       {
        Location loc = getLocation();
        Location nextone = loc.getAdjacentLocation(getDirection());
        Location nexttwo = nextone.getAdjacentLocation(getDirection());
        moveTo(nexttwo);
       }
       else
       {
	// just turn
           setDirection(getDirection() + Location.HALF_RIGHT);
       }
    }
}

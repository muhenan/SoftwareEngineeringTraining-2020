
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;


public class BlusterCritter extends Critter
{
    private int courage;
    //initial courages
    public BlusterCritter(int numberOfCritters)
    {
        super();
        courage = numberOfCritters;
    }
    //因为要获取到两步以内的所有actor，所以要重写getActors
    //获取到自身的位置然后从小于2的地方开始直到大于2的地方
    //行和列都是这样
    //切忌不能把自己算进去了而且不能为空
    public ArrayList<Actor> getActors()
    {
        Location loc = getLocation();
        ArrayList<Actor> actors = new ArrayList<Actor>();
        for (int i=loc.getCol()-2;i<=loc.getCol()+2;++i)
        {
            for(int j=loc.getRow()-2;j<=loc.getRow()+2;++j)
            {
                if(getGrid().isValid(new Location(j,i)))
                {
                    Actor a = getGrid().get(new Location(j,i));
                    if (a != null && a != this) 
			{
                        	actors.add(a);
                	}
		}
            }
        }
        return actors;
    }  
    // process actors
    public void processActors(ArrayList<Actor> actors)
    {
        int critterCount = 0;
        for (Actor a : actors)
        {
            if (a instanceof Critter){
                critterCount++;
		}
            else{
                continue;
		}
        }
        if(critterCount < courage)
        {
	    //change colors
            Color color = getColor().brighter();
            setColor(color);
        }
        else
        {
            //dark
            Color color = getColor().darker();
            setColor(color);
        }
    }

}

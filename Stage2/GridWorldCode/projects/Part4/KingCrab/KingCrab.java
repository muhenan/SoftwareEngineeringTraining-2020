import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter
{
    public KingCrab()
    {
        setColor(Color.YELLOW);
    }
	/*
	*上面的是构造函数，初始颜色是黄色
	*下面这个是判断能不能移动的函数
	*crab向左或者向右移动两格
	*必须两格都是空的
	*/
    private boolean canMoveMoreAway(Actor a)
    {
        ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(a.getLocation());

        for(Location loc:locs)
        {
            Location loc1 = getLocation();
            Location loc2 = loc;
            int x1 = loc1.getRow();
            int y1 = loc1.getCol();
            int x2 = loc2.getRow();
            int y2 = loc2.getCol();
            double dist = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)) + .5;
            int distance = (int)Math.floor(dist);
            if(distance > 1)
            {
                a.moveTo(loc);
                return true;
            }
        }
        return false;
    }


    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a: actors)
        {
            if(!canMoveMoreAway(a))
            {
                a.removeSelfFromGrid();
            }
        }
    }
   
}
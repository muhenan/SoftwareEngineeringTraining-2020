
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter
{
    public QuickCrab()
    {
        setColor(Color.ORANGE);
    }
	/*
	*上面这个是构造函数
	*初始颜色是橘子色
	*下面这个函数是获取左边第二步还有
	*右边第二步的对象
	*如果没有没有的话，就调用父类的这个函数
	*要不然就返回符合要求的loc
	*/
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid grid = getGrid();
        Location loc = getLocation();
        Location left1 = loc.getAdjacentLocation(getDirection() + Location.LEFT);
        if(grid.isValid(left1) && grid.get(left1) == null)
        {
            Location left2 = left1.getAdjacentLocation(getDirection() + Location.LEFT);
            if(grid.isValid(left2) && grid.get(left2) == null){
                locs.add(left2);}
        }
        Location right1 = loc.getAdjacentLocation(getDirection() + Location.RIGHT);
        if(grid.isValid(right1) && grid.get(right1) == null)
        {
            Location right2 = right1.getAdjacentLocation(getDirection() + Location.RIGHT);
            if(grid.isValid(right2) && grid.get(right2) == null){
                locs.add(right2);}
        }
        if(locs.size() == 0){
            return super.getMoveLocations();}
        else{
            return locs;}
    }
   
}
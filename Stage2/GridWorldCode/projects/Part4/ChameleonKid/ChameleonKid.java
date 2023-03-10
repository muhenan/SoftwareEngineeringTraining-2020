import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter
{	
	public ChameleonKid() {
		// TODO Auto-generated constructor stub
	}
	
	//just get front and behind actor
	public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int[] dirs =
            { Location.AHEAD, Location.HALF_CIRCLE };
        for (Location loc : getLocationsInDirections(dirs))
        {
            Actor a = getGrid().get(loc);
            if (a != null){
                actors.add(a);}
        }

        return actors;
    }
    /**
     * ChameleonKid的process和修改后的ChameleonCritter是一样的，直接继承就好
     * 但是要完成一个getLocationsInDirections函数，可以类比CrabCritter
     * Finds the valid adjacent locations of this critter in different directions.
     * @param directions - an array of directions (which are relative to the
     * current direction)
     * @return a set of valid locations that are neighbors of the current
     * location in the given directions
     * 直接复制粘贴Crab里的这个函数就行
     */
    public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();
    
        for (int d : directions)
        {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc)){
                locs.add(neighborLoc);}
        }
        return locs;
    }  
}
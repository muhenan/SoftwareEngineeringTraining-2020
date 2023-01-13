import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public final class CircleBugRunner
{
    private CircleBugRunner() {}
    public static void main(String[] args) {
          //create the grids
          ActorWorld world = new ActorWorld(); 
          //a bug with sideLength
          CircleBug alice = new CircleBug(2);  
          //set the color of bug
          alice.setColor(Color.ORANGE);
          //add it and set location  
          world.add(new Location(6, 2), alice); 
          //show the grids
          world.show(); 
    }
}
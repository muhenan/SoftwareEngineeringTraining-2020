import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public final class SpiralBugRunner
{
  public static void main(String[] args) {
      ActorWorld world = new ActorWorld();
      //create a Spiralbug 
      //the initial sideLength
      SpiralBug bob = new SpiralBug(2);
      //set its color 
      bob.setColor(Color.ORANGE);
      //add the bug into grids, and set the location
      world.add(new Location(5,3), bob);
      world.show();
  }

  private SpiralBugRunner() {}
}
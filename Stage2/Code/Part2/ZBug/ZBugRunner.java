import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public final class  ZBugRunner
{
   private ZBugRunner() {}
   public static void main(String[] args) {
      ActorWorld world = new ActorWorld();
      // create a zbug with the sideLength 4
      ZBug mm = new ZBug(3);
      // set the bug facing to east initially
      mm.setDirection(90);
      mm.setColor(Color.ORANGE);
       //add the bug into the grid, and set the location
      world.add(new Location(2,2), mm);
      world.show();
   }
}
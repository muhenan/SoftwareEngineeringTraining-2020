import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
 
public final class DancingBugRunner
{
   private DancingBugRunner() {}
   public static void main(String[] args) {
      // create a patten array
      int[] a = {1, 6, 2, 3, 5, 4, 8, 7};
      ActorWorld world = new ActorWorld();
      //creat a DancingBug with the patten array above
      DancingBug mm = new DancingBug(a);
      mm.setColor(Color.ORANGE);
      //add the bug into grid, and set the location initially
      world.add(new Location(2,2), mm);
      world.show();
   }
}
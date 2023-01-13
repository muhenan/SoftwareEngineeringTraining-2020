import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;

public class ChameleonKidRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(2, 2), new Rock(Color.BLUE));
        world.add(new Location(7, 2), new Rock(Color.YELLOW));
        world.add(new Location(2, 7), new Rock(Color.GREEN));
        world.add(new Location(5, 5), new ChameleonKid());
        world.show();
    }
}
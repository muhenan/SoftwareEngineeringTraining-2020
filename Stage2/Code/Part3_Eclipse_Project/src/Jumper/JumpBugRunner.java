package Jumper;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.awt.Color;

public class JumpBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        JumpBug alice = new JumpBug();
        world.add(new Location(7, 8), alice);
        world.add(new Location(2,8), new Rock());
        world.add(new Location(9,1), new Rock());
        world.add(new Location(8,8), new Rock());
        world.show();
    }
}

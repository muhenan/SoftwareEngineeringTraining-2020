import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class RockHoundRunner
{
    public static void main(String[] args)
    {
        //parameters
        int rockOneX = 7;
        int rockOneY = 8;
        int rockTwoX = 3;
        int rockTwoY = 3;
        int blueRockX = 2;
        int blueRockY = 8;
        int pinkRockX = 5;
        int pinkRockY = 5;
        //a new world
        ActorWorld world = new ActorWorld();
        //default rocks
        world.add(new Location(rockOneX, rockOneY), new Rock());
        world.add(new Location(rockTwoX, rockTwoY), new Rock());
        //rocks with colors
        world.add(new Location(blueRockX, blueRockY), new Rock(Color.BLUE));
        world.add(new Location(pinkRockX, pinkRockY), new Rock(Color.PINK));
        world.add(new Location(1, 5), new Rock(Color.RED));
        world.add(new Location(7, 2), new Rock(Color.YELLOW));
        // a rockhound
        int rockhoundLocation = 4;
        world.add(new Location(rockhoundLocation, rockhoundLocation), new RockHound());
        world.show();
    }
}
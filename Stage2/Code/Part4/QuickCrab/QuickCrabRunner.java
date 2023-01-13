
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class QuickCrabRunner
{
    public static void main(String[] args)
    {
        // a new world
        ActorWorld world = new ActorWorld();
        // x , y
        int firstRedFlowerX = 7;
        int firstRedFlowerY = 8;
        int secondRedFlowerX = 1;
        int secondRedFlowerY = 5;
        int firstYellowX = 3;
        int firstYellowY = 3;
        //flowers
        world.add(new Location(firstRedFlowerX, firstRedFlowerY), new Flower(Color.RED));
        world.add(new Location(firstYellowX, firstYellowY), new Flower(Color.YELLOW));
        world.add(new Location(secondRedFlowerX, secondRedFlowerY), new Flower(Color.RED));
        world.add(new Location(7, 2), new Flower(Color.YELLOW));
        // crabs
        world.add(new Location(4, 6), new QuickCrab());
        world.add(new Location(8, 8), new CrabCritter());
        world.show();
    }
}
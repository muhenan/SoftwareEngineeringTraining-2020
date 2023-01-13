import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class BlusterRunner
{
    public static void main(String[] args)
    {
	// a new world
        ActorWorld world = new ActorWorld();
	// some rocks
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(3, 7), new Rock());
        world.add(new Location(6, 4), new Rock());
	//flowers
        world.add(new Location(2, 8), new Flower(Color.BLUE));
        world.add(new Location(5, 5), new Flower(Color.PINK));
        world.add(new Location(1, 5), new Flower(Color.RED));
        world.add(new Location(7, 2), new Flower(Color.YELLOW));
	// bluster critters
        BlusterCritter darkOne = new BlusterCritter(1);
        darkOne.setColor(new Color(150, 150, 150));
        world.add(new Location(2, 7), darkOne);
        BlusterCritter lightOne = new BlusterCritter(18);
        lightOne.setColor(new Color(150, 150, 150));
        world.add(new Location(4, 4), lightOne);
        world.show();
    }
}

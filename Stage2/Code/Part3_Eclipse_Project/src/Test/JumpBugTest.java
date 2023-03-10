package Test;

import org.junit.Test;
import static org.junit.Assert.*; // Junit components
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import Jumper.JumpBug;

import java.awt.Color;
public class JumpBugTest {
   private static JumpBug jumpone = new JumpBug();

    @org.junit.Test // 运行中
    public void testInitialColor() throws Exception {
       Color color = jumpone.getColor();
       assertEquals(color, Color.YELLOW); // Assert: 初始颜色是否是黄色
    }

    @org.junit.Test //运行中
    public void testCanJump() throws Exception{
        boolean flat = jumpone.canJump();
        boolean result = false;
        String temp = jumpone.getStr();
        if(temp == "can")	result = true;
        assertEquals(flat,result);
        /*if(flat) assertEquals(flat, true);
        else assertEquals(flat, false);*/
    }

    @org.junit.Test
    public void testact() throws Exception {
    	jumpone.canJump();
    	String temp = jumpone.getStr();
        Location loc = jumpone.getLocation();
        jumpone.act();
        Location next = jumpone.getLocation();
        if(temp == "cannot")
            assertEquals(loc,next);
        else{
            int deltaX = next.getRow() - loc.getRow();
            int deltaY = next.getCol() - loc.getCol();
            if(deltaX < 0)
                deltaX *= -1;
            if(deltaY < 0)
                deltaY *= -1;
            assertEquals(deltaX+deltaY,2);
        }
    }

}

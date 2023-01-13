import info.gridworld.actor.Bug;
 
public class SpiralBug extends Bug
{
   private int steps;
   private int sideLength;

   //initial
   public SpiralBug(int length) {
        steps = 0;
        sideLength = length;
   }

   public void act() {
      if (steps < sideLength && canMove()) {
         move();
         steps++;
      } else {
        //after turn, add the sideLength
        turn();
        turn();
        sideLength++;
        steps = 0; 
      }
   }		
}
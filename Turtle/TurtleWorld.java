import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
            throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);        
        turtle.setPenColor(Color.BLUE);
        turtle.setPenWidth(20);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.penDown();
        turtle.forward(50);
        turtle.penUp();
       
        turtle.penDown();
        turtle.backward(50);
    }
}


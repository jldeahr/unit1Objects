import java.awt.Color;


public class TurtleWorld
{
    public static void main(String args[])
            throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.RED);
        turtle1.setShellColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        turtle1.setPenWidth(5);
        turtle2.setPenWidth(5);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle1.forward(50);
        turtle1.turnRight();
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setShellColor(Color.RED);
        turtle2.setShellColor(Color.RED);
        Thread.sleep(1000);
        turtle1.forward(50);
        turtle1.turnRight();
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.RED);
        turtle1.setShellColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        Thread.sleep(1000);
        turtle1.forward(50);
        turtle1.turnRight();
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setShellColor(Color.RED);
        turtle2.setShellColor(Color.RED);
        Thread.sleep(1000);
        turtle1.forward(50);
        turtle2.forward(50);
        Thread.sleep(1000);
        turtle1.penUp();
        turtle2.penUp();
        turtle1.turnRight();
        turtle1.turnRight();
        turtle2.turnLeft();
        turtle2.turnLeft();
        turtle1.forward(150);
        turtle2.forward(150);
        Picture picture = new Picture("C:/Users/jldeahr/Downloads/creepy_troll_face.jpg");
        turtle1.setPicture(picture);
        turtle2.setPicture(picture);
        Thread.sleep(1000);
        
    }
}


import java.awt.Color;

//Creates a new turtlie that will draw a picture in the window.
//Joe Deahr
//9-8-2014
public class TurtleWorld
{
    public static void main(String args[])
            throws InterruptedException
    {
        //Creates two new turtles
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        //Sets the pen color and shell color to start a pattern.
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.RED);
        turtle1.setShellColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        
        turtle1.setPenWidth(3);
        turtle2.setPenWidth(3);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        
        //Moves the turtle, continues the pattern, and pauses.
        turtle1.forward(50);
        turtle1.turnRight();
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setShellColor(Color.RED);
        turtle2.setShellColor(Color.RED);
        Thread.sleep(1000);
        
        //Basically the same as the last step.
        turtle1.forward(50);
        turtle1.turnRight();
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.RED);
        turtle1.setShellColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        Thread.sleep(1000);
        
        //We're still continuing the last two steps.
        turtle1.forward(50);
        turtle1.turnRight();
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setShellColor(Color.RED);
        turtle2.setShellColor(Color.RED);
        Thread.sleep(1000);
        
        /*Finishing the last movement of the pattern, then moving the turtles in
        opposite directions of each other, from the starting point.*/
        turtle1.forward(50);
        turtle2.forward(50);
        Thread.sleep(1000);
        turtle1.penUp();
        turtle2.penUp();
        turtle1.setShellColor(Color.GREEN);
        turtle2.setShellColor(Color.GREEN);
        turtle1.turnRight();
        turtle1.turnRight();
        turtle2.turnLeft();
        turtle2.turnLeft();
        turtle1.forward(150);
        turtle2.forward(150);
        turtle1.penDown();
        turtle2.penDown();
        
        /*This was an attempt to change the background picture, but the resolution was not
        correct, so it looks a little strange.*/
        Picture picture = new Picture("C:/Users/jldeahr/Downloads/creepy_troll_face.jpg");
               turtle1.drop(picture);
               turtle2.drop(picture);
               //picture.repaint();     Only opened a new window.
        Thread.sleep(1000);
        turtle1.setShellColor(Color.BLACK);
        turtle2.setShellColor(Color.BLACK);
        turtle1.turnRight();
        turtle1.turnRight();
        turtle2.turnLeft();
        turtle2.turnLeft();
        turtle1.forward(150);
        turtle2.forward(150);
        
        Thread.sleep(1000);
        
        }
}


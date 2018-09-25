package classwork_1; //references the parent project folder, in other words i want to fucking die
import java.awt.*; //java abstract window tool
import javax.swing.*; //java gui widget

public class HelloGraphics extends JPanel
  {
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g); //dont ask me what the fuck this does all ik is javascript does it better

      g.setColor(Color.RED); //sets the color of the box to red
      g.drawRect(110, 90, 150, 45); //draws a fucking rectangle, why am i commenting this

      g.setColor(Color.BLUE); //sets color for text to blue 
      g.drawString("Hello, Graphics!", 145, 115); //draws out text p5.js does this better

    }
    public static void main(String[] args)
    {
      JFrame window =new JFrame("Graphics Demo"); //what the fuck is a JFrame? A canvas? i have no fucking clue
      window.setBounds(500, 500, 400, 300); //Sets the bounds for the window
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when you hit the red x it closes the fucking program shit head
      HelloGraphics panel = new HelloGraphics(); //drops a function or some shit
      panel.setBackground(Color.WHITE); //background color to white
      Container c = window.getContentPane(); //dont even know what the fuck this shit is
      c.add(panel); //david blane shit

      window.setVisible(true); //makes the window fucking visible shit head
    }
  }

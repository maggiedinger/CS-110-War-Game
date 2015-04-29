import java.awt.*;
import javax.swing.*;

public class GameOfWar {
    public static void main(String[] args) {

      JFrame frame = new JFrame("Game of War");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JButton button1 = new JButton(new ImageIcon("back.jpg"));
      JButton button2 = new JButton(new ImageIcon("back.jpg"));
      frame.getContentPane().add(button1);
      frame.getContentPane().add(button2);
      frame.pack();      
      frame.setVisible(true);

   }
}
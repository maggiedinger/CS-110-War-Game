import java.awt.*;
import javax.swing.*;

public class GameOfWar extends JFrame {
   public GameOfWar(){

      //JFrame frame = new JFrame("Game of War");
      setTitle("Game of War");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new BorderLayout());
         //create four panels
      JPanel panelButton1 = new JPanel();
      JPanel panelButton2 = new JPanel();
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
         //create buttons
      JButton button1 = new JButton(new ImageIcon("back.jpg"));
      JButton button2 = new JButton(new ImageIcon("back.jpg"));
         //add buttons to panels
      panelButton1.add(button1);
      panelButton2.add(button2);
         //add panels to content pane
      add(panel1, BorderLayout.CENTER);
      add(panelButton1, BorderLayout.WEST);
      add(panel2, BorderLayout.CENTER);
      add(panelButton2, BorderLayout.EAST);
      //frame.getContentPane().add(button1);
      //frame.getContentPane().add(button2);
      //frame.pack();      
      //frame.setVisible(true);
      pack();
      setVisible(true);
   }
   public static void main(String[] args) {
       new GameOfWar();
   }
}
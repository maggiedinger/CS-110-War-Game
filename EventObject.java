import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EventObject extends JFrame
{
   private War game;
   private JButton button1;
   private JButton button2;
   
   private JPanel imagePanel;
   private JLabel startLabel;
   private JPanel buttonPanel;
   
   //private final int WINDOW_WIDTH = 300;
  // private final int WINDOW_HEIGHT = 70;

   public EventObject()
   {
      setTitle("Game of War");
     // setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
         //create button
     // button1 = new JButton("Player 1");
      //button2 = new JButton("Player 2");
      
      game = new War();
      

      setLayout(new BorderLayout());
      buildImagePanel();
      buildButtonPanel();
      add(imagePanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
         //add panel to content pane
      
      pack();
      
      setVisible(true);
      
   }
   
   private void buildImagePanel()
   {
         //create a panel
      imagePanel = new JPanel();
      
      startLabel = new JLabel ("Play a Game of War");
      
      imagePanel.add(startLabel);    
   }
   
   private void buildButtonPanel()
   {
      ImageIcon cardBack;
         //create panel
      buttonPanel = new JPanel();
         //get image
      cardBack = new ImageIcon("back.jpg");
         //create buttons
      button1 = new JButton ("Play");
      button1.setIcon(cardBack);
      button2 = new JButton ("Exit");
      button2.setIcon(cardBack);
      
         //register
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener()); 
         //add
      buttonPanel.add(button1);
      buttonPanel.add(button2);
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         ImageIcon card = new ImageIcon("back.jpg");
         startLabel.setIcon(card);
         startLabel.setText(null);
         pack();
         // String actionCommand = e.getActionCommand();
//          
//          if (actionCommand.equals("Play"))
//          {
//             JOptionPane.showMessageDialog(null, "You clicked Player 1");
//            
//          }
//          
//          else if (actionCommand.equals("Player 2"))
//          {
//             JOptionPane.showMessageDialog(null, "You clicked Player 2");
//            
//          }
         
      }
   }
   
   public static void main(String[] args)
   {
      new EventObject();
   }
}


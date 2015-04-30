import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WarGUI extends JFrame implements ActionListener
{ 
   private Deck game; // the guts 
   
   private JPanel p1, p2, p3, p4, p5, p6; 
   // you can add a panel to a frame, but not a frame to a panel 
   private JLabel label,label2, label3, label4;
   private JTextField tfield;
   private JButton newGameButton, drawButton;
   private ImageIcon ii; 
   
   // BUILD THE GUI 
   public WarGUI() 
   {
      game = new Deck(); 
      // implicit this
      //setLayout(new BorderLayout()); // if you take this out, the image will 
      setLayout(new GridLayout(2,2)); 
      
      ii = new ImageIcon("2c.jpg"); 
      label3 = new JLabel(ii);
      //add(label3, BorderLayout.CENTER);
     // label4 = new JLabel("hi yall"); 
      //add(label4, BorderLayout.SOUTH); 
      
      // create new panels 
      p1 = new JPanel();
      p2 = new JPanel(); 
      p3 = new JPanel();
      p4 = new JPanel();
      p5 = new JPanel(); 
      p6 = new JPanel(); 
      
      
      // change the background colors 
      p1.setBackground(Color.GREEN); //Color class, can be all upper or all lower 
      p2.setBackground(Color.pink); 
      p3.setBackground(Color.RED);
      p4.setBackground(Color.YELLOW);
      p5.setBackground(Color.BLUE);
      p6.setBackground(Color.orange); 
      
     // p1.add(new JLabel("one")); 
      //p2.add(new JLabel("two"));
      //p3.add(new JLabel("three"));
      //p4.add(new JLabel("four"));
      //p5.add(new JLabel("five"));
      //p6.add(new JLabel("six")); 
      
      
      //create labels 
     // label = new JLabel("panel 1's a label");
     // label2= new JLabel("panel 2's a label"); 
      
      // add buttons 
      newGameButton = new JButton("New Game"); 
      
      drawButton = new JButton("Draw Card");
      
      
      
      newGameButton.addActionListener(this);
      drawButton.addActionListener(this); 
      
      
      
      p5.add(newGameButton); 
      p5.add(drawButton); 
      
      // add the labels to the panels 
      //p1.add(label);
      //p2.add(label2); 
      
      // add panels 
     //  this.add(p1, BorderLayout.NORTH);
//       this.add(p2, BorderLayout.SOUTH); 
//       this.add(p3, BorderLayout.EAST);
//       this.add(p4, BorderLayout.WEST);
//       this.add(p5, BorderLayout.CENTER); 
         add(p1);
         add(p2);
         add(p3);
         add(p4);
         add(p5);
         add(p6); 
      
      
      // buttons, label, and textfields will appear in the order you added them. 
      
     // label = new JLabel("I am a label"); // Display area for a short text string, image, or both. Output only 
     // add(label);

     // tfield = new JTextField(20);  // CONSTRUCTOR a component that allows the editing of a single line of text (20 cols wide)
      //add(tfield);

      //label2 = new JLabel("I am a label, too");
     // add(label2);
      
      
     // button = new JButton("push me");
     // add(button);
   } 
   
   
   // button things   
   //private class ButtonListener implements ActionListener
   //{
     
   
      public void actionPerformed(ActionEvent e)
      {
         Object src = e.getSource();
         if (src == newGameButton) 
         {
            ImageIcon image = new ImageIcon("2h.jpeg");
            p2.add(image); 
         } 
         else if (src == drawButton) 
         {
            //p3.add(new JLabel("hi")); 
         }
     // }
   }
       
        
   
   

}
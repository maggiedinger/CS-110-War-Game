//Maggie Dinger
// CS 110
// April 27, 2015
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**GameOfWar lets the user use a GUI format to play a game of war
*/ 
public class GameOfWars extends JFrame
{
   private War game;//A game of War
   private JPanel panel1;//To put title
   private JPanel panel2;//To put card buttons on
   private JButton exitButton;//Exit game button
   private JButton player1;//Player 1's card button
   private JButton player2;//PLayer 2's card button
   private ImageIcon cardBack;//The back of the card
   private JLabel title;//Create label for title
   private JLabel player1Label;//Create label for player 1
   private JLabel player2Label;//Create label for player 2
   //private char setButton;//To allow the button to be seen in two states
   
      // build the GUI
   public GameOfWars()
   {
   
      setLayout(new BorderLayout(2,2));
         // create game instance
      game =new War();
      
         //define panel1 and make white
      panel1 = new JPanel();
      panel1.setBackground(Color.WHITE);
         //define panel2 and make white
      panel2 = new JPanel();
      panel2.setBackground(Color.WHITE);
   
         //load card backs and buttons onto panels
      cardBack = new ImageIcon("back.jpg");
         //create exitButton to exit game
      String buttonText="Click to Exit";
      exitButton= new JButton(buttonText);
   
      panel1.add(exitButton);
      title=new JLabel("A game of war");
      //title.setFont(new Font("ARIAL",Font.BOLD,36));
      panel1.add(title);
         //add panel to window
      add(panel1);
   
         //add player's card's buttons to panels
         //with card back image to start
      player1 = new JButton(cardBack);
      player2 = new JButton(cardBack);
         //add button
      panel2.add(player1);
   
      player1Label=new JLabel("Player 1");
      panel2.add(player1Label);
   
      panel2.add(player2);
      player2Label=new JLabel("Player 2");
      panel2.add(player2Label);
      
      add(panel2);
         //deal game
      game.deal();

      player1.addActionListener(new ButtonListener());
   
   }
    /**ButtonListener allows the computer to do an action
      when the button is pressed
     */
    private class ButtonListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
                     //get the card the players have
                  Card player1Turn = game.getPlayer1Card();
                  Card player2Turn = game.getPlayer2Card();
               
                     //load images into buttons
                  ImageIcon player1Image = new ImageIcon();
                  player1Image = player1Turn.getImage();
                  ImageIcon player2Image = new ImageIcon();
                  player2Image = player2Turn.getImage();
               
                     //set the icon's as those images
                  player1.setIcon(player1Image);
                  player2.setIcon(player2Image);
                     
                     //play the game
                  game.battle();
                  player1Turn = game.getPlayer1Card();
                  player2Turn = game.getPlayer2Card();
               
                     //load images into buttons
                  player1Image = player1Turn.getImage();
                  player2Image = player2Turn.getImage();
               
                     //set the icon's as those images
                  player1.setIcon(player1Image);
                  player2.setIcon(player2Image);
               
        }
   
   }
}
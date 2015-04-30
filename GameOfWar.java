import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameOfWar extends JFrame {
   
      private War game;
      private JPanel panel1, panel2;
      //setTitle("Game of War");
      private JButton playerButton, player1Button, player2Button;
      private ImageIcon cardBack;
      private JLabel player1Deck,player2Deck, title, status, roundWinner;;
      
      private char action;
      
      public GameOfWar(){
      
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      action = 'a';
      setLayout(new GridLayout(2,1));
         game = new War();
         //create two panels
      panel1 = new JPanel();
      panel1.setBackground(Color.WHITE);

      JPanel panel2 = new JPanel();
      panel2.setBackground(Color.WHITE);
      
      cardBack=new ImageIcon("back.jpg");
      String buttonText="click";
      playerButton= new JButton(buttonText);
      panel1.add(playerButton);
      title=new JLabel("A Game of War");
      title.setFont(new Font("ARIAL",Font.BOLD,36));
      panel1.add(title);
      
      add(panel1);   
      
      player1Button=new JButton(cardBack);
      player2Button=new JButton(cardBack);
      
      panel2.add(player1Button);
      player1Deck=new JLabel("Player 1");
      
      panel2.add(player2Button);
      player2Deck=new JLabel("Player 2");
      
      add(panel2);
      game.deal();
      
      player2Button.addActionListener(new ButtonListener());
    }
     private class ButtonListener implements ActionListener
   {
      private String fightWinner;
      private char roundWinnerTrigger='a';
      public void actionPerformed(ActionEvent e)
      {  
         if (action =='a')
         {
            //start new fight
            game.battle();
            
            //get the cards being used in the fight
          
            Card player1Turn = new Card(game.getPlayer1Card());
            Card player2Turn = new Card(game.getPlayer2Card());
            
            //load images into buttons
            ImageIcon player1Image=new ImageIcon();
            player1Image=player1Turn.getImage();
            ImageIcon player2Image=new ImageIcon();
            player2Image=player2Turn.getImage();
            
            player1Button.setIcon(player1Image);
            player2Button.setIcon(player2Image);
            
         }
         
         if (action=='b')
         {
            //compare cards
            game.battle();
            
            //find out who won
            String roundWinner = game.getWinner();
            
            //say who won the round
            if (roundWinnerTrigger=='b')
            {
               panel1.remove(roundWinner);
            }
            roundWinner=new JLabel();
            roundWinner.setFont(new Font("ARIAL",Font.BOLD,16));
            panel1.add(roundWinner);
            roundWinner.setText(fightWinner+" won the round");
            roundWinnerTrigger='b';
         }
        
        //say who won the game
        if (game.getWinner().equals("Player 1"))
        {
            JLabel status = new JLabel("Player 1 won the game");
            status.setFont(new Font("ARIAL",Font.BOLD,24));
            panel1.add(status);
        }
        
        if (game.getWinner().equals("Player 2"))
        {
            JLabel status = new JLabel("Player 2 won the game");
            status.setFont(new Font("ARIAL",Font.BOLD,24));
            topPanel.add(status);
        }   
         
      }
      

   } 

   
//          //create buttons
//       JButton button1 = new JButton(new ImageIcon("back.jpg"));
//       JButton button2 = new JButton(new ImageIcon("back.jpg"));
//          //add buttons to panels
//       panelButton1.add(button1);
//       panelButton2.add(button2);
//          //add panels to content pane
//       add(panel1, BorderLayout.CENTER);
//       add(panelButton1, BorderLayout.WEST);
//       add(panel2, BorderLayout.CENTER);
//       add(panelButton2, BorderLayout.EAST);

     // pack();
      //setVisible(true);
   }

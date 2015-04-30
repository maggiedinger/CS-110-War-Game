import java.util.ArrayList;

public class War {
   
      private Deck deck;//Create a new deck
      final int PLAYER_HAND = 26;//Each player gets half of standard decl
         //create an arraylist for player1
      private ArrayList <Card> player1 = new ArrayList <Card>(PLAYER_HAND);
         //create an arraylist for player2
      private ArrayList <Card> player2 = new ArrayList <Card>(PLAYER_HAND);
      private String winner;//The winner after each round
      private Card player1Card, player2Card;//The card that is being played      
      
      /**Deal allows the deck to be dealt.  It creates a new deck, 
         shuffles it, and then distibutes it to the two players.
      */
      
      public void deal(){
            //create deck
         deck = new Deck();
            //shuffle deck
         deck.shuffle();
      
            //deal cards to players
          while(!deck.isEmpty())
          {
               //deal one to player one
             if (player1.size()==player2.size())
             {
               player1.add(deck.dealCard());
             }
               //after player one gets a card deal to player two
             if (player1.size()>player2.size())
             {
               player2.add(deck.dealCard());
             } 
          }
     }
      /**Battle allows the cards to be compared.  If player one's card 
      and player two's card are equal then they give a card and compare
      the next, continuing until one player is out of cards or one player
      has a card that is grater than the othe player's.
      */
      public void battle(){
            //make sure neither arraylist is empty
         while(!player1.isEmpty()&&!player2.isEmpty())
         {
               //start at the first element of the arraylist
            int i=0;
            try
            {
                  //when player 1's card is greater than player 2's
               while (((player1.get(i)).getRank()) > ((player2.get(i)).getRank()))
               {
                     //the winner is player 1
                  winner = "Player 1";
                     //player 1 gets player 2's card
                  player1.add(player2.get(i));
                     //that card is removed from player 2
                  player2.remove(player2.get(i));
                     //the card in the first element position
                     //is added to the end
                  player1.add(player1.get(i));
                     //and deleting from the beginning of the arraylist
                  player1.remove(player1.get(i));
               }
                  //when player 2's card is greater than player 1's
               while (((player2.get(i)).getRank()) > ((player1.get(i)).getRank()))
               {
                     //player 2 is the winner
                  winner = "Player 2";
                     //player 2 gets player 1's card
                  player2.add(player1.get(i));
                     //player 1 looses that card
                  player1.remove(player1.get(i));
                     //player 2's first element card is put on the end
                     //of the arraylist
                  player2.add(player2.get(i));
                     //and deleted from the front
                  player2.remove(player2.get(i));
               }
                  //when the two cards are the same
               while(((player2.get(i)).getRank()) == ((player1.get(i)).getRank()))
                {
                     //avoid any mishap
                  if (((player1.get(0)).getRank()) > ((player2.get(0)).getRank()))
                  {
                     winner = "Player 1";
                     break;
                  }
                     //avoid any mishap
                  if (((player2.get(0)).getRank()) > ((player1.get(0)).getRank()))
                  {
                      winner = "Player 2";
                     break;
                  }
                     //increment to the third element
                  i = i+2;   
                       
                  try
                  {
                        //compare the elements at that marker
                     if (((player1.get(i)).getRank()) > ((player2.get(i)).getRank()))
                     {
                           //declre the winner
                        winner = "Player 1";

                           //add player 2's card to player 1
                        for (int j=0; j<=i; j++)
                        {
                           player1.add(player2.get(j));
                        }
                           //remove them from player 2
                        for (int j = i; j>=0; j--)
                        {
                           player2.remove(player2.get(j));
                        }
                           //add player 1's cards onto the end
                        for (int j=0; j<=i; j++)
                        {
                           player1.add(player1.get(j));
                        }
                           //remove player 1's cards from beginning
                        for (int j = i; j>=0; j--)
                        {
                           player1.remove(player1.get(j));
                        }
   
                     }
      
                     if (((player2.get(i)).getRank()) > ((player1.get(i)).getRank()))
                     {
                        winner = "Player 2";
                        for (int j=0; j<=i; j++)
                        {
                           player2.add(player1.get(j));
                        }
                        
                        for (int j = i; j>=0; j--)
                        {
                           player1.remove(player1.get(j));
                        }
   
                        for (int j=0; j<=i; j++)
                        {
                           player2.add(player2.get(j));
                        }
                        
                        for (int j = i; j>=0; j--)
                        {
                           player2.remove(player2.get(j));
                        }
                     }
                  }
                     //if either player runs out of cars in a "war"
                  catch (IndexOutOfBoundsException e)
                  {
                     if (i > (player1.size())-1)
                     {
                        winner = "Player 2";
                        System.out.print("Player 2 wins!");
                        System.exit(0);
                     }
                     
                     if (i > (player2.size())-1)
                     {
                        winner = "Player 1";
                        System.out.print("Player 1 wins!");
                        System.exit(0);
                     }
                  }                     
               
               }
            }
               //if either player runs out of cards during the game
            catch (IndexOutOfBoundsException e)
            {
               if (i > (player1.size())-1)
               {
                  winner = "Player 2";                  
                  System.out.print("Player 2 wins!");
                  System.exit(0);
               }
                     
               if (i > (player2.size())-1)
               {
                  winner = "Player 1";
                  System.out.print("Player 1 wins!");
                  System.exit(0);
               }
            } 
      }
      }
     
     /**OutofCards declares whether either player is out of cards,
      and if they are, declares a winner: the one with cards left.
      */          
     public void outOfCards(){               
         //player 1 runs out of cards
        if (player1.isEmpty())
        {   
            //player two is the winner
         winner = "Player 2";
         System.out.print("Player 2 wins!");
         System.exit(0);
        }
         //player 2 runs out of cards
        if (player2.isEmpty())
        {
            //player 1 is the winner
         winner = "Player 1";
         System.out.print("Player 1 wins!");
         System.exit(0);
        }
     }
   /**Get player 1 card returns the top card in the array.
   */
   public Card getPlayer1Card()
   {
      return player1.get(0);
   }
   
   /**Get player 2 card returns the top card in the array.
   */
   public Card getPlayer2Card()
   {
      return player2.get(0);
   }
   
   /**GetWinner returns the winner
   */
   public String getWinner()
   {
      return winner; 
   }
}

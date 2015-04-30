/**
 * Representation of a Deck of cards.  
 * Initialized to a standard 52 card deck. 
 *
 * @author Jackie Horton
 */

import java.util.Random;
import javax.swing.ImageIcon;

public class Deck 
{
   /** 
   *  Number of cards in standard deck {@value #CARDS_IN_DECK}
   **/
   public final static int CARDS_IN_DECK = 52;

   /** The collection of Cards */
   private Card [] deck;
   /** Current number of Cards in Deck */
   private int ct;
   
   /**
    * Constructs a regular 52-card deck.  Initially, the cards
    * are in a sorted order.  The shuffle() method can be called to
    * randomize the order.  
    */
   public Deck()
   {
      freshDeck();
   }
   /**
    * Create a new collection of 52 cards, in sorted order
    */
   public void freshDeck()
   {
      deck = new Card[CARDS_IN_DECK];
      for (int r = 2; r<= 14 ;r++)
      {
         for (int s= 1;s<= 4;s++)
         {
            deck[ct]=new Card(s,r);
            ct = ct + 1;
         }
      }
      
      deck[0].assignImage("2s.jpg");
      deck[1].assignImage("2c.jpg");
      deck[2].assignImage("2h.jpg");
      deck[3].assignImage("2d.jpg");
      deck[4].assignImage("3s.jpg");
      deck[5].assignImage("3c.jpg");
      deck[6].assignImage("3h.jpg");
      deck[7].assignImage("3d.jpg");
      deck[8].assignImage("4s.jpg");
      deck[9].assignImage("4c.jpg");
      deck[10].assignImage("4h.jpg");
      deck[11].assignImage("4d.jpg");
      deck[12].assignImage("5s.jpg");
      deck[13].assignImage("5c.jpg");
      deck[14].assignImage("5h.jpg");
      deck[15].assignImage("5d.jpg");
      deck[16].assignImage("6s.jpg");
      deck[17].assignImage("6c.jpg");
      deck[18].assignImage("6h.jpg");
      deck[19].assignImage("6d.jpg");
      deck[20].assignImage("7s.jpg");
      deck[21].assignImage("7c.jpg");
      deck[22].assignImage("7h.jpg");
      deck[23].assignImage("7d.jpg");
      deck[24].assignImage("8s.jpg");
      deck[25].assignImage("8c.jpg");
      deck[26].assignImage("8h.jpg");
      deck[27].assignImage("8d.jpg");
      deck[28].assignImage("9s.jpg");
      deck[29].assignImage("9c.jpg");
      deck[30].assignImage("9h.jpg");
      deck[31].assignImage("9d.jpg");
      deck[32].assignImage("10s.jpg");
      deck[33].assignImage("10c.jpg");
      deck[34].assignImage("10h.jpg");
      deck[35].assignImage("10d.jpg");
      deck[36].assignImage("jacks.jpg");
      deck[37].assignImage("jackc.jpg");
      deck[38].assignImage("jackh.jpg");
      deck[39].assignImage("jackd.jpg");
      deck[40].assignImage("queens.jpg");
      deck[41].assignImage("queenc.jpg");
      deck[42].assignImage("queenh.jpg");
      deck[43].assignImage("queend.jpg");
      deck[44].assignImage("kings.jpg");
      deck[45].assignImage("kingc.jpg");
      deck[46].assignImage("kingh.jpg");
      deck[47].assignImage("kingd.jpg");
      deck[48].assignImage("aces.jpg");
      deck[49].assignImage("acec.jpg");
      deck[50].assignImage("aceh.jpg");
      deck[51].assignImage("aced.jpg");
   
   }
   /** 
     * Remove and return the top Card on the Deck
     * @return A reference to a Card that was top on the Deck
     */
   public Card dealCard()
   {
      ct--;
      return deck[ct];
   }
   /** 
     * Return current number of Cards in Deck
     * @return number of Cards in Deck
     */
   public int cardsRemaining()
   {  
      return ct;
   }
   /** 
     * Randomize the order of Cards in Deck
     */
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < ct; i++)
      {
         randNum = r.nextInt(ct);
         temp = deck[i];
         deck[i]=deck[randNum];
         deck[randNum]=temp;
      }
   }
   /** 
     * Determine if Deck is empty
     * @return true if there are no more cards, false otherwise
     */
   public boolean isEmpty()
   {
      return (cardsRemaining() == 0);
   }

}
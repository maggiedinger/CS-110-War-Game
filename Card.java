import java.util.Random;

// Maggie Dinger
// CS 110
// February 23, 2015
// Card

/**
   The Card class allows you to make cards by specifying the values
*/
public class Card
{
   //declare constants
   //declare variables
   public final int SPADES = 1;//Spades Suit
   public final int CLUBS = 2;//Club Suit
   public final int HEARTS = 3;//Hearts Suit
   public final int DIAMONDS = 4;//Diamonds Suit
   public final int ACE = 14;//Ace Card
   public final int JACK = 11;//Jack Card
   public final int QUEEN = 12;//Queen Card
   public final int KING = 13;//King Card
   private int rank;//The rank value: value of the card
   private int suit;//The suit value: suit of the card
      /** The collection of Cards */
   private Card [] deck;
   /** Current number of Cards in Deck */
   private int ct;
   /**
      The Card class creates a card, given input of the
      rank and suit of the card
      @param s The suit of the card
      @param r The rank of the card
   */
   public Card( int s, int r)
   {
      suit = s;
      rank = r;
   }
   
   /**
      getSuit method returns the suit of the card
      @return suit An integer of the suit of the card as entered
      by the user.
   */
   public int getSuit ()
   {
      return suit;
   }
   
   /**
      getRank method returns the rank of the card
      @return rank An integer of the rank of the card as entered
      by the user.
   */
   public int getRank ()
   {
      return rank;
   }

   /**
      toString method creates a string of the rank and suit
      @return A string of the rank and suit of card.
   */
   public String toString()
   {
      String card = getRankAsString() + " of " + getSuitAsString();
      return card;
   }
   
   /**
      getRankAsString method gives the user the rank as a string
      @return cardName A string that is the card rank.
   */
   public String getRankAsString()
   {
      String cardName;
      
      switch (rank)
      {
         case 14: cardName = "Ace";
         break;
         
         case 2: cardName = "2";
         break;
         
         case 3: cardName = "3";
         break;
         
         case 4: cardName = "4";
         break;
         
         case 5: cardName = "5";
         break;
         
         case 6: cardName ="6";
         break;
         
         case 7: cardName = "7";
         break;
         
         case 8: cardName = "8";
         break;
         
         case 9: cardName = "9";
         break;
         
         case 10: cardName = "10";
         break;
         
         case 11: cardName = "Jack";
         break;
         
         case 12: cardName = "Queen";
         break;
         
         case 13: cardName = "King";
         break;
         
         default: cardName = "2";
      }
      return cardName;
   }
   
    /**
      getSuitAsString method gives the user the suit as a string
      @return cardName A string that is the card suit.
    */
    public String getSuitAsString()
    {
      String suitName;
      switch (suit)
      {
         case 1: suitName = "Spades";
         break;
         
         case 2: suitName = "Clubs";
         break;
         
         case 3: suitName = "Hearts";
         break;
         
         case 4: suitName = "Diamonds";
         break;
         
         default: suitName = "Spades";
      }
      
      return suitName;
   }
   
   /**
      equals method compares two card objects for equality
      @return A boolean value of true or false.
   */
   public boolean equals(Card otherCard)
   {
         //create instance variable
      boolean compare;
         //if they are equal
      if (otherCard.getRank()== rank)
         {
            //set eqaul to true
         compare = true;
         }
         //if they aren't equal
      else
            //set equal to false
         compare = false;
         //return the value given to compare in loop
      return compare;
   }
   
   public boolean greaterThan(Card otherCard)
   {
         //create instance variable
      boolean compare;
         //if they are equal
      if (otherCard.getRank() > rank)
         {
            //set eqaul to true
         compare = true;
         }
         //if they aren't equal
      else
            //set equal to false
         compare = false;
         //return the value given to compare in loop
      return compare;
   }
   
   public boolean lessThan (Card otherCard)
   {
         //create instance variable
      boolean compare;
         //if they are equal
      if (otherCard.getRank() < rank)
         {
            //set eqaul to true
         compare = true;
         }
         //if they aren't equal
      else
            //set equal to false
         compare = false;
         //return the value given to compare in loop
      return compare;
   }

      //tester
   public static void main(String [] args)
   {
   Card card1 = new Card(1, 7);
   System.out.print(card1.toString() + "\n");
   Card card2 = new Card(2, 7);
   System.out.print(card2.toString() + "\n");
   Card card3 = new Card(3, 13);     
   System.out.print(card3.toString() + "\n");
   Card card4 = new Card(4, 1);
   System.out.print(card4.toString() + "\n");
   //System.out.print(card4.getRank() + "\n");
   //System.out.print(card4.getSuit() + "\n");
   System.out.print(card1.equals(card2) + "\n");
   System.out.print(card3.equals(card4) + "\n");
         Deck deck = new Deck();
      deck.shuffle();
      int i = 0;
      while (!(deck.isEmpty()))
         System.out.println(i++ + " : " + deck.dealCard().toString());
      System.out.println("************");
      i = 0;
      while (!(deck.isEmpty()))
         System.out.println(i++ + " : " + deck.dealCard().toString());
   }
}

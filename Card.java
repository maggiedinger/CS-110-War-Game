import javax.swing.ImageIcon;


// Maggie Dinger
// CS 110
// April 27, 2015
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
   private ImageIcon cardImage; //The card's personal image

   /**
      The Card constructor creates a card, given input of the
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
      The Card constructor creates a card, given a card as input
      @param card The card
   */
   
   public Card(Card card)
     {
      suit=card.getSuit();
      rank=card.getRank();
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
   

   /**Assign an image to the card
      @param name The name of the card
   */
   public void assignImage(String name)
   {
      cardImage=new ImageIcon(name);
   }
     
   /**Get image will retrieve the image from the card
     @return The image associated with the card
   */
   public ImageIcon getImage()
   {
     return cardImage;
   }
     
   /**Get image name  will retrieve the name of the image of 
      that card
     @return The name of the image associated with the card
   */
   public String getImageName()
   {
      String imageName=cardImage.toString();
      return imageName;
   }
}

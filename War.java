import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class War {

  public static void main( String[] args ) {
      final int PLAYER_HAND = 26;
      
      Deck deck = new Deck();
      deck.shuffle();
//create an array list

    ArrayList <Card> player1 = new ArrayList <Card>(PLAYER_HAND);
    ArrayList <Card> player2 = new ArrayList <Card>(PLAYER_HAND);
    while(!deck.isEmpty())
      {
         if (player1.size()==player2.size())
         {
            player1.add(deck.dealCard());
         }
         if (player1.size()>player2.size())
         {
            player2.add(deck.dealCard());
         } 
      }
     while(!player1.isEmpty()&&!player2.isEmpty())
     {
         int i=0;
         try
         {
        //while (player1.size() < player2.size() || player1.size())
        //{
            
            //{
            
               while (((player1.get(i)).getRank()) > ((player2.get(i)).getRank()))
               {
                  player1.add(player2.get(i));
                  player2.remove(player2.get(i));

                  player1.add(player1.get(i));
                  player1.remove(player1.get(i));
               }
   
               while (((player2.get(i)).getRank()) > ((player1.get(i)).getRank()))
               {
                  player2.add(player1.get(i));
                  player1.remove(player1.get(i));

                  player2.add(player2.get(i));
                  player2.remove(player2.get(i));
               }
               
               while(((player2.get(i)).getRank()) == ((player1.get(i)).getRank()))
                {
                  
                  if (((player1.get(0)).getRank()) > ((player2.get(0)).getRank()))
                  {
                     break;
                  }
                  if (((player2.get(0)).getRank()) > ((player1.get(0)).getRank()))
                  {
                     break;
                  }
  
                  i = i+2;        
                  try
                  {
                     if (((player1.get(i)).getRank()) > ((player2.get(i)).getRank()))
                     {
                        for (int j=0; j<=i; j++)
                        {
                           player1.add(player2.get(j));
                        }
                        
                        for (int j = i; j>=0; j--)
                        {
                           player2.remove(player2.get(j));
                        }
   
                        for (int j=0; j<=i; j++)
                        {
                           player1.add(player1.get(j));
                        }
                        
                        for (int j = i; j>=0; j--)
                        {
                           player1.remove(player1.get(j));
                        }
   
                     }
      
                     if (((player2.get(i)).getRank()) > ((player1.get(i)).getRank()))
                     {
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
                  
                  catch (IndexOutOfBoundsException e)
                  {
                     if (i > (player1.size())-1)
                     {
                        System.out.print("Player 2 wins!");
                        System.exit(0);
                     }
                     
                     if (i > (player2.size())-1)
                     {
                        System.out.print("Player 1 wins!");
                        System.exit(0);
                     }
                  }                     
//                      player2.add(player1.get(0));
//                      player2.add(player1.get(1));
//                      player2.add(player1.get(i));
//                      
//                      player1.remove(player1.get(i));
//                      player1.remove(player1.get(1));
//                      player1.remove(player1.get(0));
// 
// 
//                      player2.add(player2.get(0));
//                      player2.add(player2.get(1));
//                      player2.add(player2.get(i));
//                      player2.remove(player2.get(i));
//                      player2.remove(player2.get(1));
//                      player2.remove(player2.get(0));
                  
               
               // if (((player2.get(i)).getRank()) == ((player1.get(i)).getRank()))
//                {
//                   i = i+2;
//                   
//                   if (((player1.get(i)).getRank()) > ((player2.get(i)).getRank()))
//                   {
//                      for (int j=0; j<=i; j++)
//                      {
//                         player1.add(player2.get(j));
//                      }
//                      
//                      for (int j = i; j>=0; j--)
//                      {
//                         player2.remove(player2.get(j));
//                      }
// 
//                      for (int j=0; j<=i; j++)
//                      {
//                         player1.add(player1.get(j));
//                      }
//                      
//                      for (int j = i; j>=0; j--)
//                      {
//                         player1.remove(player1.get(j));
//                      }
// 
//                   }
//    
//                   if (((player2.get(i)).getRank()) > ((player1.get(i)).getRank()))
//                   {
//                      for (int j=0; j<=i; j++)
//                      {
//                         player2.add(player1.get(j));
//                      }
//                      
//                      for (int j = i; j>=0; j--)
//                      {
//                         player1.remove(player1.get(j));
//                      }
// 
//                      for (int j=0; j<=i; j++)
//                      {
//                         player2.add(player2.get(j));
//                      }
//                      
//                      for (int j = i; j>=0; j--)
//                      {
//                         player2.remove(player2.get(j));
//                      }
//                   }   
               
               
               }
            }
            catch (IndexOutOfBoundsException e)
            {
               if (i > (player1.size())-1)
               {
                  System.out.print("Player 2 wins!");
                  System.exit(0);
               }
                     
               if (i > (player2.size())-1)
               {
                  System.out.print("Player 1 wins!");
                  System.exit(0);
               }
            } 
      }
               
     
                     
     if (player1.isEmpty())
     {
      System.out.print("Player 2 wins!");
      System.exit(0);
     }
     
     if (player2.isEmpty())
     {
      System.out.print("Player 1 wins!");
      System.exit(0);
     }

//     //create a queue to load array list into
//     QueueReferenceBased player1 = new QueueReferenceBased();
//     QueueReferenceBased player2 = new QueueReferenceBased();
//             //load all tags from the array list into the queue, from index 0 to 
//             //end of file 
//     for (int i=0; i<player1Cards.size();i++) 
//       { 
//          //add to the queue
//          player1.enqueue(player1Cards.get(i));
//       }
//     for (int i=0; i<player2Cards.size();i++)
//       {  
//          //add to the queue
//          player2.enqueue(player2Cards.get(i));
//       }
//   
// 
//     StackReferenceBased playerOne = new StackReferenceBased();
//     StackReferenceBased playerTwo = new StackReferenceBased();
//             //while the queue is not empty
//     while(!player1.isEmpty())
//       {
//          playerOne.push(player1.dequeue());
//       }
//     while(!player2.isEmpty())
//       {
//          playerTwo.push(player2.dequeue());
//       }

// 

    
    
//     while(!player1.isEmpty()&&!player2.isEmpty()) 
//        {
//          if ((player1.peek()).compareTo(player2.peek())>(player2.peek()).compareTo(player1.peek()))
//             {
//                player1.enqueue(player1.dequeue);
//                player1.enqueue(player2.dequeue);
//             }
//          if ((player2.peek()).compareTo(player1.peek())>(player1.peek()).compareTo(player2.peek()))
//             {
//                player2.enqueue(player1.dequeue);
//                player2.enqueue(player2.dequeue);
//             }
         //else
           // {
            
            //}
       



   }
}
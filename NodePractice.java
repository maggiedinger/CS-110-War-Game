public class NodePractice
{
   public static void main(String [] args)
   {
      /* Create two nodes
         n1 contains Integer 6, next is null
         n2 contains Integer 11, next is null
      */
      Node n1 = new Node(new Integer(6));
      Node n2 = new Node(new Integer(11));

      /* "hook up" the nodes
         head will be a a new Node refence 
            referring to the to the first node 
            (containing 6)
         the next/last node will be the node containing 11
      */
      Node head;
      n1.setNext(n2);
      head=n1;
      
      /* insert a new Node containing 13 into the list
         as the 2nd element
      */
      Node newNode = new Node(new Integer(13), head.getNext());
      head.setNext(newNode);
      n1=n2=null;
      
      /* insert a new Node, containing 10 at the end of the
         list 
         To do this, create a new Node reference, called prev.
         prev will start at head.  as long as prev->next does
         not equal null, keep moving down the list.  When 
         the loop ends,  prev will refer to the last item 
         in the list.  How do you use this to add the new node?
      */
         newNode = new Node(new Integer(10));
         Node prev=head;
         while (prev.getNext() != null)
         {
            prev = prev.getNext();
         }
         prev.setNext(newNode); // next already contains null
       /* complete method displayList below 
            test it out by displaying current list*/
//         displayList(head);
      /* write a loop that searches the list (starting at head) for
      The first occurrence of the Node containing Integer 11.  
      At the end of the loop, a Node reference curr should hold a
      reference to the Node containing 11 or null if no such Node
      exists.  Hint : this should be helpful in your find method of 
      your linked list.
      */   
//       Integer toFind = new Integer(11);   
//       Node curr = head;
//       while (!curr.getItem().equals(toFind))
//       {
//          curr = curr.getNext();
//       }
      
      /* now modify the previous loop with also manage a prev reference.
      At the end of the loop, curr will hold a reference to the desired 
      Node, prev will hold a reference to the Node that precedes the Node
      reference by curr.
      */
      Integer toFind = new Integer(11);   
      Node curr = head;
      prev = null;
      while (!curr.getItem().equals(toFind))
      {
         prev = curr;
         curr = curr.getNext();
      }

               
   }
   /*given a reference to the first Node in a list, print
   the item in each Node in the list */
//    public static void displayList(Node n)
//    {
//       while (n != null)
//       {
//          System.out.println(n.getItem());
//          n = n.getNext();
//       }
//    }
}
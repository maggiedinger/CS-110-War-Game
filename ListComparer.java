import java.util.Random;
//Maggie Dinger
//April 6, 2015
//List Comparer

public class ListComparer
{

	public static void main(String [] args)
	{
      long time1,time2, diff;
      
         //create new list array based list
      ListInterface list1 = new ListArrayListBased();
      
      System.out.print("All calculations are in miliseconds/10,000 times performing operation\n");
         //take time at beginning
      time1 = System.currentTimeMillis();
         //add to the beginning
      for (int i =1;i<= 10000;i++)  
      {
         list1.add(1, new Integer(5));
         list1.add(1, new Integer(7));
         list1.add(1, new Integer(2));
         list1.add(1, new Integer(9));
      }
         //take time after add to beginning
      time2 = System.currentTimeMillis();
         //take difference in times
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to add to the beginning(array list based): "+diff+"\n");
      
         //take time at beginning
      time1 = System.currentTimeMillis();
         //add to the end
      for (int i =1;i<= 10000;i++)
      {
         list1.add(5, new Integer(1));
         list1.add(6, new Integer(4));
         list1.add(7, new Integer(3));
         list1.add(8, new Integer(8));
      }
         //take time after adding to the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to add to the end(array list based): "+diff+"\n");
      
      
         //take time at beginning
      time1 = System.currentTimeMillis();
         //remove from beginning of list
      for (int i =1;i<= 10000;i++)
      {
         list1.remove(1);
      }
         //take time after removing to beginning
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out time it took
      System.out.print("Time to remove from the beginning(array list based): "+diff+"\n");
       
      
         //take time at beginning
      time1 = System.currentTimeMillis();
         //remove from end of list
      for (int i =1;i<= 10000;i++)
      {
         list1.remove(list1.size()-1);
      }
         //take time after removing from the end
      time2 = System.currentTimeMillis();
         //take the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to remove from the end(array list based): "+diff+"\n");
     
     
         //take the time at the beginning
      time1 = System.currentTimeMillis();
         //List traversal
      for (int i =1;i<= 10000;i++)
      {
         for (int j = 1; j<=list1.size();j++)
			list1.get(j);
      }
         //take the time at the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to traverse list(array list based): "+diff+"\n");
      

      
         //take the time at the beginning      
      time1 = System.currentTimeMillis();
         //creat reference based list
      ListInterface list2 = new ListReferenceBased();
         //add to the beginning
      for (int i =1;i<= 10000;i++)
      {
         list2.add(1, new Integer(5));
         list2.add(1, new Integer(7));
         list2.add(1, new Integer(2));
         list2.add(1, new Integer(9));
      }
         //take the time at the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to add to the beginning (reference based): "+diff+"\n");
      

         //take the time at the beginning      
      time1 = System.currentTimeMillis();
         //add to the end
      for (int i =1;i<= 10000;i++)
      {  
         list2.add(5, new Integer(1));
         list2.add(6, new Integer(4));
         list2.add(7, new Integer(3));
         list2.add(8, new Integer(8));
      }
         //take the time at the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to add to the end (reference based): "+diff+"\n");


         //take the time at the beginning      
      time1 = System.currentTimeMillis();
         //remove from beginning of list
      for (int i =1;i<= 10000;i++)
      {
         list2.remove(1);
      }
         //take the time at the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to remove from the beginning (reference based): "+diff+"\n");


         //take the time at the beginning
      time1 = System.currentTimeMillis();
         //remove from end of list
      for (int i =1;i<= 10000;i++)
      {
         list2.remove(list2.size()-1);
      }
         //take the time at the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to remove from the end (reference based): "+diff+"\n");

      
         //take the time at the beginning
      time1 = System.currentTimeMillis();
         //List traversal
      for (int i =1;i<= 10000;i++)
      {
         for (int j = 1; j<=list2.size();j++)
			list2.get(j);
      }
         //take the time at the end
      time2 = System.currentTimeMillis();
         //find the difference
      diff = time2-time1;
         //print out the time it took
      System.out.print("Time to traverse list(reference based): "+diff+"\n");

	}
}
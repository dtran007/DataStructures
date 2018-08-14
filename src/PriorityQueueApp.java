import java.io.IOException;

public class PriorityQueueApp
{

   public static void main(String[] args) throws IOException
   {
      // Utilize PriorityQueue Class
      int size = 5;
      PriorityQueue priorityQ = new PriorityQueue(size);
      
      priorityQ.insert(30);
      priorityQ.insert(50);
      priorityQ.insert(10);
      priorityQ.insert(40);
      priorityQ.insert(20);
      
      priorityQ.insert(60); //Full queue
      
      while( !priorityQ.isEmpty() )
      {
         int item = priorityQ.remove();
         System.out.println("Removing: "+item);
      }
            
   }

}

//Sorted array based priority queue, ascending priority
class PriorityQueue
{
   private int maxSize;
   private int[] queArray;
   private int numElem;
   
   public PriorityQueue(int size)
   {
      maxSize = size;
      queArray = new int[maxSize];
      numElem = 0;
   }
   
   public void insert(int item) 
   {
      if(isFull())
      {
         System.out.println("Queue is Full. Cannot Insert.");
      }
      else
      {
         int i;

         if(numElem==0)
         {
            queArray[numElem++] = item; //insert at 0
            System.out.println("Inserted: "+item);
         }
         else
         {
            for(i=numElem-1; i>=0; i--) //start at end
            {
               if(item > queArray[i] ) //if new item larger shift up
               {
                  queArray[i+1] = queArray[i];
               }
               else //else smaller
               {
                  break; //no shift
               }
            }

            queArray[i+1] = item;    //insert
            System.out.println("Inserted: "+item);
            numElem++;
         }
      }
   }
   
   public int remove()
   {
      if(isEmpty())
      {
         System.out.println("Queue is empty. Cannot remove.");
         return 0;
      }
      else
      {
         return queArray[--numElem];
   
      }
   }
   
   public int peekMin()
   {
      return queArray[numElem-1];
   }
   
   public boolean isEmpty()
   {
      return (numElem == 0);
   }
   
   public boolean isFull()
   {
      return (numElem == maxSize);
   }
   
}

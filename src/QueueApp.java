
//Array based Queue with wrap around

public class QueueApp
{

   public static void main(String[] args)
   {
      // Utilize Queue Class
      
      int size = 5;
      Queue intQueue = new Queue(size);
      
      intQueue.insert(10);
      intQueue.insert(20);
      intQueue.insert(30);
      intQueue.insert(40);
      
      System.out.println("Removing: " + intQueue.remove());
      System.out.println("Removing: " + intQueue.remove());
      System.out.println("Removing: " + intQueue.remove());
   
      intQueue.insert(50);
      intQueue.insert(60);
      intQueue.insert(70);
      intQueue.insert(80);
      intQueue.insert(99);

      while(!intQueue.isEmpty() )
      {
         System.out.println("Removing: " + intQueue.remove());
      }
      
   }

}

class Queue
{
   private int maxSize;
   private int[] queArray;
   private int front;
   private int rear;
   private int numElem;
   
   public Queue(int size)
   {
      maxSize = size;
      queArray = new int[maxSize];
      front = 0;
      rear = -1;
      numElem = 0;
   }
   
   public void insert(int item)
   {
      if(numElem == maxSize)
      {
         System.out.println("Cannot add to Queue.");
      }
      else 
      {
         if(rear == maxSize -1) //wrap around
         {
            rear = -1;
         }

         queArray[++rear] = item;
         numElem++;
      }
   }
   
   public int remove()
   {
      if(numElem == 0)
      {
         System.out.println("Queue Empty.");
         return 0;
      }
      else 
      {
         int temp = queArray[front++]; //get from front and increment

         if(front == maxSize) //wrap around
         {
            front = 0;
         }
         numElem--;
         return temp;
      }
   }
   
   public int peekFront()
   {
      return queArray[front];
   }
   
   public boolean isEmpty()
   {
      return(numElem == 0);
   }
   
   public boolean isFull()
   {
      return(numElem == maxSize);
   }
   
   public int size()
   {
      return numElem;
   }
   
   
}

import java.util.Random;

public class BubbleSortApp
{

   public static void main(String[] args)
   {
      //Utilize ArrayBubble Class
      
      int arrSize = 5;
      ArrayBubble arr = new ArrayBubble(arrSize);
      
      //Insert values
      arr.insert(9);
      arr.insert(50);
      arr.insert(75);
      arr.insert(13);
      arr.insert(25);
      
      arr.display();
      arr.bubbleSort();
      arr.display();
      
      //RNG
      int sizeR = 10;
      ArrayBubble arrR = new ArrayBubble(sizeR);
      
      //Random Number
      Random randObj = new Random();
      
      for(int i=0; i<sizeR; i++)
      {
         arrR.insert(randObj.nextInt(1000)+1); //Range 1-1000
      }
      
      arrR.display();
      arrR.bubbleSort();
      arrR.display();

   }

}


class ArrayBubble
{
   //Variables
   private int[] arr;
   private int numElem;

   //Constructor
   public ArrayBubble(int size)
   {
      arr = new int[size];
      numElem = 0;
   }
   
   public void insert(int value)
   {
      arr[numElem] = value;
      numElem++;
   }
   
   public void display()
   {
      for(int i=0; i<numElem; i++)
      {
         System.out.print(arr[i] + " ");
      }
      System.out.println("");
   }
   
   public void bubbleSort()
   {
      for(int i=0; i<numElem-1; i++)
      {
         for(int j=0; j<numElem-i-1; j++)
         {
            if(arr[j] > arr[j+1])
            {
               swap(j, j+1);
            }
         }
      }
   }
   
   private void swap(int one, int two)
   {
      int temp = arr[one];
      arr[one] = arr[two];
      arr[two] = temp;
   }
}


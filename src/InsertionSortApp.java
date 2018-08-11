import java.util.Random;


public class InsertionSortApp
{

   public static void main(String[] args)
   {
      //Utilize ArrayInsertion Class
      
      int arrSize = 5;
      ArrayInsertion arr = new ArrayInsertion(arrSize);
      
      //Insert values
      arr.insert(9);
      arr.insert(50);
      arr.insert(75);
      arr.insert(13);
      arr.insert(25);
      
      arr.display();
      arr.insertionSort();
      arr.display();
      
      //RNG
      int sizeR = 10;
      ArrayInsertion arrR = new ArrayInsertion(sizeR);
      
      //Random Number
      Random randObj = new Random();
      
      for(int i=0; i<sizeR; i++)
      {
         arrR.insert(randObj.nextInt(1000)+1); //Range 1-1000
      }
      
      System.out.println("Random Generated Numbers:");
      arrR.display();
      arrR.insertionSort();
      System.out.println("InsertionSorted Numbers:");
      arrR.display();
      
   }

}

class ArrayInsertion
{
   private int[] arr;
   private int numElem;
   
   public ArrayInsertion(int arrSize)
   {
      arr = new int[arrSize];
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
   
   public void insertionSort()
   {
      int in, out;
      
      for(out=1; out<numElem; out++) //sorted | unsorted divide point
      {
         int temp = arr[out];       //insertion (int) 
         in = out;                  // start shift
         while(in>0 && arr[in-1] >= temp)
         {
            arr[in] = arr[in-1];    //shift (int)s right
            --in;
         }
         arr[in] = temp;            //insertion of (item)
      }
   }
   
}
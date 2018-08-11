import java.util.Random;

public class SelectionSortApp
{

   public static void main(String[] args)
   {
      //Use ArraySelection
      int arrSize = 5;
      ArraySelection arr = new ArraySelection(arrSize);
      
      //Insert values
      arr.insert(9);
      arr.insert(50);
      arr.insert(75);
      arr.insert(13);
      arr.insert(25);
      
      arr.display();
      arr.selectionSort();
      arr.display();
      
      //RNG 
      int sizeR = 10;
      ArraySelection  arrR = new ArraySelection(sizeR);
      
      //Random Number
      Random randObj = new Random();
      
      for(int i=0; i<sizeR; i++)
      {
         arrR.insert(randObj.nextInt(1000)+1); //Range 1-1000
      }
      
      System.out.println("Random Generated Numbers:");
      arrR.display();
      arrR.selectionSort();
      System.out.println("SelectionSorted Numbers:");
      arrR.display();
      
   }

}


class ArraySelection
{
   //Variables
   private int[] arr;
   private int numElem;
   
   public ArraySelection(int arrSize)
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
         System.out.print(arr[i]+ " ");
      }
      System.out.println("");
   }
   
   public void selectionSort()
   {
      int out, in, min;
      
      for(out=0; out<numElem-1; out++)
      {
         min = out;
         
         for(in = out+1; in<numElem; in++)
         {
            if(arr[in] < arr[min])
            {
               min = in;
            }
         }
         
         swap(out, min);
      }
   }
   
   private void swap(int one, int two)
   {
      int temp = arr[one];
      arr[one] = arr[two];
      arr[two] = temp;
   }
   
 
}
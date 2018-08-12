import java.util.Random;

public class StackApp
{

   public static void main(String[] args)
   {
      //Utilize Stack Class
      int stackSize = 5;
      Stack intStack = new Stack(stackSize);
      
      Random randObj = new Random();
      
      //Push random int onto stack
      int randInt;
      for(int i=0; i<intStack.size(); i++)
      {
         randInt = randObj.nextInt(100)+1; //Range 1-100
         intStack.push(randInt);
         System.out.println("Pushing: "+ randInt);
      }
         
      
      while( !intStack.isEmpty() ) //until stack empty
      {
         int value = intStack.pop();
         System.out.println("Popping: " + value); //print value
      }
   }

}

class Stack
{
   private int maxSize;
   private int[] stackArr;
   private int top;
   
   public Stack(int size)
   {
      maxSize = size;
      stackArr = new int[maxSize];
      top = -1;
   }
   
   public void push(int item)
   {
      stackArr[++top] = item; //preincrement/insert item
   }
   
   public int pop()
   {
      return stackArr[top--]; //return top, then decrement
   }
   
   public int peek()
   {
      return stackArr[top];
   }
   
   public boolean isEmpty()
   {
      return (top == -1);
   }
   
   public boolean isFull()
   {
      return (top == maxSize-1);
   }
   
   public int size()
   {
      return maxSize;
   }
   
}

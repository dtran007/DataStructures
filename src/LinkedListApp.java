
public class LinkedListApp
{

   public static void main(String[] args)
   {
      // Implementation of LinkedList
      LinkedList lList = new LinkedList();
      
      lList.insertFirst(1, 'A');
      lList.insertFirst(2, 'B');
      lList.insertFirst(3, 'C');
      
      lList.displayList();
      
      while( !lList.isEmpty())
      {
         Link tempLink = lList.deleteFirst(); //delete Link
         System.out.print("Deleted ");
         tempLink.displayLink();
         System.out.println("");
      }
      
      lList.displayList();
      
   }

}

class Link
{
   public int iData;    //data item (key)
   public char cData;    //other data item(s)
   public Link next;    //next link in list
   
   public Link(int id, char cd)
   {
      iData = id;
      cData = cd;
   }
   
   public void displayLink()
   {
      System.out.print("{"+iData+", "+cData+"} ");
   }
   
}

class LinkedList
{
    private Link first; //reference to first link in list

    public LinkedList() //constructor
    {
       first = null;
    }
    
    public boolean isEmpty()
    {
       return (first == null);
    }
    
    public void insertFirst(int id, char cd)
    {
       Link newLink = new Link(id, cd);
       newLink.next = first;
       first = newLink;       
    }
    
    public Link deleteFirst()
    {
       Link tempLink = first;
       first = first.next;
       return tempLink;
    }
    
    public void displayList()
    {
       System.out.print("LinkedList (first --> last): ");
       
       if( isEmpty() )
       {
          System.out.println("Empty List.");
       }
       else
       {
          Link currentLink = first;
          while(currentLink != null)
          {
             currentLink.displayLink();
             currentLink = currentLink.next; //Move to next Link
          }
          System.out.println("");
       }
    }
}

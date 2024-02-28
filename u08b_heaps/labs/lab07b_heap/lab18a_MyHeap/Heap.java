//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private ArrayList<Integer> list;

	public Heap()
	{
      list = new ArrayList<Integer>();

	}

	public void add(int value)
	{
      list.add(value);
      swapUp()

	}

   //Note that if you want to implement swapUp recursively,
   //you'll need to add a parameter to keep track of where you
   //are in the heap.
   private void swapUp()
   {
      int here = list.size() - 1;
      int original = (here - 1) / 2;
      while(here > 0 && list.get(here) > list.get(original))
      {
         swap(original, here);
         here = original;
         original = (here-1)/2;                            
      }
   }
	public void remove( )
	{
      
      //Replace the root with the last element
      
      //Remove the last element
      
      //Reheapify!

	}

   //Note that if you want to implement swapDown recursively,
   //you'll need to add a parameter to keep track of where you
   //are in the heap.
	private void swapDown()
	{





	}
	
	private void swap(int start, int finish)
	{


	
	}

   public void print()
   {
      //out.println("PRINTING THE HEAP!\n");
      int x=0;
      for(int i=1; i<list.size(); i *= 2)
      {
         for(int s=1; s<list.size()-i; s++)
         {
            out.print(" ");
         }
         for(int j=0; j<=i-1 && x<list.size(); j++)
         {
            out.print(list.get(x++) + "  ");
         }
         out.println();
         if(x == list.size()-1)
         {
            out.print(list.get(x++) + "  ");
         }
      }
      out.println("\n");
   }

	public String toString()
	{
		return list.toString();
	}
}
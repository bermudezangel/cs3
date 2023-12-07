//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

import static java.lang.System.*;

public class IntQueue extends Throwable
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		listOfInts = new ArrayList<Integer>();
	}

	public void add(int item)
	{
		listOfInts.add(item);
	}

	public int remove()
	{	
		int removed = 0;
		if (listOfInts.size() == 0){
			removed = -1;
		}
		else{
			removed = listOfInts.get(0);
			listOfInts.remove(0);
		}	
		return removed;
	}

	public boolean isEmpty()
	{
		if (listOfInts.size() == 0){
			return true;
		}
		return false;
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		String output = Arrays.toString(listOfInts.toArray());
		return output;
	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorTest
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorTest(String line, String rem)
	{
		setTest(line, rem);
	}

	public void setTest(String line, String rem)
	{
		String[] words = line.split(" ");     
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove = rem;
	}

	public void remove()
	{
		Iterator<String> removal = list.iterator();
		while (removal.hasNext()){
			String currentWord = removal.next();
			if (currentWord.equals(toRemove))
				removal.remove();
		}
	}

	public String toString()
	{
		String output = "[";
      for (String s : list){
         output += s + ", ";
      }
      output += "]";
      return output;
	}
}
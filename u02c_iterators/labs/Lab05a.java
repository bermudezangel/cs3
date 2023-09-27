//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
	public static void main ( String[] args )
	{
		IteratorTest test = new IteratorTest("a b c a b c a", "a");
      test.remove();
      out.println(test);
      
      test = new IteratorTest("a b c d e f g h i j x x x x", "x");
      test.remove();
      out.println(test);	
	}
}
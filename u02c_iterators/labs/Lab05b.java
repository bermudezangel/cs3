//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		ListIteratorTest test = new ListIteratorTest("a b c a b c", "a", "+");
		out.println(test);
		test.replace();
		out.println(test);
      out.println("--------------------------------");	
      
      test = new ListIteratorTest("a b c d e f g h i j x x x x", "x", "7");
		out.println(test);
		test.replace();
		out.println(test);
      out.println("--------------------------------");
      
      test = new ListIteratorTest("1 2 3 4 5 6 a b c a b c ", "b", "#");
		out.println(test);
		test.replace();
		out.println(test);
      
	}
}
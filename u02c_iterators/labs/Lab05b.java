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
	}
}
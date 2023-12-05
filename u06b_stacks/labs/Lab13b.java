//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class Lab13b
{
	public static void main ( String[] args )
	{
		SyntaxChecker test = new SyntaxChecker("(abc(*def)");		
		out.println(test);

		test = new SyntaxChecker("[{}]");		
		out.println(test);

		test = new SyntaxChecker("[");		
		out.println(test);

		test = new SyntaxChecker("[{<()>}]");		
		out.println(test);

		test = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");		
		out.println(test);

		test = new SyntaxChecker("[one]<two>{three}(four)");		
		out.println(test);

		test = new SyntaxChecker("car(cdr(a)(b)))");		
		out.println(test);

		test = new SyntaxChecker("car(cdr(a)(b))");		
		out.println(test);
	}
}

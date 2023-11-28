//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;
	private String poppedItems;

	public StackTester()
	{
		setStack("a b c d e f g h i");
	}

	public StackTester(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack = new Stack<String>();
		for(String s : line.split(" ")){
			stack.push(s);
		}
	}

	public void popEmAll()
	{
		poppedItems = "";
		while(!(stack.isEmpty())){
			poppedItems += stack.pop() + " ";
		}
	}

	public String toString()
	{
		String output = "";
		output += stack.toString();

		output += "\n\npopping all items from the stack \n";
		popEmAll();
		output += poppedItems;

		return output;
	}
	//add a toString
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		for (String s : list.split(" ")){
			queue.add(s);
			stack.push(s);
		}
	}

	public boolean isPalin()
	{
		String palin1 = "";
		String palin2 = "";
		while (!queue.isEmpty()){
			palin1 = queue.remove();
		}
		while (!stack.isEmpty()){
			palin2 = stack.pop();
		}
		if (palin2.equals(palin1)){
			return true;
		}
		return false;
	}


	public String toString(){
		String output = queue.toString();
		if (isPalin())
			return output + " is a palinlist.";
		return output + " is not a palinlist." ;
	}
}
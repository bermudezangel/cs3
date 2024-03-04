//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		PQTester("");
	}

	public PQTester(String list)
	{
		pQueue = new Queue<String>();
		add(list);
	}

	public void add(String list){
		String[] listy = list.split(" ");
		for(String s : listy){
			pQueue.add(s);
		}
	}
	public void remove(){
		pQueue.remove(0);
	}

	public void setPQ(String list)
	{
	}
	
	public Object getMin()
	{
		return pQueue.get(0);
	}
	
	public String getNaturalOrder()
	{
		String output="";
		return output;		
	}

	public String toString(){
		return pQueue.toString();
	}
	//write a toString method
}
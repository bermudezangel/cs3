//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	out.println(list.toString());
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int size = 0;
		while(list.getNext() != null){
			list = list.getNext();
			size++;
		}
		return size;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode node = new ListNode();
		node.setValue(list.getValue());

		while(list.getNext() != null){
			list = list.getNext();
		}

		list.setNext(node);

	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
   	 ListNode prev = null;
	 while(list.getNext() != null){
		list = list.getNext();
	 }
	 prev.setValue(list.getValue());
	 
	 list.setNext(prev);

	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
	}

	//this method will set the value of every xth node in the list
	public static void setEveryXthNode(ListNode list, int x, Comparable value)
	{
		int count=1;
	}	

	//this method will remove every xth node in the list
   //Assume x > 1
	public static void removeEveryXthNode(ListNode list, int x)
	{
		int count=1;
	}		
}
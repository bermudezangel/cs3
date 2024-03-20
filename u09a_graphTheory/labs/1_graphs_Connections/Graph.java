//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Map;
import java.util.TreeMap;

public class Graph
{
   //Choose:
	private Map<String, String> map;
   //private Map<String, List<String>> map;
   
	public Graph(String line)
	{
      map = new TreeMap<String, String>();
      for (String s : line.split(" ")){
         map.put(s.substring(0, 1), s.substring(1));
         map.put(s.substring(1), s.substring(0, 1));
         
         
	}

	public boolean contains(String letter)
	{
	   return true;
	}

   public boolean connected(String src, String dest)
	{
	}

   private boolean connected(String src, String dest, String placesUsed)
   { 
   }
   
   @Override
	public String toString()
	{
		return "";
	}
}
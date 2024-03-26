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
	private Map<String, Set<String>> map;
   //private Map<String, List<String>> map;
   
	public Graph(String line)
	{
      String silly = "";
      String silly2 = "";
      map = new TreeMap<String, Set<String>>();
      for (String s : line.split(" ")){
         silly = s.substring(0, 1);
         silly2 = s.substring(1);
         if (map.get(silly) == null){
            map.put(silly, new HashSet<String>());
         }
         if (map.get(silly2) == null){
            map.put(silly2, new HashSet<String>());   
         }
         map.get(silly).add(silly2);
         map.get(silly2).add(silly);
      }
	}

	public boolean contains(String letter)
	{
      if (
	}

   public boolean connected(String src, String dest)
	{
   String place = "";
    if (map.containsKey(){
      return true;
    }else{
      for (String s : map.get(src){
          place += s + ", ";
          connected(s, 
         
	}

   private boolean connected(String src, String dest, String placesUsed)
   { 
      return false;
   }
   
   @Override
	public String toString()
	{
		return "";
	}
}
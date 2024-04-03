//� A+ Computer Science  -  www.apluscompsci.com
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
      if (map.keySet().contains(letter)){
         return true;
      }
      return false;
	}

   public boolean connected(String src, String dest)
	{
   String place = "";
    if (map.get(src).contains(dest)){
      return true;
    }else{
      for (String s : map.get(src)){
          place += s + ", ";
          connected(s, dest, place);
      }
    }
   }
   private boolean connected(String src, String dest, String placesUsed)
   { 
    Set<String> placey = new HashSet<String>();
    for (String s : placesUsed.split(", ")){
      placey.add(s);
    }
    String place = "";
    if (map.get(src).contains(dest)){
      return true;
    }else{
      for (String s : map.get(src)){
         if (placey.contains(s)){
             place += s + ", ";
             connected(s, dest, place);
         }
       }
      }
    }  
   
   @Override
	public String toString()
	{
		return "";
	}
}
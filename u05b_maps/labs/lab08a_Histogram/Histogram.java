//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
      histogram = new TreeMap<String, Integer>();
	}

	public Histogram(String sent)
	{
      createHistogram(sent);
	}
	
	public void createHistogram(sent)
	{
	  histogram = new TreeMap<String, Integer>();
	  for (String s : (sent.split(" "))){
		if (histogram.containsKey(s) == false){
			histogram.put((s.charAt(0)), 1)
		}else{
			histogram.put((s.charAt(0)), histogram.getKey(s) + 1);
		}
	  }
	}

	public String toString()
	{
		String output="";
		for (String s : histogram.keySet()){
			output += "         111111" + "\n" + "char    " + "123456789012345" 
		}
		String allStars="";
		return output+"\n\n";
	}
}
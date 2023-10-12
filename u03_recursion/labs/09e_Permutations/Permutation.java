//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class Permutation
{
	private String orig;
	private String list;

	public Permutation(String word)
	{
		orig=word;
		list="";
	}

   public void permutation()
   {
   	out.println("\nPERMUTATION OF WORD :: "+orig);
   	permutation(orig, "");
   }

	private void permutation(String orig, String sent)
	{
		if(orig.length() == sent.length())
		{
			list += sent + "\n";
		}
		else{
			for(int i = 0; i < orig.length(); i++){
				if (!sent.contains(orig.substring(i, i+1))){
					permutation(orig, sent + orig.charAt(i));
				}
			}
		}
	}

   public String toString()
   {
   	return list;
   }
}
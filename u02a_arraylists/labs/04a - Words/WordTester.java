//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		Word test = new Word("chicken");
      out.println(test);
      out.println("num vowels == " +test.getNumVowels());
      out.println("num chars == " + test.getLength() + "\n");
		
      test = new Word("alligator");
      out.println(test);
      out.println("num vowels == " +test.getNumVowels());
      out.println("num chars == " + test.getLength() + "\n");
      
      test = new Word("elephant");
      out.println(test);
      out.println("num vowels == " +test.getNumVowels());
      out.println("num chars == " + test.getLength() + "\n");
		
		
	}
}
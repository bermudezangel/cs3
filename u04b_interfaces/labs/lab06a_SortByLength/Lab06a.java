//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06a
{
	public static void main( String args[] ) throws IOException
	{
		Scanner data = new Scanner(new File("lab06a.dat"));
		ArrayList<Word> words = new ArrayList<Word>();
		while(data.hasNext()){
			words.add(new Word(data.next()));
		}
		Collections.sort(words);
		for(Word word : words){
			out.println(word);
		}
		
	}
}
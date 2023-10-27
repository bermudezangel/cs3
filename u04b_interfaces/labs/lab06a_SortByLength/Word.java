//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String str;

	public Word(String s){
		str = s;
	}
	public int getLength(){
		return str.length();
	}

	public int compareTo(Word other){
		if (this.getLength() > other.getLength())
			return 1;
		if (this.getLength() < other.getLength())
			return -1;
		return 0;
	}

	public String toString(){
		return str;
	}
	//add an instance variable and a constructor

	//add a compareTo

	//add a toString
}
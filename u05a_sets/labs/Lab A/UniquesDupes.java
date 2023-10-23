//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();

		for (String letter : input.split(" ")){
				uniques.add(letter);
		}
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		Set<String> uniques = new TreeSet<String>();
		for (String letter : input.split(" ")){
			if (uniques.add(letter) == false)
				dupes.add(letter);
		}
		return dupes;
	}
}
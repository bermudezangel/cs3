
//  Linear Sort

package lesson;

import static java.lang.System.*;
import java.util.*;

public class Linear{
	public static void main (String[] args){
		new Environment();
}}


class Environment
{
	int[] list = {75, -3, 99, 25, 52, 83, 12, 7, 38};
	int swaps;
	int passes;
	int comparisons;

	public Environment()
	{
		run();
	}

	public void run()
	{
		out.println( Arrays.toString(list) );
		sort();
		out.println( this );
	}

	public void sort()
	{
      	for (int x=0; x< list.length-1 ; x++)
      	{
      		passes++;
        	for (int y= (x+1) ; y< list.length ; y++)
        	{
        		comparisons++;
        		if( list[x] > list[y])
        		{
        			swaps++;
        			int temp = list[x];
        			list[x] = list[y];
        			list[y] = temp;
        		}

        	}
        }
	}


	public String toString()
	{
		String temp = "\n" + Arrays.toString(list) + "\n\n";
		temp += "LINEAR SORT:\n";
		temp += "Swaps: " + swaps + "\n";
		temp += "Passes: " + passes + "\n";
		temp += "Comparisons: " + comparisons + "\n";
		return temp;
	}
}


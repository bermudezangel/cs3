//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
      String curr = "";
      String vertices = "";
		for(int x=0; x<howManyTimes; x++)
		{
			curr = file.nextLine();
         vertices = file.nextLine();
         Graph silly = new Graph(curr);
         System.out.println(vertices.substring(0, 1) + " is connected to " + vertices.substring(1) + " == " + silly.connected(vertices.substring(0,1), vertices.substring(1)));
       
		}
	}
}
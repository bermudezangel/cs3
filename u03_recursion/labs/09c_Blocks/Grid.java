//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;

	public Grid()
	{
      String[] s = new String[];
      setGrid(0, 0, s);
	}

	public Grid(int rows, int cols, String[] vals)
	{
      setGrid(rows, cols, vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	   grid = new String[rows][cols];
      for (String[] s : grid){
         for (int i = 0; i < s.length; i++){
            s[i]
	}

	public int findMax(String val)
	{
		int count=-1;
		return count;
	}

	private int findCount(int r, int c, String search)
	{
		return 0;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
	private Cell[][] grid;
	
	public Grid()
	{
		setSize(0,0);
	}

	public Grid(int rows, int cols)
	{
      setSize(rows, cols);

	}

	public void setSize(int rows, int cols)
	{
      grid = new Cell[rows][cols];	
   }

	public void setSpot(int row,int col, Cell val)
	{
      grid[row][col] = val;

	}
	
	public Cell getSpot(int row, int col)
	{
		return grid[row][col];
	}
	
	public int getNumRows()
	{
		return grid.length;
	}
	
	public int getNumCols()
	{
		return grid[0].length;
	}

	public boolean drawGrid(Graphics window)
	{
		boolean full=true;
      Cell currCell = null;
      for(int r = 0; r < grid.length; r++){
         for(int c = 0; c < grid[r].length; c++){
            currCell = grid[r][c];
            if (currCell != null){
               currCell.draw(window);
            }
            else{
               full = false;
            }
         }
      }
      return full;
	}
	
	public String toString()
	{
		String output="";
      output += "" + getNumRows()  + "\n" + getNumCols();
      for (Cell[] cellular : grid){
         for (Cell c : cellular){
             output += c.toString() + "\n";
         }
      }
		return output;
	}
}
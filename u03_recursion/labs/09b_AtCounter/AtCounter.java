//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;


	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}
   
   public void countAts(int r, int c){
      char[][] backup = atMat;
      atCount = countAtsRecur(r, c);
      atMat = backup;
   }
	public int countAtsRecur(int r, int c)
   {
      int atC = 0;
      if (r < atMat.length && c < atMat[r].length && r >= 0 && c >= 0){
         if (atMat[r][c] == '@'){
           atMat[r][c] = ' ';
           atC = 1 + countAtsRecur(r-1, c);
                     countAtsRecur(r, c-1);
                     countAtsRecur(r+1, c);
                     countAtsRecur(r, c+1);
          }
      else
         return 0;
      }
      
      return atC;
	}

	public String toString()
	{
		String output="";
		output+= atCount+ "@s connected.";
		return output;
	}
}
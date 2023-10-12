//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class Lab09e
{
   public static void main( String args[] )
   {
        String word = "ABC";
	    Permutation perm = new Permutation(word);
        perm.permutation();
        out.println("\n" + perm);  

        word = "abc";
	    perm = new Permutation(word);
        perm.permutation();
        out.println("\n" + perm); 

        word = "boat";
	    perm = new Permutation(word);
        perm.permutation();
        out.println("\n" + perm); 

        word = "it";
	    perm = new Permutation(word);
        perm.permutation();
        out.println("\n" + perm); 
	}
}
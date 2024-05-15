import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections.*;
import java.util.ArrayList;

public class SelectionSort
{
   private String[] sorty;
   
   public SelectionSort(String changeToArray){
      sorty = changeToArray.split(" ");
   }
   
   public String currState(){
      return sorty.toString();
   }
   
   public String sort(){
      String procedure = "";
      for (int i = 0; i < sorty.length; i++){
        int currMinimum = i;
        procedure += (printArray(sorty) + "\n");
         for (int r = i + 1; r < sorty.length; r++){
            if (sorty[r].compareTo(sorty[currMinimum]) < 0){
               currMinimum = r;
            }
         }
         String temp = sorty[i];
         sorty[i] = sorty[currMinimum];
         sorty[currMinimum] = temp;
      }
      return procedure;
   }
   public String printArray(String[] a){
      String currArray = "";
      (String s : a){
         currArray = currArray + (a + " ");
      }
   }
   public String toString(){
      String[] original = sorty;
      sort();
      return "original array: " + original.toString() + "\n\nsorting procedure: " + sort() + "\n\nfinalized array: " + sorty.toString();

   }
}
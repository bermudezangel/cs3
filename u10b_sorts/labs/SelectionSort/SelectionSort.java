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
   
   private String sort(){
      String procedure = "";
      for (int i = 0; i < sorty.length - 1; i++){
        int currMinimum = i;
        procedure += (printArray(sorty) + "\n");
         for (int r = i + 1; r < sorty.length; r++){
            if (sorty[r].compareTo(sorty[currMinimum]) < 0){
               currMinimum = r;
            }
         }
         String temp = sorty[currMinimum];
         sorty[currMinimum] = sorty[i];
         sorty[i] = temp;
      }
      return procedure;
   }
   private String printArray(String[] a){
      String currArray = "";
      for (String s : a){
         currArray = currArray + (s + " ");
      }
      return currArray;
   }
   public String toString(){
      String[] original = new String[sorty.length];
      for(int i = 0; i < sorty.length; i++){
         original[i] = sorty[i];
      }
      return "original array: " + printArray(original) + "\n\nsorting procedure: " + sort() + "\n\nfinalized array: " + printArray(sorty);

   }
}
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections.*;
import java.util.ArrayList;

public class MergeSort {
    private ArrayList<String> sorty;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public MergeSort(ArrayList<String> user){
        sorty = user;
    }
    public void sort(ArrayList<String> input){
        sort(input, 0, input.size() - 1);
    }
    public void sort(ArrayList<String> input, int from, int to){
        mergeSort(input, from, to-1);
    }
    public void mergeSort(ArrayList<String> input, int from, int to){
        int mid = 0;
        if (from < to){
            mid = from + (to - from)/2;
            mergeSort(input, from, mid);
            mergeSort(input, mid+1, to);
            merge(input, from, mid, to);
        }
    }
    public void merge(ArrayList<String> input, int from, int mid, int to){
        int sub1 = mid - from + 1;
        int sub2 = to - mid;

        ArrayList<String> left = new ArrayList<String>(), right = new ArrayList<String>();
        for (int i = 0; i < sub1; i++){
            left.add(input.get(from + i));
        }
        for (int j = 0; j < sub2; j++){
            right.add(input.get(mid + 1 + j));
        }
        int i = 0, j = 0;
        int indexOfSubarray = from;
        while (i < sub1 && j < sub2){
            if (left.get(i).compareTo(right.get(j)) <= 0){
                input.set(indexOfSubarray, left.get(i));
                i++;
            }
            else{
                input.set(indexOfSubarray, right.get(j));
                j++;
            }
            indexOfSubarray++;
        }

        while (i < sub1){
            input.set(indexOfSubarray, left.get(i));
            i++;
            indexOfSubarray++;
        }
        while (j < sub2){
            input.set(indexOfSubarray, right.get(j));
            j++;
            indexOfSubarray++;
        }
    }
    private String printArray(ArrayList<String> a){
        String currArray = "";
        for (String s : a){
           currArray = currArray + (s + " ");
        }
        return currArray;
     }
     public String toString(){
        ArrayList<String> original = new ArrayList<String>();
        for(int i = 0; i < sorty.size(); i++){
           original.add(i, sorty.get(i));
        }
        sort(sorty);
        return "original array: " + printArray(original) + "\n\nfinalized array: " + printArray(sorty);
  
     }
}

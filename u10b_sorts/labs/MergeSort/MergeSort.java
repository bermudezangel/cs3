import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections.*;
import java.util.ArrayList;

public class MergeSort {
    private ArrayList<String> sorty;

    public MergeSort(String changeToList){
        String temp[] = changeToList.split("");
        sorty = Arrays.asList(temp);
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
            mid = (from + to)/2;
            mergeSort(input, from, mid);
            mergeSort(input, mid+1, to);
            merge(input, from, mid, to);
        }
    }
    public void merge(ArrayList<String> input, int from, int mid, int to){
        int sub1 = (mid - from) + 1;
        int sub2 = (to - mid);

        ArrayList<String> left = new ArrayList<String>(), right = new ArrayList<String>();
    
        for (int i = 0; i < sub1; i++){
            left.add(input.get(from + i));
        }
        for (int j = 0; j < sub2; j++){
            right.add(input.get(mid + 1 + j));
        }
        i = 0; j = 0;
        
        int indexMerged = from;


    }
}

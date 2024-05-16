import java.io.*;
import java.util.ArrayList;
public class MergeMain{
    public static void main(String args[]){
        ArrayList<String> toSort = new ArrayList<String>();
        String toSplit = "cd ab ch ui th aj mn lb xd qr je";
        for(String s : toSplit.split(" ")){
            toSort.add(s);
        }
        MergeSort sorting = new MergeSort(toSort);
        System.out.println(sorting);
    }
}
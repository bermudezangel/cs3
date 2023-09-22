//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Arrays;

class Words
{
   private ArrayList<Word> words;

   public Words()
   {
      setWords("");
   }

   public Words(String wordList)
   {
      setWords(wordList);
   }

   public void setWords(String wordList)
   {
      words = new ArrayList<Word>();
      String[] list = wordList.split(" ");
      for (String s : list){
         words.add(new Word(s));
      }
   }
	
   public int countWordsWithXChars(int size)
   {
      int count=0;
      for (Word word : words){
         if(word.getLength() == size)
            count++;
      }
      return count;
   }
	
   public void removeWordsWithXChars(int size)
   {
      int i = 0;
      while (i < words.size()){
         if (words.get(i).getLength() == size){
            words.remove(i);
         }else{
            i++;
         }
      }
   }
  
   public int countWordsWithXVowels(int numVowels)
   {
      int count=0;
      for (Word w : words){
         if(w.getNumVowels() == numVowels)
            count++;
      }
      return count;
   }
	
   public String toString()
   {
      return words.toString() + "\n" ;
   }
}
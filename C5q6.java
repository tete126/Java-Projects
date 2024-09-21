import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C5q6 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
   for(int i = 0; i < 5; i++)
    {
       String line = input.nextLine();
       String [] arr = line.split("\\s+");
      int count = 0;
       for(int j = 0; j < arr.length; j++)
         {
           if(numOfLetters(arr[j]) > 3)
           {
             count++;
           }
         }
      System.out.println(count);
    }

    
  }

  public static int numOfLetters(String str)
  {
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    int count = 0;
    for(int i = 0; i < str.length(); i++)
      {
        if(alphabet.indexOf(str.charAt(i)) != -1)
        {
          count++;
        }
        else
        {
          break;
        }
      }

    return count;
  }
}

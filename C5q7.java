import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C5q7 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    String str = input.nextLine();
    String  alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int maxCount = 1;
    int currCount = 1;
    for(int i = 0; i < str.length(); i++)
      {
        int index = alphabet.indexOf(str.charAt(i));
        //System.out.println("index: " + index);
        for(int j = i + 1; j <= str.length(); j++)
          {
            if(str.substring(i, j).equals(alphabet.substring(index, index + (j - i))))
            {
              System.out.println(str.substring(i, j) +  " " + alphabet.substring(index, index + (j - i)));
              currCount++;
              if(currCount > maxCount)
              {
                System.out.println("curr: " + currCount + " max: " + maxCount);
                maxCount = currCount;
              }
            }
            else
            {
              currCount = 1;   
              break;
            }
          }
      }

    System.out.println(maxCount);
  
  }
}

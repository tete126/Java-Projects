import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C7q7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();
    input.nextLine();
    String line = input.nextLine();
    String [] words = line.split("\\s+");

    //System.out.println(Arrays.toString(words));

    int count = 0;
    String format = "";
    //  5    2   4   2   6     3   4   2   2  5
    //hello my name is Bessie and this is my essay
    for(int i = 0; i < words.length; i++)
      {
          count += words[i].length();
          if(count <= k)
          {
            format += words[i] + " ";
            if(i == words.length - 1)
            {
              System.out.println(format);
            }
          }
          else
          {
            System.out.println(format.substring(0, format.length() - 1));
            format = words[i] + " ";
            if(i < words.length - 1)
            {
              count = words[i].length();
            }
            else
            {
              System.out.println(words[i]);
            }
          }
        }
      }
    
  }


import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C5q4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    int len = 0;
    for(int i = 0; i < str.length(); i++)
      {
        for(int j = i + 1; j <= str.length(); j++)
          {
            String currStr = str.substring(i, j);
            if(isPalindrome(currStr))
            {
              if(currStr.length() > len)
              {
                len = currStr.length();
              }
            }
          }
      }

    System.out.println(len);
   
    
  }

  public static boolean isPalindrome(String str)
  {
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    sb.reverse();
    String reverse = sb.toString();

    return str.equals(reverse);
    
  }
}

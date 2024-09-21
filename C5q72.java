import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C5q72 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    String str = input.nextLine();

    ArrayList<Integer> appearsAgain = new ArrayList<Integer>();
    ArrayList<Integer> appearsOnce = new ArrayList<Integer>();
    
    for(int i = 0; i < str.length(); i++)
      {
        for(int j = i + 1; j <= str.length(); j++)
          {
            if(appearsAgain(str.substring(i, j), str))
            {
              appearsAgain.add(str.substring(i, j).length());
            }
            else
            {
              appearsOnce.add(str.substring(i, j).length());
            }
          }
      }

    Collections.sort(appearsAgain);
    Collections.sort(appearsOnce);



    int count = 0;
    for(int i = 0; i < appearsOnce.size(); i++)
      {
        for(int j = 0; j < appearsAgain.size(); j++)
          {
            if(appearsOnce.get(i) == appearsAgain.get(j)) count++;
          }
        if(count == 0)
        {
          System.out.println(appearsOnce.get(i));
          break;
        }
        count = 0;
      }
   
  }

  public static boolean appearsAgain(String sub, String str)
  {
    String temp = str;
    int index = temp.indexOf(sub);
    temp = temp.substring(index + 1);
    index = temp.indexOf(sub);

    if(index >= 0) return true;
    else return false;

  }

}


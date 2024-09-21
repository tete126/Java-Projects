import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C7q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    char [] arr = str.toCharArray();
    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.sort(arr);

    int count = 1;
    
    for(int i = 0; i < arr.length - 1; i++)
      {
        if(arr[i] == arr[i + 1])
        {
          count++;
        }
        else
        {
          list.add(count);
          count = 1;
        }
        if(i == arr.length - 2)
        {
          if(arr[i] != arr[i + 1])
          {
            list.add(1);
          }
          if(count != 1)
          {
            list.add(count);
          }
        }
        
      }

      
    Collections.sort(list);
    
    int result = 0;
    while(list.size() > 2)
      {
        result += list.remove(0);    
      }

    System.out.println(result);

  }
}

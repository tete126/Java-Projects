import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C5q8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0; i < n; i++)
      {
        arr[i] = input.nextInt();
      }

      int replace = 0;


     int count = 0;
      for(int i = 0; i < arr.length - 1; i++)
        {
          if(arr[i] == 0)
          {
            replace =  arr[i + 1];
            count++;
          }
         if(count == 1) break;
        }


      for(int i = 0; i < arr.length; i++)
        {
          if(arr[i] == 0)
          {
            arr[i] = replace;
          }
        }

      int [] temp2 = Arrays.copyOf(arr, n);
      Arrays.sort(temp2);

      if(Arrays.equals(arr, temp2)) System.out.println("YES");
      else System.out.println("NO");


  }

}

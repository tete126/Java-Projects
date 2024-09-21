import java.io.*;
import java.util.Scanner;

public class C3q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    String [] arr = new String[t];
    
    for(int i = 0; i < t; i++)
      {
        int n = input.nextInt();
        if(n > 360)
          {
            n = n % 360;
          }
        if(n >= 0 && n <= 45 || n >= 315 && n <= 360)
        {
          arr[i] = "N";
        }
        else if(n > 45 && n <= 135)
        {
          arr[i] = "E";
        }
        else if(n > 135 && n <= 225)
        {
          arr[i] = "S";
        }
        else if (n > 225 || n < 315)
        {
          arr[i] = "W";
        } 
        }

    for(int i = 0; i < t; i++)
      {
        System.out.println(arr[i]);
      }
      }
  }

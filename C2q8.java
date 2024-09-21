import java.util.*;
import java.io.*;

public class C2q8 {
  public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int m = Integer.parseInt(br.readLine());

    int n = Integer.parseInt(br.readLine());

    int [][] arr = new int[m][n];

    int count = 0;
    for(int k = Integer.parseInt(br.readLine()); k > 0; k--)
    {
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      String rc = st.nextToken();
      int num = Integer.parseInt(st.nextToken()) - 1;
      if(rc.equals("R"))
      {
        for(int c = 0; c < arr[0].length; c++)
        {
          if(arr[num][c] == 0)
          {
            arr[num][c] = 1;
            count++;
          }
          else
          {
            arr[num][c] = 0;
            count--;
          }
        }
      }
      else
      {
        for(int r = 0; r < arr.length; r++)
          {
            if(arr[r][num] == 0)
            {
              arr[r][num] = 1;
              count++;
            }
            else
            {
              arr[r][num] = 0;
              count--;
            }
          }
      }
    }
      System.out.println(count);
      
    
  }
}



//import java.util.Scanner;
//import java.util.Arrays;
import java.util.*;
import java.io.*;

public class C3q7 {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine().trim());
    
    long n = Long.parseLong(st.nextToken());
    long [] arr = new long[(int)n];

    st = new StringTokenizer(br.readLine().trim());
    for(int i = 0; i < n; i++)
      {
        arr[i] = Long.parseLong(st.nextToken());
      }

    Arrays.sort(arr);
    long maxAmount = 0;
    long minIndex = arr.length - 1;

    long count = 0;
    long currAmount = 0;

    for(int i = 0; i < arr.length; i++)
      {
        for(int j = 0; j < arr.length; j++)
          {
            if(arr[j] >= arr[i])
            {
              count++;
            }
          }

        currAmount = count * arr[i];
        if(currAmount > maxAmount)
        {
          maxAmount = currAmount;
          minIndex = i;
        }
        if(currAmount == maxAmount)
        {
          if(arr[i] < arr[(int)minIndex])
          {
            minIndex = i;
          }
        }

        count = 0;
        
      }

    System.out.println(maxAmount + " " + arr[(int)minIndex]);
    
}
}

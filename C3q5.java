import java.util.*;
import java.io.*;

public class C3q5 {
  public static void main(String[] args) throws IOException{
 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine().trim());

    int n = Integer.parseInt(st.nextToken());
    int [] ff = new int[n];
    int [] rf = new int[n];

     st = new StringTokenizer(br.readLine().trim());
    for(int i = 0; i < n; i++)
      {
        ff[i] = Integer.parseInt(st.nextToken());
      }

    st = new StringTokenizer(br.readLine().trim());
    for(int i = 0; i < n; i++)
      {
        rf[i] = Integer.parseInt(st.nextToken());
      }

    int [] arr = new int[n];

    for(int i = 0; i < ff.length; i++)
      {
        arr[i] = rf[i] - ff[i];;
      }
      
    Arrays.sort(arr);
    //System.out.println(Arrays.toString(arr));
    int maxCount = 0;
    int currCount = 1;
    
    for(int i = 0; i < arr.length - 1; i++)
      {
        if(arr[i] == arr[i + 1])
          {
            currCount++;
          }
        else
        {
          currCount = 1;
        }
         if(currCount > maxCount)
         {
           maxCount = currCount;
        }
              
      }
        
    if(arr.length == 1) maxCount = 1;

    System.out.println(maxCount);
    
  }
}

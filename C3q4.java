import java.util.Scanner;
import java.util.Arrays;

public class C3q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String [][] arr = new String[n*2][n*2];
    int r = n-1;
    int c = 0;

    String pitch = input.next();
    char [] chars = new char[pitch.length()];
  
    for(int i = 0; i < pitch.length(); i++)
      {
        chars[i] = pitch.charAt(i);        
      }

    
    for(int i = 0; i < arr.length; i++)
      {
        for(int j = 0; j < arr[0].length; j++)
          {
            arr[i][j] = ".";
          }
      }

   
    for(int i = 0; i < chars.length; i++)
    {
      if(chars[i] == '^')
      {
        arr[r][c] = "/";
        
          c++;
          r--;

      }
      else if(chars[i] == 'v')
      {
        r++;
        arr[r][c] = "\\";
        c++;
     }
      
     else 
      {
        arr[r][c] = "_";
        c++;
      }
        
      }  
 

    for(int i = 0; i < arr.length; i++)
    {
       if(Arrays.asList(arr[i]).contains("/") || Arrays.asList(arr[i]).contains("\\") || Arrays.asList(arr[i]).contains("_")) 
       {
         for(int j = 0; j < n; j++)
           {
             System.out.print(arr[i][j]);
           }

         System.out.println();
       }
      
    }
   
    
  }

}

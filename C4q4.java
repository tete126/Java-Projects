import java.util.Scanner;
import java.util.Arrays;

public class C4q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    int c = input.nextInt();
    input.nextLine();
    String [][] arr1 = new String[r][c];
   
    for(int i = 0; i < r; i++)
      {
        String line = input.nextLine();
        for(int j = 0; j < line.length(); j++)
          {
            arr1[i][j] = line.substring(j, j + 1);
          }
      
      }


     String [][] arr2 = new String[r][c];
    for(int i = 0; i < r; i++)
      {
        for(int j = 0; j < c; j++)
          {
            arr2[i][j] = ".";
          }
      }

    for(int i = 0; i < r; i++)
      {
        for(int j = 0; j < c; j++)
          {
            if(arr1[i][j].equals("#"))
            {
              arr2[i][j] = "#";
              arr2[i][j+1] = "#";
              arr2[i+1][j+1] = "#";
              arr2[i+1][j] = "#";
            }
          }
      }

    for(int i = 0; i < r; i++)
      {
        for(int j = 0; j < c; j++)
        {
          System.out.print(arr2[i][j]);
        }
        System.out.println();
      }
    
  }
}

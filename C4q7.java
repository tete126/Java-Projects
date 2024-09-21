import java.util.Scanner;

public class C4q7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    int [][] arr = new int[n][m];
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < m; j++)
      {
        arr[i][j] = input.nextInt();
      }
    }

    //0 0 9 0
    //6 0 0 40

    for(int r = 0; r < n; r++)
      {
        for(int c = 0; c < m; c++)
          {
            if(arr[r][c] == 0)
            {
              if(r == 0)
              {
                arr[r][c] = (int)(Math.random() * (arr[r][c + 1])) + 1;
              }
              if(c == 0)
              {
                
              }
              arr[r][c] = (int)(Math.random() * (arr[r][c + 1] - arr[r][c - 1] + 1)) + arr[r][c - 1];
            }
          }
      }
  }

}

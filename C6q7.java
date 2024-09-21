import java.util.Scanner;
import java.util.Arrays;

public class C6q7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    
    char [][] arr2D = new char[n][n];

    for(int i = 0; i < n; i++)
      {
        String str = input.nextLine();
        char [] temp = str.toCharArray();
        
        for(int j = 0; j < temp.length; j++)
          {
            if(temp[j] < '0' || temp[j] > '9')
            {
              temp[j] = (char)((temp[j] - 'A') + 10 + '0');
            }
          }

        arr2D[i] = temp;
      }

 
    boolean latin = true;
    boolean reduced = false;
    
    for(int i = 0; i < n; i++)
      {
        if(!isUniqueRow(arr2D[i]) || !isUniqueCol(arr2D, i))
        {
          latin = false;
        }
      }

    if(isReduced(arr2D)) reduced = true;

    if(latin && reduced) System.out.println("Reduced");
    else if (latin && !reduced) System.out.println("Latin");
    else System.out.println("No");
  }

 public static boolean isUniqueRow(char [] row)
  {
    char [] temp = row.clone();
    Arrays.sort(temp);

    for(int i = 0; i < temp.length - 1; i++)
      {
        if(temp[i] == temp[i + 1]) return false;
      }

    return true;
  }

  public static boolean isUniqueCol(char [][] arr2D, int col)
    {
      char [] colArr = new char[arr2D[0].length];

      for(int i = 0; i < arr2D.length; i++)
        {
          colArr[i] = arr2D[i][col];
        }

      Arrays.sort(colArr);
      for(int i = 0; i < colArr.length - 1; i++)
        {
          if(colArr[i] == colArr[i + 1]) return false;
        }

      return true;
    }

  public static boolean isReduced(char [][] arr2D)
  {
    char [] topRow = arr2D[0];
    char [] temp = topRow.clone();
    Arrays.sort(temp);
    
    char [] leftCol = new char[arr2D.length];

    for(int i = 0; i < arr2D.length; i++)
      {
        leftCol[i] = arr2D[i][0];
      }

    char [] temp2 = leftCol.clone();
    Arrays.sort(temp2);

    return Arrays.equals(topRow, temp) && Arrays.equals(leftCol, temp2);
    
  }

}

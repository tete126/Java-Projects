import java.util.Scanner;
import java.util.ArrayList;

public class MagicSquare
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[][] arr = new int[4][4];

    for(int i = 0; i < arr.length; i++)
    {
        for(int j = 0; j < arr[i].length; j++)
        {
        arr[i][j] = input.nextInt();
        }
    }

    System.out.println(sumRow(arr, 1));
    System.out.println(unique(arr));
    System.out.println(sumCol(arr, 1));
    System.out.println(diagSumsAre(arr, 34));
    if (isMagicSquare(arr))
    {
        System.out.println("magic");
    }
    else
    {
        System.out.println("not magic");
    }
  }

  private static int sumRow(int[][] array, int row)
  { 
    int sum = 0; 
    for (int i = 0; i < array[row].length; i++) 
    {
      sum += array[row][i];
    }
    return sum;
  }

  private static boolean unique(int[][] square)
  { 
     ArrayList<Integer> list = new ArrayList<Integer>();

     int x = 0;


     for(int i = 0; i < square.length; i++)
     {
        for(int j = 0; j < square[i].length; j++)
         {
           x = square[i][j];
           list.add(x);
         } 
     }

     for(int i = 0; i < list.size(); i++)
     {
        if(list.get(i) < 1 || list.get(i) > square.length*square.length)
        {
            return false;
        }
     } 

    for(int i = 0; i < list.size(); i++)
    {
        for(int j = i + 1; j < list.size(); j++)
        {
            if(list.get(i) == list.get(j))
            {
                return false;
            }
        } 
    }
     return true;
  }   

 private static int sumCol(int[][] square, int col)
  {
    int sum = 0;

    for (int i = 0; i < square.length; i++) 
    {
      sum += square[i][col];
    }

    return sum;

  }

  private static boolean diagSumsAre(int[][] square, int sum)
  {
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < square.length; i++) 
    {
      sum1 += square[i][i];
      sum2 += square[i][square.length - 1 - i];
    }


    if (sum == sum1 && sum1 == sum2 && sum == sum2)
    {
        return true;
    }
    else
    {
        return false;
    }
  }

  static boolean isMagicSquare (int[][] square)
  {

    if (!unique(square))
    {
        return false;
    }

    for(int i = 0; i < square.length; i++)
    {
        for(int j = 0; j < square.length; j++)
        {
            if(sumRow(square, i) != sumCol(square, j))
            {
                return false;
            }
        } 
    }

    if (diagSumsAre(square, sumRow(square, 0)))
    {
        return true;
    }
    else
    {
        return false;
    }

  }
}

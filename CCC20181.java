import java.util.Scanner;

public class CCC20181 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i1 = input.nextInt();
    int i2 = input.nextInt();
    int i3 = input.nextInt();
    int i4 = input.nextInt();

    int[] arr = { i1, i2, i3, i4 };

    int sum = 0;

    for (int i = 0; i < 5; i++) 
    {
      for (int j = 0; j < 5; j++) 
      {
        System.out.print(sum(arr, i, j) + " ");

      }
      System.out.println();
    }
  }

  public static int sum(int[] arr, int cityIndex, int currIndex)
  {    int sum = 0;

    if(cityIndex > currIndex)
    {
      for(int i = currIndex; i < cityIndex; i++)
      {
        sum += arr[i];
      }
    }
    else
    {
      for(int i = cityIndex; i < currIndex; i++)
        {
          sum += arr[i];
        }
    }

    return sum;
  }

}

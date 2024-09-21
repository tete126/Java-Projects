import java.util.Scanner;
import java.util.Arrays;

public class C1q6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0; i < n; i++)
      {
        arr[i] = input.nextInt();
      }

    int [] temp = arr.clone();
    Arrays.sort(temp);
    int min = temp[0];
    int max = temp[temp.length - 1];
    int minIndex = 0;
    int maxIndex = 0;

    for(int i = 0; i < arr.length; i++)
      {
        if(arr[i] == min)
        {
          minIndex = i;
        }
        if(arr[i] == max)
        {
          maxIndex = i;
        }
      }

    boolean isIncreasing = true;

    for(int i = minIndex; i < maxIndex - 1; i++)
      {
        if(arr[i] > arr[i + 1])
        {
          isIncreasing = false;
          break;
        }
      }

    if(isIncreasing)
    {
      System.out.println(max - min);
    }
    else
    {
      System.out.println("unknown");
    }
    
  }

}

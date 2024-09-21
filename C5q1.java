import java.util.Scanner;
import java.text.DecimalFormat;

public class C5q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#0.00");
    int n = input.nextInt();
    double [] arr = new double[n];

    double max = Integer.MIN_VALUE;
    int maxIndex = -1;
    
    for(int i = 0; i < n; i++)
      {
        arr[i] = input.nextDouble();
        if(arr[i] > max)
        {
          max = arr[i];
          maxIndex = i;
        }
      }

    for(int i = 0; i < arr.length; i++)
      {
        if(arr[i] != max)
        {
          System.out.println(df.format(arr[i]));
        }
      }

    System.out.println(df.format(arr[maxIndex]));
  }

}

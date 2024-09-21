import java.util.Scanner;

public class C2q7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++)
      {
        arr[i] = input.nextInt();
      }

    int numAverage = n;
    int sum = 0;
    int count = 2;

    for(int i = 0; i < arr.length; i++)
      {
        sum = arr[i];
        for(int j = i + 1; j < arr.length; j++)
          {
            if(arr[i] <= arr[j] && arr[j] >= arr[j - 1])
            {
              sum += arr[j];
              if(sum % count == 0)
              {
                  numAverage++;
              }
              count++;
            }
          }
      }

    System.out.println(numAverage);
  }
}

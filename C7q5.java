import java.util.Scanner;
import java.util.ArrayList;

public class C7q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    
    for(int i = 0; i < n; i++)
      {
        int k = input.nextInt();
        if(k % 2 == 0)
        {
          even.add(k);
        }
        else
        {
          odd.add(k);
        }
      }

    int [] arr = new int[n];
    arr[0] = odd.get(0);
    int indexOdd = 1;
    for(int i = 1; i < arr.length; i++)
      {
        if(i < even.size())
        {
          arr[i] = even.get(i - 1);
        }
        else
        {
          arr[i] = odd.get(indexOdd);
          indexOdd++;
        }
      }

    

    
}

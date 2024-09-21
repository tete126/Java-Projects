import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class C7q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    String str = input.nextLine();
    ArrayList<Integer> list = new ArrayList<Integer>();

    char [] arr = str.toCharArray();
    Arrays.sort(arr);
   
    int count = 1;

    for(int i = 0; i < arr.length - 1; i++)
      {
        if(arr[i] != arr[i + 1])
        {
          list.add(count);
          count = 1;
        }
        else
        {
          count++;
        }
      }
    list.add(count);
    
    int numOfEven = 0;
    int numOfOdd = 0;

    for(int i = 0; i < list.size(); i++)
      {
      
        if(list.get(i) % 2 == 0)
        {
          numOfEven++;
        }
        else 
        {
          numOfOdd++;
        }

      }
     
    if(numOfEven != 0 && numOfOdd != 0)
    {
      System.out.println(numOfOdd);
    }
    else
    {
      if(numOfEven != 0 && numOfOdd == 0)
      {
        System.out.println(1);
      }
      else if(numOfEven == 0 && numOfOdd != 0)
      {
        System.out.println(numOfOdd);
      }
      else
      {
        System.out.println(0);
      }
    }
    
    
  }
}

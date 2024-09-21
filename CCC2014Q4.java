import java.util.Scanner;
import java.util.ArrayList;

public class CCC2014Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();
    int m = input.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> rounds = new ArrayList<Integer>();

    for(int i = 1; i <= k; i++)
      {
        list.add(i);
      }

    for(int i = 0; i < m; i++)
      {
        int x = input.nextInt();
        rounds.add(x);
      }

    for(int i = 0; i < m; i++)
      {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int r = rounds.get(i);
        for (int j = 0; j < list.size(); j++)
          {
            if ( (j+1)%r != 0 )
            {
              list2.add(list.get(j));
            }
          }
        list = list2;
      }
        
    System.out.println();
    for(int i = 0; i < list.size(); i++)
      {
        System.out.println(list.get(i));
      }

  }
}

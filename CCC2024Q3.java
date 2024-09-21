import java.util.Scanner;

import java.util.ArrayList;

public class CCC2024Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();


    ArrayList<Integer> list = new ArrayList<Integer>();

    int [] arr = new int[n];

    for(int i = 0; i < n; i++)
      {
        int a = input.nextInt();
        list.add(a);

        int count = 0;
        for(int j = 0; j < arr.length; j++)
          {
            if(arr[j] == a)
            {
              count++;
            }
          }

        if(count == 0)
        {
          arr[i] = a;
        }
      }

    /*for(int i = 0; i < arr.length; i++)
      {
        list.add(arr[i]);
      }

   for(int i = 0; i < list.size(); i++)
      {
        for(int j = 1; j < list.size(); j++)
          {
            if(list.get(i) == list.get(j))
            {
              list.remove(j);
            }
          }
      }

    int [] arr2 = new int[list.size()];

    for(int i = 0; i < list.size(); i++)
      {
        arr2[i] = list.get(i);
      }

*/
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr.length - 1; j++)
        {
          if(arr[j] > arr[j + 1])
          {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
    }

    /*for(int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }*/


    /*for(int i = 0; i < list.size(); i++)
      {

        System.out.println(list.get(i));

      }*/
    
    int count2 = 0;
    for(int i = 0; i < list.size(); i++)
      {
        if(arr[arr.length - 3] == list.get(i))
        {
          count2++;
        }
      }

    System.out.println(arr[arr.length - 3] + " " + count2);

    /*int x = 75;
    int c = 0;
    
        for(int j = 0; j <= 75; j++)
          {
            for(int i = 0; i < list.size(); i++)
              {
                if(list.get(i) == 75 - j)
                {
                  x = list.get(i);
                  c++;
                  
                  break;
                }

                if(c == 3)
                {
                  break;
                }        

          }
      }

    int count2 = 0;
    for(int i = 0; i < list.size(); i++)
      {
        if(list.get(i) == x)
        {
          count2++;
        }
      }

    System.out.println(x + " " + count2);*/
  }
}

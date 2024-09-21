import java.util.Scanner;
import java.util.ArrayList;

public class C4q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int k = input.nextInt();

    char smallest = 'z';

    for(int i = 0; i < str.length(); i++)
      {
        if(str.charAt(i) < smallest)
        {
          smallest = str.charAt(i);
        }
      }

    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < str.length(); i++)
      {
        char currChar = str.charAt(i);
        if(currChar == smallest && i + k <= str.length())
        {
          list.add(str.substring(i, i + k));
        }
      }

    if(list.size() == 1)
    {
      System.out.println(list.get(0));
    }
    else
    {

      String min = list.get(0);
      for(int i = 1; i < list.size(); i++)
        {
          String str1 = list.get(i);
          for(int j = 0; j < k; j++)
            {
              if(str1.charAt(j) < min.charAt(j))
              {
                min = str1;
              }
              else if(str1.charAt(j) > min.charAt(j))
              {
                break;
              }
            }
        }

      System.out.println(min);
    }
    
  }

}

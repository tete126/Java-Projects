import java.util.Scanner;
import java.util.ArrayList;

public class TestCCC2022Q3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int strLen = str.length();
    ArrayList<String> list = new ArrayList<String>();

    for (int i = 0; i < str.length() - 1; i++)
    {
      if(str.substring(i, i + 1).compareTo("0") >= 0 && str.substring(i, i + 1).compareTo("9") <= 0)
      {
        if(str.substring(i + 1, i + 2).compareTo("A") >= 0 && str.substring(i + 1, i + 2).compareTo("Z") <= 0)
        {
          list.add(str.substring(0, i + 1));
          str = str.substring(i + 1);
          i = 0;
        } 
      }
    }

    list.add(str);

   /* for(int i = 0; i < list.size(); i++)
      {
        System.out.println(list.get(i));
      }*/

    for(int i = 0; i < list.size(); i++)
      {
        for(int j = 0; j < list.get(i).length(); j++)
          {
            if(list.get(i).substring(j, j + 1).equals("+"))
            {
              String newStr = "";

              newStr = list.get(i).substring(0, list.get(i).indexOf("+")) + " tighten " + list.get(i).substring(list.get(i).indexOf("+") + 1);

              list.set(i, newStr);
            }
            else if(list.get(i).substring(j, j + 1).equals("-"))
            {
              String newStr = "";

              newStr = list.get(i).substring(0, list.get(i).indexOf("-")) + " loosen " + list.get(i).substring(list.get(i).indexOf("-") + 1);

              list.set(i, newStr);
            }
          }

      }

      System.out.println();

    for(int i = 0; i < list.size(); i++)
      {
        System.out.println(list.get(i));
      }

  }
}

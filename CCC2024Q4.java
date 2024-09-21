import java.util.Scanner;

import java.util.ArrayList;

public class CCC2024Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String n = input.next();
    String n2 = input.next();
    String str1 = "";
    String str2 = "";
    String str3 = " ";

    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();

    if(list.size() == list2.size())
    {
      for(int i = 0; i < n.length() - 1; i++)
        {
          list.add(n.substring(i, i + 1));
        }
      list.add(n.substring(n.length() - 1));

      for(int i = 0; i < n2.length() - 1; i++)
        {
          list2.add(n2.substring(i, i + 1));
        }
      list2.add(n2.substring(n2.length() - 1));


      int j = 0;
      for(int i = 0; i < list.size(); i++)
        {
              if(!list.get(i).equals(list2.get(j)))
              {
                str1 = list.get(i);
                str2 = list2.get(j);
                break;
              }
          j++;
            }

      str3 = "-";
    }
    

    if(list.size() != list2.size())
    {
      for(int i = 0; i < list.size(); i++)
        {
          int count = 0;
          for(int k = 1; k < list.size(); k++)
            {
              if(list.get(i) == list.get(k))
              {
                count++;
              }
            }
          int index = list.indexOf(list.get(i));
          if(list2.indexOf(index) == -1 && count == list.size() - list2.size())
          {
            str3 = list.get(index);
          }
          else
          {
            str3 = "-";
          }
        }

    }
      

    System.out.println(str1 + " " + str2);
    System.out.println(str3);
 

  }
}

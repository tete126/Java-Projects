import java.util.Scanner;
import java.util.ArrayList;

public class C4q21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    boolean stop = false;
    while(stop == false)
      {
        String str = input.nextLine();
        if(str.equals("quit!"))
          {
            break;
          }
        if(str.length() > 4)
        {
          int index = str.indexOf("or") - 1;
          if(str.charAt(index) != 'a' && 
             str.charAt(index) != 'e' &&               
             str.charAt(index) != 'i' && 
             str.charAt(index) != 'o' &&               
             str.charAt(index) != 'u' && 
             str.charAt(index) != 'y' &&
             index + 1 == str.length() - 2)
          {
            list.add(str.substring(0, index + 1) + "our");
          }
          else
          {
            list.add(str);
          }
            
        }
        else
        {
          list.add(str);
        }

      }

    for(int i = 0; i < list.size(); i++)
      {
        System.out.println(list.get(i));
      }
  }

}

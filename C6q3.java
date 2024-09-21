import java.util.Scanner;
public class C6q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();

    boolean even = false;
    for(int i = 0; i < word.length(); i++)
      for(int j = i + 1; j <= word.length(); j++)
        {
          String sub = word.substring(i, j);
          if(isPalindrome(sub) && sub.length() % 2 == 0)
          {
            even = true;
            break;
          }
        }

    if(even) System.out.println("Even");
    else System.out.println("Odd");
  }
public static boolean isPalindrome(String str)
  {
    String temp = "";
    for(int i = str.length() - 1; i >= 0; i--)
      {
        temp += str.charAt(i);
      }

    return temp.equals(str);
    
    
  }
}

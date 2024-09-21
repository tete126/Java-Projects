import java.util.Scanner;

public class C6q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    input.nextLine();
    
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String digits = "22233344455566677778889999";
    
    for(int i = 0; i < t; i++)
    {
      String temp = input.nextLine();
      String str = temp.replace("-", "");
      String format = "xxx-xxx-xxxx";
      String result = "";
      
      for(int j = 0; j < 10; j++)
      {
        char c = str.charAt(j);

        if(digits.indexOf(c) >= 0 || digits.indexOf(c) == -1 && alphabet.indexOf(c) == -1)
        {
          result += c;
        }
        else 
        {
          result += digits.charAt(alphabet.indexOf(c));
        }

        if(j == 2 || j == 5)
          {
            result += "-";
          }

      }

      System.out.println(result);
      
    }
  }

}

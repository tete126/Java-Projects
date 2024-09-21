import java.util.Scanner;

public class C4q41 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();
    input.nextLine();
    String str = input.nextLine();

    String alphabet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

    String newStr = "";
    for(int i = 0; i < str.length(); i++)
      {
        int value = 3 * (i + 1) + k;
        int shift = alphabet.indexOf(str.charAt(i)) + value;
        if(shift >= 26)
        {
          shift = shift % 26;
          newStr += alphabet.charAt(shift);
        }
        else
        {
          newStr += alphabet.charAt(shift);
        }

      }

   System.out.println(newStr);
    
  }

 
}

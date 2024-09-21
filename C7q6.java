import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C7q6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    char [] letters = new char[n];
    String [] seq = new String[n];

   
    for(int i = 0; i < n; i++)
      {
        letters[i] = input.next().charAt(0);
        seq[i] = input.nextLine();
      }

   //AABBE
    String code = input.nextLine();

    String result = "";
    while(code.length() > 0)
      {
        char c = matchedLetter(code, seq, letters);
        System.out.println("code: " + code + " match letter: " + c);
        
        result += c;

        if(seqLen(c, seq, letters) < code.length())
        {
          System.out.println(seqLen(c, seq, letters));
          code = code.substring(seqLen(c, seq, letters));
        }
        else
        {
          code = "";
          break;
        }
          
      }

    System.out.println(result);
    
  }

  public static char matchedLetter(String str, String [] seq, char [] letters)
  {
    char c = ' ';
    for(int i = 0; i < seq.length; i++)
      {
        if(str.startsWith(seq[i]))
        {
          c = letters[i];
        }
      }
    return c;
    
  }

  public static int seqLen(char letter, String [] seq, char [] letters)
  {
    int index = 0;
    for(int i = 0; i < letters.length; i++)
      {
        if(letters[i] == letter)
        {
          index = i;
          break;
        }
      }

    return seq[index].length();
  }
}

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C7q62 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    char [] letters = new char[n];
    String [] seq = new String[n];


    for(int i = 0; i < n; i++)
      {
        letters[i] = input.next().charAt(0);
        seq[i] = input.nextLine().trim();
      }

   //AABBE
    String code = input.nextLine();

    //System.out.println(Arrays.toString(letters) + " " + Arrays.toString(seq));

    String result = "";

    while(code.length() > 0)
      {
        char c = matchedLetter(code, seq, letters);
        //System.out.println("code: " + code + " match letter: " + c);

        result += c;

        if(seqLen(c, seq, letters) < code.length())
        {
          //System.out.println(seqLen(c, seq, letters));
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
    for(int i = 0; i < seq.length; i++)
      {
        //System.out.println("str: " + str + " seq[i]: " + seq[i]);
        //boolean b = str.substring(0, seq[i].length()).equals(seq[i]);
        //System.out.println("b: " + b);
        if(str.startsWith(seq[i]))
        {    
          return letters[i];
        }
      }
    return '-';

  }

  public static int seqLen(char letter, String [] seq, char [] letters)
  {
    int index = 0;
    
    for(int i = 0; i < letters.length; i++)
      {
        //System.out.println("letters[i]: " + letters[i] + " letter: " + letter + " i: " + i);
        if(letters[i] == letter)
        {
          index = i;
          break;
        }
      }

    return seq[index].length();
  }
}

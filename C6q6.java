import java.util.Scanner;

public class C6q6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();

    String vowels = "aeiou";
    
    for(int i = 0; i < n; i++)
      {
        String [] verse = new String[4];
        for(int j = 0; j < 4; j++)
          {
            verse[j] = input.nextLine();
          }

        if (endSyllable(verse[0]).equalsIgnoreCase(endSyllable(verse[1])) &&            endSyllable(verse[1]).equalsIgnoreCase(endSyllable(verse[2])) &&            endSyllable(verse[2]).equalsIgnoreCase(endSyllable(verse[3]))) 
        {
          System.out.println("perfect");
        }
        else if (endSyllable(verse[0]).equalsIgnoreCase(endSyllable(verse[1])) &&          endSyllable(verse[2]).equalsIgnoreCase(endSyllable(verse[3])))
        {
          System.out.println("even");
        }
        else if (endSyllable(verse[0]).equalsIgnoreCase(endSyllable(verse[2])) && endSyllable(verse[1]).equalsIgnoreCase(endSyllable(verse[3])))
        {
          System.out.println("cross");
        }
        else if(endSyllable(verse[0]).equalsIgnoreCase(endSyllable(verse[3])) && endSyllable(verse[1]).equalsIgnoreCase(endSyllable(verse[2])))
        {
          System.out.println("shell");
        }
       else 
        {
          System.out.println("free");
        }
      
      }

    
  }

  public static String endSyllable(String str)
  {
    String vowels = "aeiouAEIOU";
    int indexLastVowel = -1;
    int lastSpaceIndex = str.lastIndexOf(' ');
    String lastWord = str.substring(lastSpaceIndex + 1);
    
    for(int i = lastWord.length() - 1; i >= 0; i--)
      {
        if(vowels.indexOf(lastWord.charAt(i)) >= 0)
        {
          return lastWord.substring(i);
        }
        
      }

    return lastWord;
  }

}

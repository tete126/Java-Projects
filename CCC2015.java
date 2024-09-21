import java.util.Scanner;

public class CCC2015 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    String newStr = "";
    char [] consonants ={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

   for(int i = 0; i < str.length(); i++)
     {
       char letter = str.charAt(i);
       if(isConsonant(letter))
       {
         newStr += letter + Character.toString(closestVow(letter)) + Character.toString(closestCons(letter));
       }
       else
       {
         newStr += letter;
       }
     }

    System.out.println(newStr);
   

  }

  public static boolean isConsonant(char letter)
  {
    char [] vowels = {'a', 'e', 'i', 'o', 'u'};

    for(int i = 0; i < vowels.length; i++)
      {
        if(vowels[i] == letter)
        {
          return false;
        }
      }

    return true;
  }

  public static char closestVow(char consonant)
  {
    char [] vowels = {'a', 'e', 'i', 'o', 'u'};

    int minDist = 27;
    int currDist = 0;
    char closestVowel = 'a';

    for(char vowel : vowels)
      {
        currDist = Math.abs(consonant - vowel);

        if(minDist > currDist)
        {
          minDist = currDist;
          closestVowel = vowel;
        }
      }

    return closestVowel;

  }

  public static char closestCons(char consonant)
    {
      String consonants = "bcdfghjklmnpqrstvwxyz";

      //if(Character.toString(consonant).equals("z"))
      if(String.valueOf(consonant).equals("z"))
      {
        return 'z';
      }
      
      int consonantIndex = consonants.indexOf(consonant);

      char nextConsonant = consonants.charAt(consonantIndex + 1);

      return nextConsonant;
      
      
    }

}

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class C5q5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();

    ArrayList<Character> list1 = new ArrayList<Character>();
    ArrayList<Character> list2 = new ArrayList<Character>();

   for(int i = 0; i < str1.length(); i++)
     {
       if(str1.charAt(i) != ' ')
       {
         list1.add(str1.charAt(i));
       }
     }

    for(int i = 0; i < str2.length(); i++)
       {
         if(str2.charAt(i) != ' ')
         {
           list2.add(str2.charAt(i));
         }
       }

  

    Collections.sort(list1);
    Collections.sort(list2);

 

    if(list1.equals(list2)) System.out.println("Is an anagram.");
    else System.out.println("Is not an anagram.");

    

  }
}

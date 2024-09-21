import java.util.Scanner;

public class CCC2018 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();

    if((a == 8 || a == 9) && (d == 8 || d == 9))
       {
          if(b == c)
          {
            System.out.println("ignore");
          }
          else
          {
            System.out.println("answer");
          }
       }
      else 
      {
        System.out.println("answer");
      }
      
   }
}


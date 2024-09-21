import java.util.Scanner;

public class CCC2014Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int antonia = 100;
    int david = 100;

    for(int i = 0 ; i < n; i++)
      {
        int a = input.nextInt();
        int d = input.nextInt();

        if(a > d)
        {
          david = david - a;
        }
        else if (d > a)
        {
          antonia = antonia - d;
        }

      }

    System.out.println(antonia);
    System.out.println(david);
   
  }
}

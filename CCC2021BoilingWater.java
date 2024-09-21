import java.util.Scanner;

public class CCC2021BoilingWater {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int b = input.nextInt();
    int p = 5 * b - 400;
    System.out.println(p);

    if(p < 100)
    {
      System.out.println(1);
    }
    else if(p == 100)
    {
      System.out.println(0);
    }
    else
    {
      System.out.println(-1);
    }
    
  }
}

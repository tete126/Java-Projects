import java.util.Scanner;

public class CCC2024 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    int g = input.nextInt();
    int b = input.nextInt();

    int sum = 3*r + 4*g + 5*b;

    System.out.println(sum);
  }

}

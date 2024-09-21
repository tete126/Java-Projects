import java.util.Scanner;

public class CCC2020Q2 {
  public static void main(String[] args) {
    System.out.println("Input");
    Scanner input = new Scanner(System.in);
    int p = input.nextInt();
    int n = input.nextInt();
    int r = input.nextInt();

    int total = 0;
    int days = 0;

    while(total <= p)
      {
        total += n * Math.pow(r, days);
        //System.out.println("Total: " + total);
        days++;
        //System.out.println("Days: " + days);
      }

    days--;

    System.out.println(days);
  }

}

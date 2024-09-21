import java.util.Scanner;
import java.text.DecimalFormat;

public class C5q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#0.00");
    double n = input.nextDouble();
    double m = input.nextDouble();
    int y = input.nextInt();

    System.out.println(0 + " " + df.format(n));
    for(int i = 1; i <= y; i++)
      {
        n = n * (1.00 + m/100);
        System.out.println(i + " " + df.format(n));
      }
    
  }

}

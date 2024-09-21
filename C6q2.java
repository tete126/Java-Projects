import java.util.Scanner;
import java.text.DecimalFormat;

public class C6q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#0.00");
    int n = input.nextInt();
    for(int i = 0; i < n; i++)
      {
        double base = input.nextDouble();
        int power = input.nextInt();
        System.out.println(df.format(Math.pow(base, power)));
      }
  }

}

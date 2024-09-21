import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;


public class C4q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#0.00");
    int t = input.nextInt();

    for(int i = 0; i < t; i++)
    {
      double rate = input.nextDouble();
      int hours = input.nextInt();
      char taxCategory = input.next().charAt(0);
      char yn = input.next().charAt(0);
      double moneyAfterTax;

      if(taxCategory == 'A') moneyAfterTax = 1.0;
      else if(taxCategory == 'B') moneyAfterTax = 0.9;
      else if(taxCategory == 'C') moneyAfterTax = 0.8;
      else if(taxCategory == 'D') moneyAfterTax = 0.71;
      else moneyAfterTax = 0.65;

      double sum = 0;

      if(hours <= 40)
      {
         sum = rate * hours * moneyAfterTax;
      }
      else
      {
        sum = (rate * 40 + (rate * (hours - 40)) * 2) * moneyAfterTax;
      }
      if(yn == 'y') sum -= 10;

      System.out.println(df.format(Math.round(sum * 100.0) / 100.0));

    }
  }
}

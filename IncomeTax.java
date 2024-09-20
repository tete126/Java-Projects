import java.util.Scanner;

public class IncomeTax 
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Income: ");
    double income = input.nextDouble();
    System.out.println("Housing Cost: ");
    double houseCost = input.nextDouble();
    System.out.println("Number of children: ");
    int totalChildren = input.nextInt();
    System.out.println("Number of children in school: ");
    int schoolChildren = input.nextInt();
    double tax = 0;
    double reduction = 0;
    double refundOrPayable = 0;

    if (houseCost > 8000)
    {
      tax = income * 0.18;
    }
    else if ( income > 10000 )
    {
      tax = (income - 10000) * 0.18;
    }

    
  
    if (houseCost < 6000 && totalChildren > 2 && schoolChildren >= 1)
    {
      reduction = totalChildren * 500 + schoolChildren * 500;
    }  
  
      if (tax > 2000)
    {
      tax = tax * 1.15;
    }

      refundOrPayable = tax - reduction;
    if (refundOrPayable > 0)
    {
      System.out.println("Payable tax: " + tax);
    }
    else
    {
      System.out.println("Refund due: " + Math.abs(refundOrPayable));
    }
    
  }
}

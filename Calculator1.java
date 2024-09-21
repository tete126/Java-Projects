import java.util.Scanner;

public class Calculator1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input: ");

    String expression = input.next();

    double answer = 0;

    for(int i = 0; i < expression.length(); i++)
      {
        String str = expression.substring(i, i + 1);
        
        if(str.equals("+"))
        {
          double exp1 = Integer.valueOf(expression.substring(0, expression.indexOf("+")));
          
          double exp2 = Integer.valueOf(expression.substring(expression.indexOf("+") + 1));
          
          answer = exp1 + exp2;
        }
        
    

        if(str.equals("-"))
        {
          double exp1 = Integer.valueOf(expression.substring(0, expression.indexOf("-")));

          double exp2 = Integer.valueOf(expression.substring(expression.indexOf("-") + 1));

          answer = exp1 - exp2;
        }


        if(str.equals("x"))
        {
          double exp1 = Integer.valueOf(expression.substring(0, expression.indexOf("x")));

          double exp2 = Integer.valueOf(expression.substring(expression.indexOf("x") + 1));

          answer = exp1 * exp2;
        }
        

        if(str.equals("/"))
        {
          double exp1 = Integer.valueOf(expression.substring(0, expression.indexOf("/")));

          double exp2 = Integer.valueOf(expression.substring(expression.indexOf("/") + 1));

          answer = exp1 / exp2;
        }
       
      }

    System.out.println();
    System.out.println(answer);
  }

}

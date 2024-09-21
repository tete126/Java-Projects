import java.util.Scanner;
import java.util.ArrayList;

public class CCC2021SilentAuction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of bids:");
    int n = input.nextInt();
    System.out.println("Enter name and amount");

    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> amount = new ArrayList<Integer>();

    for(int i = 0; i < n; i++)
      {
        name.add(input.next());
        input.nextLine();
        amount.add(input.nextInt());
      }

    for(int i = 0; i < amount.size(); i++)
    {
      for(int j = 0; j < amount.size() - 1; j++)
        {
          if(amount.get(j) > amount.get(j + 1))
          {
            int temp = amount.get(j);
            int amountJ = amount.get(j);
            amountJ = amount.get(j + 1);
            amountJ = temp;
          }
        }
    }

    /*for(int i = 0; i < amount.size(); i++)
      {
        System.out.print(amount.get(i) + " ");
      }*/

    System.out.println();
    int maxIndex = 0;
    
    for(int i = amount.size(); i > 0; i++)
    {
      for(int j = amount.size(); j < amount.size(); j++)
        {
          if(amount.get(i) > amount.get(j))
          {
            maxIndex = i;
          }
          else if(amount.get(i) < amount.get(j))
          {
            maxIndex = j;
          }
          else if(amount.get(i) == amount.get(j))
          {
            amount.remove(j);
          }
        }      
    }

    String highestBid = name.get(maxIndex);

    System.out.println();
    System.out.println(highestBid);
  }

}

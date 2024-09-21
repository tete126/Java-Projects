import java.util.Scanner;
import java.util.ArrayList;


public class C1q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();

    for(int i = 0; i < 5; i++)
    {
    int n1 = input.nextInt();
    int base1 = input.nextInt();
    int n2 = input.nextInt();
    int base2 = input.nextInt();
    int finalBase = input.nextInt();

    int power = 0;
    int t1 = 0;
    while(n1 >= 10)
    {
        t1 += n1 % 10 * Math.pow(base1, power);
        n1 = n1/10;
        power++;
    }
    t1 += n1 * Math.pow(base1, power);

    power = 0;
    int t2 = 0;
    while(n2 >= 10)
    {
        t2 += n2 % 10 * Math.pow(base2, power);
        n2 = n2/10;
        power++;
    }
    t2 += n2 * Math.pow(base2, power);

    int product = t1 * t2;

    ArrayList<Integer> list = new ArrayList<Integer>();

    while(product > 0)
      {
        list.add(product % finalBase);
        product = product / finalBase;
      }

    finalList.add(list);
    }

    for(int i = 0; i < finalList.size(); i++)
      {
        ArrayList<Integer> listN = finalList.get(i);
        for(int j = listN.size() - 1; j >= 0; j--)
          {
            System.out.print(listN.get(j));
          }
        System.out.println();
      }
  }
}

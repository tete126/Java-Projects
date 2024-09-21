import java.util.Scanner;

public class C6q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double p = input.nextDouble();
    int y = input.nextInt();
    long n = input.nextLong();
    int y2 = input.nextInt();

    double population = n;

    for(int i = y; i < y2; i++)
      {
        population = population * (1 + p/100.0);   
      }

    //(long)Math.floor(population * (1 + p/100))
    System.out.println((long)Math.ceil(population));
  }

}

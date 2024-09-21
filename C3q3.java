import java.util.Scanner;

public class C3q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int m = input.nextInt();

    

    int count = 0;
    for(int i = x; i < m; i++)
      {
        if(x * i % m == 1) 
        {
          System.out.println(i);
          count++;
          break;
        }
      }

    if(x > m || m > 100)
      {
        count = 0;
      }

    if(count == 0)
      System.out.println("No such integer exists.");
    

  }
}

import java.util.Scanner;

public pubclass CCC2022Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Number of players: ");
    int n = input.nextInt();
    System.out.println();

    int [] arr = new int[n * 2];
    
  for(int i = 0; i < arr.length; i++)
    {
      arr[i] = input.nextInt();   
    }
 
    int count = 0;
    for(int i = 0; i < arr.length - 1; i += 2)
      {
        if(arr[i] * 5 - arr[i + 1] * 3 > 40)
        {
          count++;
        }
      }

    if(count == n)
    {
      System.out.println(count + "+");
    }
    else
    {
      System.out.println(count);
    }
    
  }
}

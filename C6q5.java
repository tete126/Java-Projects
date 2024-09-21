import java.util.Scanner;
import java.util.Arrays;


public class C6q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    
    for(int i = 0; i < n; i++)
      {
        String [] arr = new String[3];
        for(int j = 0; j < 3; j++)
          {
            arr[j] = input.nextLine();
          }


        boolean yes = true;
        for(int k = 0; k < 3; k++)
        {
          for(int l = 0; l < 3; l++)
          {
            if((arr[k].indexOf(arr[l]) == 0 || arr[k].endsWith(arr[l])) && k != l) 
            {
              yes = false;
            }
          }
        }
          
        if(yes) System.out.println("Yes");
        else System.out.println("No");
                
      }
  }
 
}

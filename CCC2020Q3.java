import java.util.Scanner;
import java.util.ArrayList;

public class CCC2020Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> listX = new ArrayList<Integer>();
    ArrayList<Integer> listY = new ArrayList<Integer>();
    //System.out.println("Input: ");
    
    int n = input.nextInt();
    
    
    for(int i = 0; i < n; i++)
      {
        int x = input.nextInt();
        input.nextLine();
        String comma = input.nextLine();
        input.nextLine();
        int y = input.nextInt();
        listX.add(x);
        listY.add(y);
        
      }

    int largestX = listX.get(0);
    int largestY = listY.get(0);
    int smallestX = listX.get(0);
    int smallestY = listY.get(0);
    
    for(int i = 1; i < listX.size(); i++)
      {
        if(listX.get(i) > largestX)
        {
          largestX = listX.get(i);
        }
        if(listX.get(i) < smallestX)
        {
          smallestX = listX.get(i);
        }
          
      }

    for(int i = 1; i < listY.size(); i++)
    {
      if(listY.get(i) > largestY)
      {
        largestY = listY.get(i);
      }
      if(listY.get(i) < smallestY)
      {
        smallestY = listY.get(i);
      }

    }

    System.out.println((smallestX - 1) + "," + (smallestY - 1));
    System.out.println((largestX + 1) + "," + (largestY + 1));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

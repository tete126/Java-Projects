
public class Shiftarray {
  public static void main(String[] args) {
    int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
    int[] arr1D = {1, 2, 3, 4, 5};

    System.out.println("before arr1D: " + arr1D);
    shiftArray2(arr1D, 0);
    System.out.println();
    System.out.println("after arr1D: " + arr1D);

   // shiftMatrix(arr2D, 99);

   for(int i = 0; i < arr1D.length; i++)
     {
       System.out.print(arr1D[i] + " ");
     }

    //shiftMatrix(arr2D, 0);

    /*for(int i = 0; i < arr2D.length; i++)
      {
        for(int j = 0; j < arr2D[0].length; j++)
          {
            System.out.print(arr2D[i][j] + " ");
          }
      }

    System.out.println();

    int x = 0;
    int y = 1;

    for(int i = 0; i < 5; i++)
      { 
        y = 2 + i;
        x = y;

        System.out.println(x + " " + y);
      }
*/
    
  }

  
  
  public static void shiftArray(int[] arr, int num)
  {
    int[] temp = new int[arr.length];
     
    temp[0] = num;
    int j = 0;

    for(int i = 1; i < temp.length; i++)
      {
        temp[i] = arr[j];
        j++;
      }

    for(int i = 0; i < temp.length; i++)
      {
        arr[i] = temp[i];
      }
    System.out.println();

    for(int i = 0; i < arr.length; i++)
     {
       System.out.print(arr[i] + " ");
     }
  }


  public static void shiftArray2(int[] arr, int num)
  {
    for(int i = arr.length - 1; i > 0; i--)
    {
      arr[i] = arr[i - 1];
    }

    arr[0] = num;

    System.out.println();

    for(int i = 0; i < arr.length; i++)
     {
       System.out.print(arr[i] + " ");
     }
  }


/*public static void shiftMatrix(int[][] matrix, int num)
  {
    int temp = num;
    System.out.println(temp);
    int lastElement = 99;

    for(int i = 0; i < matrix.length; i++)
    {
      lastElement = matrix[i][matrix[0].length - 1];
      System.out.println("lastElement" + lastElement);
      shiftArray(matrix[i], temp);
      System.out.print("matrix" + i + ">");
    for(int b = 0; b < matrix[0].length; b++)
       {
         System.out.print(matrix[i][b] + " ");
       }
      System.out.println();
      temp = lastElement;

      System.out.println(temp);
      
    }
    for(int i = 0; i < matrix.length; i++)
      {
        for(int j = 0; j < matrix[0].length; j++)
          {
            System.out.println(matrix[i][j] + " ");
          }
      }

    System.out.println();
    
  }*/
  
  
}

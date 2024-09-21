public class Successors
{
  public Successors()
  {
    
  }
   public static Position findPosition(int n, int[][] intArr)
    {
      for(int i = 0; i < intArr.length; i++)
        {
          for(int j = 0; j < intArr[i].length; j++)
          {
            if(intArr[i][j] == n)
            {
              Position p = new Position(i, j);
              return p;
            }
          }
        }

        return null;
    }

   public static Position[][] getSuccessorArray(int[][] intArr)
   {
     Position [][] successor = new Position[intArr.length][intArr[0].length];

     for(int i = 0; i < successor.length; i++)
     {
       for(int j = 0; j < successor[i].length; j++)
       {
         successor[i][j] = findPosition(intArr[i][j] + 1, intArr);
       }
     }

     return successor;
     
   }
}

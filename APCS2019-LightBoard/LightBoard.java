public class LightBoard
{
  int numRows;
  int numCols;
  private boolean[][] lights;

  public LightBoard(int numRows, int numCols)
  {
    this.numRows = numRows;
    this.numCols = numCols;

    lights = new boolean[numRows][numCols];

    for(int i = 0; i < lights.length; i++)
    {
      for(int j = 0; j < lights[0].length; j++)
      {
        if(Math.random() <= 0.4) 
        {
          lights[i][j] = true;
        }
      }
    }
  }

  public void print()
  {
    for(int i = 0; i < lights.length; i++)
      {
        for(int j = 0; j < lights[0].length; j++)
          {
            System.out.print(lights[i][j] + " ");
          }
      }
  }
  

  public boolean evaluateLight(int row, int col)
  {
    if(lights[row][col])
    {
      int count = 0;
      for(int i = 0; i < col; i++)
      {
        if(lights[i][col] == true) 
        {
          count++;
        }
      }

      if(count % 2 == 0)
      {
        return false;
      }
      else
      {
        return true;
      }

    }
    else
    {
      int count2 = 0;
      for(int i = 0; i < col; i++)
      {
        if(lights[i][col] == true) 
        {
          count2++;
        }
      }

      if(count2 % 3 == 0)
      {
        return true;
      }
      else
      {
        return false;
      }

    }

  }
}

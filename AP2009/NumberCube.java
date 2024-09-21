public class NumberCube
  {
   
    public int toss()
    {
      int n = (int)(Math.random() * 6 + 1);
      return n;
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
      int[] arr = new int[numTosses];

      for(int i = 0; i < arr.length; i++)
        {
          arr[i] = cube.toss();
        }
      return arr;
    }

    public static int getLongestRun(int[] values)
    {

      int maxRunIndex = -1;
      int maxRunLength = 1;
      int runIndex = 0;
      int runLength = 1;

      for(int i = 1; i < values.length; i++)
        {
          if(values[i] == values[runIndex])
          {
            runLength++;
            if(maxRunLength < runLength)
            {
              maxRunLength = runLength;
              maxRunIndex = runIndex;
            }
          }
          else
          {
            runIndex = i;
            runLength = 1;
          }
        }

      return maxRunIndex;

    }
  }

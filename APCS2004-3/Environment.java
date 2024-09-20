public class Environment
  {
    private int numRow;
    private int numCol;
    private int numFish;

    public Environment(int row, int col, int numFish)
    {
      numRow = row;
      numCol = col;
      this.numFish = numFish;
    }

    public int getEnv()
    {
      return numRow*numCol;
    }

    public int getNumFish()
    {
      return numFish;
    }

    public void setNumFish(int numAdd)
    {
      numFish = numFish + numAdd;
    }

    public double getDensity()
    {
      return (double)numFish/(numRow*numCol);
    }

    public int getNumRow()
    {
      return numRow;
    }

    public int getNumCol()
    {
      return numCol;
    }
    //(Math.random() *(max - min + 1) + min)
  }

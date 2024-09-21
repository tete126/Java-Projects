import java.util.ArrayList;

public class Environment
  {
    ArrayList<Fish> env;
    private int numRows;
    private int numCols;
    
    public Environment(int numRows, int numCols)
    {
      this.numRows = numRows;
      this.numCols = numCols;
    }

    public int getNumRows()
    {
      return numRows;
    }

    public int getNumCols()
    {
      return numCols;
    }

    public void addFish(Fish fish)
    {
      env.add(fish);
    }

    public ArrayList<Fish> getList()
    {
      return env;
    }

  }

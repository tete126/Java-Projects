import java.util.ArrayList;

public class PounceFish extends Fish
{
  private int range;
  private Environment env;
  private String direction;
  private Location loc;

  public PounceFish(Location loc, int range, Environment env, String direction)
  {
    super(loc);
    this.range = range;
    this.env = env;
    this.direction = direction;
  }

  public Fish findFish()
  {
    int col = this.getLocation().getCol();
    int row = this.getLocation().getRow();
    
    if (direction.equals("east") && col == env.getNumCols() - 1 ||
        (direction.equals("west") && col == 0) ||
        (direction.equals("north") && row == 0) ||
        (direction.equals("south") && row == env.getNumRows() - 1)) 
    {
      return null;
    }

    ArrayList<Fish> fishList = env.getList();
    Location temporaryLoc1 = new Location(env.getNumRows(), env.getNumCols());
    Location temporaryLoc2 = new Location(-1, -1);
    Fish temp1 = new Fish(temporaryLoc1);
    Fish temp2 = new Fish(temporaryLoc2);
    
    for(int i = 0; i < fishList.size(); i++)
      {
        Fish fish = fishList.get(i);
        if(direction.equals("east"))
        {
          if(fish.getLocation().getRow() == row  &&
             fish.getLocation().getCol() > col &&
             fish.getLocation().getCol() <= col + range)
          {
            if(fish.getLocation().getCol() < temp1.getLocation().getCol())
            {
              temp1 = fish;
            }
            
          }
        }
        else if(direction.equals("west"))
        {
          if(fish.getLocation().getRow() == row &&
             fish.getLocation().getCol() < col &&
             fish.getLocation().getCol() >= col - range)
          {
            if(fish.getLocation().getCol() > temp2.getLocation().getCol())
            {
              temp2 = fish;
            }

          }
        }
        else if(direction.equals("north"))
        {
          if(fish.getLocation().getCol() == col &&
             fish.getLocation().getRow() < row &&
             fish.getLocation().getRow() >= row - range)
          {
            if(fish.getLocation().getRow() > temp2.getLocation().getRow())
            {
              temp2 = fish;
            }

          }
        }
        else(direction.equals("south"))
        {
          if(fish.getLocation().getCol() == col  &&
             fish.getLocation().getRow() > row &&
             fish.getLocation().getRow() <= row + range)
          {
            if(fish.getLocation().getRow() < temp1.getLocation().getRow())
            {
              temp1 = fish;
            }

          }
        }
      }

    if(direction.equals("south") || direction.equals("east"))
    {
      if(temp1.getLocation().getCol() != -1)
      {
        return temp1;
      }
      else
      {
        return null;
      }
    }

    else if(direction.equals("north") || direction.equals("west"))
    {
      if(temp2.getLocation().getCol() != env.getNumCols())
      {
        return temp2;
      }
      else
      {
        return null;
      }
    }
   
  }
}

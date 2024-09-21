public class GridWorldUtilities
{
  ArrayList<Location> list;

public static ArrayList<Location> getEmptyLocations (Grid<Actor> grid)
{
  list = new ArrayList<Location>();

  for(int i = 0; i < grid.length; i++)
    {
      for(int j = 0; j < grid[0].length; j++)
        {
          Location loc = new Location(i, j);
          if(grid.get[loc] == null)
          {
            list.add(loc);
          }
        }
    }

  return list;
}

  


}

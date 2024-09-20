public class PondStocker
{
private Environment theEnv;
private double minDensity; // 0.0 <= minDensity < 1.0
// postcondition: returns the minimum number of fish that need to be
// added to make the population density greater than
// minDensity
private int numUnder()
  {
    if (theEnv.getDensity() < minDensity)
    {
      return (int)(theEnv.getEnv() * (minDensity - theEnv.getDensity())); 
    }
    else
    {
      return 0;
    }
  }
// postcondition: returns a random location within the bounds of theEnv
private Location randomLocation()
{
  int rowNum = (int)(Math.random() * (theEnv.getNumRow() - 1 + 1) + 1);
  int colNum = (int)(Math.random() * (theEnv.getNumCol() - 1 + 1) + 1);
  Location loc = new Location(rowNum, colNum);
  return loc;
}
// precondition: 0 <= numToAdd <= number of empty locations in theEnv
// postcondition: the number of fish in theEnv has been increased
// by numToAdd; the fish added are placed at
// random empty locations in theEnv
public void addFish(int numToAdd)
{
  theEnv.setNumFish(numToAdd);
  
}
// constructor and other methods not shown
}

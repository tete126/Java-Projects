import java.util.ArrayList;

public class StepTracker
{
  private int stepGoal;
  ArrayList<Integer> dailySteps = new ArrayList<Integer>();
  
  public StepTracker(int stepGoal)
  {
    this.stepGoal = stepGoal;
  }

  public void addDailySteps(int steps)
  {
    dailySteps.add(steps);
  }

  public int activeDays()
  {
    int count = 0;
    for(int i = 0; i < dailySteps.size(); i++)
      {
        if(dailySteps.get(i) >= stepGoal)
        {
          count++;
        }
      }

    return count;
  }

  public double averageSteps()
  {
    int sum = 0;
    for(int i = 0; i < dailySteps.size(); i++)
      {
        sum += dailySteps.get(i);
      }

    return (double)sum / dailySteps.size();
  }
}

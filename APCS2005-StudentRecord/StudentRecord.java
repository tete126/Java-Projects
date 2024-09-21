public class StudentRecord
{
  private int[] scores;

  public StudentRecord(int[] scores)
  {
    this.scores = scores;
  }

  private double average(int first, int last)
  {
    int sum = 0;
    int num = 0;
    
    for(int i = first; i <= last; i++)
      {
        sum += scores[i];
        num++;
      }

    return (double) sum / num;
  }

  private boolean hasImproved()
  {
    for(int i = 0; i < scores.length - 1; i++)
      {
        if(scores[i] > scores[i + 1])
        {
          return false;
        }
      }

    return true;
  }

  public double finalAverage()
  {
    int startingNum = 0;
    
    if(hasImproved())
    {
      startingNum = scores.length / 2;
    }

    return average(startingNum, scores.length - 1);
  }
}

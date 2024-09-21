public class MultiPractice implements StudyPractice
{
  private int first;
  private int second;
  
  public MultiPractice(int first, int second)
  {
    this.first = first;
    this.second = second;
  }

  public String getProblem()
  {
    String problem = first + " TIMES " + second;

    return problem;
    
  }

  public void nextProblem()
  {
    second++; 
  }

}

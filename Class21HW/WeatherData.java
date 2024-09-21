import java.util.ArrayList;
public class WeatherData
{
  private ArrayList<Double> temperatures;

  public WeatherData(ArrayList<Double> temperatures)
  {
    this.temperatures = temperatures;
  }

  public void cleanData(double lower, double upper)
  {
    for(int i = 0; i < temperatures.size(); i++)
    {
      double temp = temperatures.get(i);
      if(temp < lower || temp > upper)
      {
        temperatures.remove(i);
        i--;
      }
    }

    
    for(int i = 0; i < temperatures.size(); i++)
      {
        System.out.print(temperatures.get(i) + " ");
      }

  }


  public int longestHeatWave(double threshold)
  {
    int maxLen = 0;
    int currentLen = 0;

    for(int i = 0; i < temperatures.size(); i++)
    {
      double temp = temperatures.get(i);
      if(temp > threshold)
      {
        currentLen++;
      }
      else
      {
        currentLen = 0;
      }

      if(currentLen > maxLen)
      {
        maxLen = currentLen;
      }

    }

  return maxLen;

  }
}

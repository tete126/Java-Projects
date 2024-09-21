import java.util.ArrayList;

public class Trip
{
  private ArrayList<Flight> flights;

  public int getDuration()
  {
    int mins = 0;
    if(flights.size() == 0)
    {
      return 0;
    }

    mins = flights.get(0).getArrivalTime().minutesUntil(flights.get(flight.size() - 1).getDepartureTime());
    
    return mins;
  }

  public int getShortestLayover()
  {
    if(flights.size() < 2)
     {
      return -1;
      
    }

     int minLayover = flights.get(0).getArrivalTime().minutesUntil(flights.get(1).getDepartureTime());

    for(int i = 1; i < flights.size() - 1; i++)
      {
        int layover = flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime()));
        
        if(minLayover > layover)
        {
          minLayover = layover;
        }
      }

    return minLayover;
    
  }
}

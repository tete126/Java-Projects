public class AppointmentBook
{
  private boolean[][] periods = new boolean[8][60];
  
  public AppointmentBook()
  {
    for(int i = 0; i < periods.length; i++)
      {
        for(int j = 0; j < periods[0].length; j++)
          {
            int random = (int)(Math.random() * 2) + 0;
            if(random == 1) periods[i][j] = true;
            else periods[i][j] = false;
          }
      }

    for(int i = 0; i < periods.length; i++)
      {
        System.out.println("\n ");

        System.out.println("Period " + i);

        for(int j = 0; j < periods[0].length; j++)
          {     
            if(periods[i][j]) System.out.print(1 + " ");
            else System.out.print(0 + " ");
            if((j+1) % 10 == 0) System.out.println();
            
          }
      }
    System.out.println();

  }

  private boolean isMinuteFree(int period, int minute)
  {
    return periods[period][minute];
      
  }

  private void reserveBlock(int period, int startMinute, int duration)
  {
    for(int i = startMinute; i < startMinute + duration; i++)
      {
        periods[period][i] = true;
      }
  }

  
  public int findFreeBlock(int period, int duration)
  {
    int blockStart = 0;
    int minutes = 0;

    for(int i = 0; i < 60; i++)
    {
      if(isMinuteFree(period, i)) 
      {
        minutes++;
        
      }
      else
      {
        minutes = 0;
        blockStart = i + 1;
      }

      if(minutes == duration)
      {
        //blockStart = blockStart - minutes + 1; 
        return blockStart;
      }

    }

  return -1;

  }

  public Boolean makeAppointment(int startPeriod, int endPeriod, int duration)
  {
    for(int i = startPeriod; i <= endPeriod; i++)
    {
      if(findFreeBlock(i, duration) >= 0)
      {
        reserveBlock(i, findFreeBlock(i, duration), duration);
        return true;
      }
    }

    return false;
  }


  
}

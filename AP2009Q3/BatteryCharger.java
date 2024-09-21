public class BatteryCharger
  {
    private int[] rateTable;

    public BatteryCharger(int[] rateTable)
    {
      this.rateTable = rateTable;
    }

    private int getChargingCost(int startHour, int chargeTime)
    {
      int cost = 0;

      for(int i = startHour; i < startHour + chargeTime; i++)
        {
          cost += rateTable[i % rateTable.length];
        }

      return cost;
    }

    public int getChargeStartTime(int chargeTime)
    {
      int cheapestHour = 0;

      for(int i = 1; i < rateTable.length; i++)
        {
          if(getChargingCost(i, chargeTime) < getChargingCost(cheapestHour, chargeTime))
          {
            cheapestHour = i;
          }
        }

      return cheapestHour;
    }
  }

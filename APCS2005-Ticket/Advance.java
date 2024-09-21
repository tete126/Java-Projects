public class Advance extends Ticket
{
  private int price;
  
  public Advance(int days)
  {
    super();

    if(days >= 10)
    {
      price = 30;
    }
    else
    {
      price = 40;
    }
  }

  public double getPrice()
  {
    return price;
  }
}

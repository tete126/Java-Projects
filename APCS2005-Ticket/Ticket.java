public abstract class Ticket
{
  private int serialNumber;

  public Ticket()
  {
    serialNumber = getNextSerialNumber();
  }

  public abstract double getPrice();

  public String toString()
  {
    return "Number: " + serialNumber + "\nPrice: " + getPrice();
  }

  private static int getNextSerialNumber()
  {
    return (int)(Math.random() * 99 + 1);
  }
}

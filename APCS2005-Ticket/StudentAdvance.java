public class StudentAdvance extends Advance
{
  //private int price;

  public StudentAdvance(int days)
  {
    super(days);
  }

  public double getPrice()
  {
    return super.getPrice() / 2;
  }

  public String toString()
  {
    return super.toString() + " (Student ID required)";
  }
}

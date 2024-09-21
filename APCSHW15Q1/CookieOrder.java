public class CookieOrder
{
  String variety;
  int numBoxes;
//Constructs a new CookieOrder object. 
  public CookieOrder (String variety, int numBoxes)
  {
    this.variety = variety;
    this.numBoxes = numBoxes;
  }
// @return the variety of cookie being ordered

  public String getVariety()
  {
    return variety;
  }
// @return the number of boxes being ordered

  public int getNumBoxes() 
  {
    return numBoxes;
  }

}

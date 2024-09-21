import java.util.ArrayList;
import java.util.List;

public class MasterOrder
{

private List<CookieOrder> orders;

  public MasterOrder()
  {
    orders = new ArrayList<CookieOrder> ();
  }


public void addOrder(CookieOrder theOrder)
{
  orders.add(theOrder);
}

public int getTotalBoxes ()
{
  int boxes = 0;

  for(int i = 0; i < orders.size(); i++)
    {
      boxes += orders.get(i).getNumBoxes();
    }

  return boxes;
  
}
/*Removes all cookie orders from the master order that have the same variety of
* cookie as cookieVar and returns the total number of boxes that were removed.
* @param cookieVar the variety of cookies to remove from the master order
* @return the total number of boxes of cookieVar in the cookie orders removed
*/
public int removeVariety (String cookieVar)
{
  int boxesRemoved = 0;

  for(int i = 0; i < orders.size(); i++)
  {
    if(orders.get(i).getVariety().equals(cookieVar))
    {
      boxesRemoved += orders.remove(i).getNumBoxes();
    }
  }

  return boxesRemoved;
}
}
// There may be instance variables, constructors, and methods that are not shown.

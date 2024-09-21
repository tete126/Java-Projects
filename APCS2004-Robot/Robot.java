public class Robot
{
  private int [] hall;
  private int pos;
  private boolean facingRight;

  public Robot(int [] hall, int pos, boolean facingRight)
  {
    this.hall = hall;
    this.pos = pos;
    this.facingRight = facingRight;
  }

  private boolean movingForwardBlocked()
  {
    if(facingRight && pos == hall.length - 1 || !facingRight && pos == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
 
  }

  private void move()
  {
    if(hall[pos] > 0)
    {
      hall[pos]--;
    }

    if(hall[pos] == 0)
    {
      if(movingForwardBlocked())
      {
        facingRight = !facingRight;
      }
      else if(facingRight)
      {
        pos++;
      }
      else 
      {
        pos--;
      }
    }
  
  }

  public int clearHall()
  {
    int numMoves = 0;
    
    while (!hallIsClear())
      {
        move();
        numMoves++;
      }

    return numMoves;
  }

  private boolean hallIsClear()
  {
    int count = 0;
    for(int i = 0; i < hall.length; i++)
      {
        if(hall[i] == 0)
        {
          count++;
        }
      }

    return count == hall.length;
  }
}

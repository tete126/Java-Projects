public class Position
{
  int r;
  int c;
  
  public Position(int r, int c) 
  {
    this.r = r;
    this.c = c;
  }

  public String toString()
  {
    return "(" + r + ", " + c + ")";
  }
}

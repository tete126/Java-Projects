import java.util.ArrayList;
public class NumberTile
{
  /*private int a;
  private int b;
  private int c;
  private int d;*/

  ArrayList<Integer> list = new ArrayList<Integer>();
//Rotates the tile 90 degrees clockwise
  public NumberTile(ArrayList<Integer> list)
  {
    /*this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;*/

    this.list = list;
    
  }

public void rotate()
  {
    list.add(0, list.remove(list.size() - 1));
  }


public int getLeft()
{
  return list.get(0);
}

public int getRight()
{
  return list.get(2);
}
}

import java.util.ArrayList;
public class TileGame
{
  private ArrayList<NumberTile> board;

  public TileGame(ArrayList<NumberTile> tile)
  {
    board = new ArrayList<NumberTile>();

    board = tile;
  }

  private int getIndexForFit(NumberTile tile)
  {
    int ret = -1;
    if(board.size() == 0) return 0;
    else
    {
      for(int i = 0; i < board.size() - 1; i++)
        {
          if(board.get(0).getLeft() == tile.getRight()) 
          {
            System.out.println("found 0");
            return 0;
          }
          else if(board.get(board.size() - 1).getRight() == tile.getLeft())
          {
            System.out.println("found " + (board.size() - 1));
            return board.size() - 1;
          }
          else if(board.size() == 1) return -1;
          else
          {
            int right = board.get(i).getRight();
            int left = board.get(i + 1).getLeft();
            if(right == tile.getLeft() && left == tile.getRight())
            {
              ret = i + 1;
              System.out.println("found " + ret);
              return ret;
            }
          }
        }
      System.out.println("not found " + ret);
      return ret;
    }
  }

  public boolean insertTile(NumberTile tile)
  {
    for(int i = 0; i < 3; i++)
      {
        System.out.println("i = " + i);
        int index = getIndexForFit(tile);
        if(index != -1)
        {
          board.add(index, tile);
          return true;
        }
        else tile.rotate();
      }

    return false;
  }
}

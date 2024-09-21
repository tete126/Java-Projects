import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(4);
    list.add(4);
    list.add(3);
    list.add(7);

    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(3);
    list2.add(6);
    list2.add(4);
    list2.add(3);

    ArrayList<Integer> list3 = new ArrayList<Integer>();
    list3.add(4);
    list3.add(1);
    list3.add(2);
    list3.add(3);
    
    ArrayList<Integer> list4 = new ArrayList<Integer>();
    list4.add(2);
    list4.add(3);
    list4.add(2);
    list4.add(5);

    ArrayList<Integer> list5 = new ArrayList<Integer>();
    list5.add(2);
    list5.add(5);
    list5.add(9);
    list5.add(2);

    ArrayList<Integer> tile1 = new ArrayList<Integer>();
    tile1.add(2);
    tile1.add(4);
    tile1.add(2);
    tile1.add(9);

    ArrayList<Integer> tile2 = new ArrayList<Integer>();
    tile2.add(8);
    tile2.add(4);
    tile2.add(2);
    tile2.add(9);
    
    NumberTile ntile = new NumberTile(list);
    NumberTile ntile2 = new NumberTile(list2);
    NumberTile ntile3 = new NumberTile(list3);
    NumberTile ntile4 = new NumberTile(list4);
    NumberTile ntile5 = new NumberTile(list5);
    NumberTile ntile11 = new NumberTile(tile1);
    NumberTile ntile22 = new NumberTile(tile2);

    ArrayList<NumberTile> myboard = new ArrayList<NumberTile>();
    myboard.add(ntile);
    myboard.add(ntile2);
    myboard.add(ntile3);
    myboard.add(ntile4);
    myboard.add(ntile5);

    TileGame tileGame = new TileGame(myboard);

    System.out.println(tileGame.insertTile(ntile11));
    System.out.println(tileGame.insertTile(ntile22));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

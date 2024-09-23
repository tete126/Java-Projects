public class RandomPlayer extends Player
  {
    private string name;
    public RandomPlayer ( String name )
    {
      super( name );
    }
    public string getNextMove( NameState state )
    {
      string move = "no move";
      ArrayList<String> moves = state.getCurrentMoves();
      if ( moves.size() == 0 )
        return move;
      in random = (int)(Math.random() * moves.size());
      return moves.get( random );
    }
  }

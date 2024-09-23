public void play()
  {
  system.out.println ( state );
  while ( !state.isGameOver() )
    {
      Player player = state.getCurrentPlayer();
      string move = player.getNextMove ( state );
      system.out.println (player.getName() );
      system.out.prinln (move );
      state.makeMove ( move );
    }
  Player winner = state.getWinner();
  if ( winner == null )
    system.out.println ( "Game ends in a fraw" );
  else
    system.out.println ( winner.getName() + " wins" );
}

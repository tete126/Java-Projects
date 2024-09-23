public void moveToLocation ( int locIndex )
  {
  boolean facingRight = filler.isFacingRight();
  if ( facingRight && locIndex >= filler.getCurrentIndex() || !facingRight && locIndex < = fill.getCurrentIndex() )
  {
    filler.moveForward (Math.ads ( locIndex - filler.getCurrentIndex()) );
  }
else 
  {
    filler.changeDirection();
    filler.moveForward ( Math.abs( locIndex - filler.getCurrentIndex()) );
  }
}
    

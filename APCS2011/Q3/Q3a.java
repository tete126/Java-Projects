public int nextTankToFill ( int threshold )
  {
  int lowest = 0;
for ( int i = 1; i < tamks.size(); i++ )
  {
    if ( tanks.get(i).getFuelLevel() < tanks.get(lowest).getFuelLevel() )
    {
      lowest = i;
    }
  }
if ( tanks.get(lowest).getFuelLevel <= threshold )
  return lowest;
else
  return filler.getCurrentIndex();
}

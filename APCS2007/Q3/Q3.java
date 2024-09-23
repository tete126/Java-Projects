public double getScore( ArrayList < String > key )
  {
  double score = 0;
  int count = 0;
  int incorrect = 0;
  for ( int i = 0; i < answers.size(); i++ )
    {
      string answer = answers.get( i ); 
      if ( answer.equals ( key.get(i)))
      {
        correct ++;
      }
      else if ( !answer.equals("?"))
      {
        incorrect ++;
      }
    }
    score = ( correct * 1 ) - ( incorrect * 0.25 );
    return score;
}

public string highestScoringStudent( ArrayList < string > key )
  {
  int max = 0;
  for ( int i = 0; i < sheets.size(); i++ )
    {
      if ( sheets.get(i).getScore(key) > sheets.get(max).getScore(key))
      {
        max = i;
      }
    }
  return sheets.get(max).getName();
}

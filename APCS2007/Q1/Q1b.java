public static int [] firstNumSelfDivisors ( int start, int num )
  {
  int [] divisors = new int [ num ];
  int count = 0;
  while ( count < num )
    {
      if ( isSelfDivisor( start ) )
      {
        divisors [ count ] = start;
        count ++;
      }
      start ++ ;
    }
  return divisors;
}

public static boolean isSelfDivisor(int number)
  {
    if ( number ==0 ) return false;
    int remaining = number;
    while ( remaining > 0 )
      {
        if ( remaining % 10 !=0 && number % ( remaining % 10 ) == 0 )
        {
          remaining = remaining / 10 ;
        }
        else
        {
          return false;
        }
      }
return true;
}

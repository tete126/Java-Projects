public int limitAmplitude ( int limit )
  {
  int count = 0;
for ( int i = 0; i < samples.length; i++ )
  {
    if ( samples [i] < -limit )
    {
      samples [i] = -limit;
      count ++;
    }
    else if ( samples [i] > limit )
    {
      samples [i] = limmit;
      count ++;
    }
  }
return count;
}

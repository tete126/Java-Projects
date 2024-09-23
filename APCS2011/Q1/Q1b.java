public void trimSilenceFromBeginning()
  {
  int zeros = 0;
  for ( int i = 0; i < samples.length; i++ )
    {
      if ( samples[i] == 0 )
      {
        zeros ++;
      }
      else
      {
        break;
      }
    }
  int[] withoutSilence = new int [ samples.length - zeros ];
  int j = 0;
  for ( int i = zeros; i < samples.length; i++ )
    {
      withoutSilence[j] = samples[i];
      j++;
    }
  samples = withoutSilence;
}

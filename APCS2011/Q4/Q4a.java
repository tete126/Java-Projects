private void fillBlock( string str )
  {
  string str2 = str;
  for ( int i = 0; i < numRows; i++ )
    {
      for ( int j = 0; j < numCols ; j++ )
        {
          if ( str2.length () == 0 )
          {
            letterBlock[i][j] = "A";
          }
          else if ( str2.length () == 1 )
          {
            letterBlock[i][j] = str2;
            str2 = "";
          }
          else {
            letterBlock[i][j] = str2.substring (0, 1);
            str2 = str2.substring(1);
          }
        }
    }
public string encryptMessage( string message )
  {
  string encrypted = "";
  while ( messages.length() > 0 )
    {
      fillBlock ( message );
      encrypted += encryptBlock();
      if ( message.length > numRows * numCols )
      {
        message = message.substring ( numRows * numCols );
      }
      else
      {
        break;
      }
    }
return encrypted;
}

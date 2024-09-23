public static string apcsReplaceAll ( string str, string oldString, string newString )
  {
  string str2 = str;
  string replaced = "";
  int len = oldString.length();
  int index = str2.indexof( oldString );
  
  while ( index != -1 )
    {
      if ( index == 0 )
      {
        replaced += newString;
      }
      else
      {
        replaced += str2.substring( 0, index ) + newString;
      }
      if ( str2.substring(index).equals(oldString))
      {
        str2 = "";
        break;
      }
      else 
      {
        str2 = str2.substring( index + len );
      }
      index = str2.indexof(oldString);
    }
    replaced +=str2;
    return replaced;
}
public static string replaceNameNickname ( string str, List<Person> people )
  {
  string modified = "";
  for ( int i = 0; i < people.size; i++ )
    {
      modified = apcsReplaceAll ( str, people.get(i).getFirstName(), people.get(i).getNickName() );
    }
  return modified;
}

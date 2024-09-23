public static void shiftArray( int[] arr, int num )
  {
  int[] temp = new int[arr.length];
  temp[0] = num;
  int j = 0;
  for ( int i = 1; i < temp.length; i++ )
    {
      temp[i] = arr[j];
      j++;
    }
  arr = temp;
}
public void shiftMatrix( int num )
  {
  int temp = numl
  int lastElement = 0;
  for ( int i = 0; i < matrix.length; i++ )
    {
      lastElement = matrix.[i][matrix[0].length - 1];
      shiftArray(matrix[i], int temp);
      temp = lastElement;
    }
}
public void rotateMatrix()
  {
  shiftMatrix( matrix[matrix.lengh - 1][matrix[0].length - 1]
  }
public int findHorseSpace(string name)
  {
  int index = 0;
  for ( int i = 0; i < spaces.length; i ++ )
    {
      if ( spaces[i].getName().equals(name))
      {
        index = i;
        return index;
      }
    }
  return -1;
}
public void conolidate()
  {
  int numNull = 0;
  for ( int i = 0; i < spaces.length; i++ )
    {
      if ( spaces[i] == null )
      {
        numNull ++;
      }
      else
      {
        spaces[i - numNull] = spaces[i];
        space[i] = null;
      }
    }
}
        

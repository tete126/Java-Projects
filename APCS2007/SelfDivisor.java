public class SelfDivisor
  {
    public SelfDivisor()
    {
      
    }

    public static boolean isSelfDivisor(int number)
    {
      if (number == 0) return false;

      int remaining = number;
      while(remaining > 0)
        {
          if(remaining % 10 != 0 && number % (remaining % 10) == 0)
          {
            remaining = remaining / 10;
          }
          else
          {
            return false;
          }
        }
      return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num)
    {
      int[] divisors = new int[num];

      int count = 0;

      while(count < num)
        {
          if(isSelfDivisor(start))
          {
            divisors[count] = start;
            count++;
          }
          start++;
        }

      return divisors;
    }
  }

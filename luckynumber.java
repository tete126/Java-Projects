import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class luckynumber {
  public static void main(String[] args) {
    int n = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    try {
        n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n; i++)
        {
            list.add(Integer.parseInt(br.readLine()));
        }


        int result = 0;
        for(int i = 0; i < n; i++)
        {
            int num = list.get(i);
            result = getSum(num);
            while(result >= 10)
            {
                result = getSum(result);
            }
            System.out.println(result);
        }
        br.close();
    }
    catch ( IOException e)
    {}
      catch (NumberFormatException e) {
      }
  }

  public static int getSum(int num)
  {

    int sum = 0;
    while(num > 0)
        {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
  }
}

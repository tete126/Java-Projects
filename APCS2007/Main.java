// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    SelfDivisor divisor = new SelfDivisor();

    System.out.println(divisor.isSelfDivisor(12));
    System.out.println(divisor.isSelfDivisor(345));
    System.out.println(divisor.isSelfDivisor(100));
    System.out.println(divisor.isSelfDivisor(2424));

    int [] arr = divisor.firstNumSelfDivisors(10, 3);

    for(int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

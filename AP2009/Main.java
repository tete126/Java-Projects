// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    NumberCube cube = new NumberCube();
    int numTosses = 5;

    int[] arr = NumberCube.getCubeTosses(cube, numTosses);

    for(int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }

    System.out.println();
    
    int[] values = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5, 5};
    //int[] values = {1, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5};

    System.out.println(NumberCube.getLongestRun(values));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

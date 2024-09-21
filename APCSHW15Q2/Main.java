// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    
    int[] markers = {10, 40, 45, 15, 20};
    int[] markers2 = {10, 40, 10, 60, 20};
    Trail trail = new Trail(markers);
    Trail trail2 = new Trail(markers2);
    System.out.println(trail.isLevelTrailSegment(1, 3));
    System.out.println(trail.isLevelTrailSegment(3, 4));
    System.out.println(trail.isDifficult());
    System.out.println(trail2.isDifficult());
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

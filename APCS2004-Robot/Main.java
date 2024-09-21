public class Main {
  public static void main(String[] args) {
    int [] hall = {1, 1, 2, 2};
    Robot r1 = new Robot(hall, 1, true);
    System.out.println(r1.clearHall());
  }

}

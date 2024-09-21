import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Digits d1 = new Digits(15704);
    Digits d2 = new Digits(1356);
    Digits d3 = new Digits(7);
    Digits d4 = new Digits(1336);
    Digits d5 = new Digits(0);
    Digits d6 = new Digits(65310);

    d1.print();
    System.out.println();
    d6.print();
    System.out.println();

    System.out.println(d1.isStrictlyIncreasing());
    System.out.println(d2.isStrictlyIncreasing());
    System.out.println(d3.isStrictlyIncreasing());
    System.out.println(d4.isStrictlyIncreasing());
    System.out.println(d5.isStrictlyIncreasing());
    System.out.println(d6.isStrictlyIncreasing());
  }

}

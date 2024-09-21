
public class Main {
  public static void main(String[] args) {
    int[] arr = {50, 60, 70, 80};
    StudentRecord s = new StudentRecord(arr);

    double finalS = s.finalAverage();
    System.out.println(finalS);

    int[] arr2 = {50, 60, 50, 40};
    StudentRecord s2 = new StudentRecord(arr2);
    
    double finalS2 = s2.finalAverage();
    System.out.println(finalS2);

  }

}

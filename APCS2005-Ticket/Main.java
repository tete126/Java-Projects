
public class Main {
  public static void main(String[] args) {
    Walkup t = new Walkup();
    System.out.println(t);

    System.out.println();
    Advance advanced = new Advance(11);
    //System.out.println(advanced.getPrice());
    System.out.println((Ticket)advanced);

    System.out.println();
    StudentAdvance advancedStudent = new StudentAdvance(11);
    System.out.println(advancedStudent);
  }

}

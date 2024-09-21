import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Hotel hotel = new Hotel(2);

    Reservation t = hotel.requestRoom("Tegan");
    
    Reservation k = hotel.requestRoom("Kay");
    
    Reservation l = hotel.requestRoom("Lei");

    System.out.println(t);
    System.out.println(k);
    System.out.println(l);

    Reservation newRes = hotel.cancelAndReassign(k);

    System.out.println();
    System.out.println(newRes);
    
  }

}

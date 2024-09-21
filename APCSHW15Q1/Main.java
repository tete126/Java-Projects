// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    CookieOrder order = new CookieOrder("Chocolate chip", 3);
    CookieOrder order2 = new CookieOrder("Mint", 3);
    

    MasterOrder masterOrder = new MasterOrder();
    masterOrder.addOrder(order);
    masterOrder.addOrder(order2);
    masterOrder.addOrder(new CookieOrder("Shortbread", 5));
    masterOrder.addOrder(new CookieOrder("Macaroon", 2));

    System.out.println(masterOrder.getTotalBoxes());

    System.out.println(masterOrder.removeVariety("Mint"));
    
    System.out.println(masterOrder.getTotalBoxes());

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

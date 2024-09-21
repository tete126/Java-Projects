// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int [] table = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 90, 60};

    int chargeTime = 2;

    BatteryCharger charger = new BatteryCharger(table);

    /**int startHour = 12;
    int chargeTime = 1;
    int cost = charger.getChargingCost(startHour, chargeTime);
    System.out.println(cost);
  }**/

    System.out.println(charger.getChargeStartTime(chargeTime));

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
}

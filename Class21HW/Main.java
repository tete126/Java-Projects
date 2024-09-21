import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //AppointmentBook appointment = new AppointmentBook();

    //System.out.println(appointment.findFreeBlock(2, 5));

    ArrayList<Double> temperatures = new ArrayList<Double>();
    temperatures.add(84.6);
    temperatures.add(85.1);
    temperatures.add(94.3);
    temperatures.add(99.1);
    temperatures.add(102.5);
    temperatures.add(142.0);
    WeatherData data = new WeatherData(temperatures);

    data.cleanData(90.0, 105.0);

    System.out.println();

    Sign sign1 = new Sign("ABC222DE", 3);

    int x = sign1.numberOfLines();

    System.out.println(x);

    String str = sign1.getLines();

    System.out.println(str);

    Sign sign2 = new Sign("ABCD", 10);

    int y = sign2.numberOfLines();

    String str2 = sign2.getLines();

    System.out.println(y);
    System.out.println(str2);

    Candy c = new Candy("cherry");
    Candy c2 = new Candy("strawberry");
    Candy c3 = new Candy("cherry");
    Candy c4 = new Candy("lime");
    Candy c5 = new Candy("cherry");

    Candy[][] box = new Candy[3][3];

    box[0][1] = c4;
    box[1][1] = c2;
    //box[1][2] = c;
    box[2][0] = c3;
    box[2][1] = c5;

    BoxOfCandy boxCandy = new BoxOfCandy(box);
    
    System.out.println(boxCandy.moveCandyToFirstRow(0));

    System.out.println(boxCandy.moveCandyToFirstRow(2));

    System.out.println(boxCandy.removeNextByFlavor("cherry"));
    
      
  }

}

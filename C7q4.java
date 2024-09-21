import java.util.Scanner;

public class C7q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char letter = input.next().charAt(0);
    input.nextLine();
    String str = input.nextLine();
    String temp = str.toLowerCase();
    int index = temp.indexOf(letter);


    int count = 0;
    while(index != -1)
      {
        count++;
        temp = temp.substring(index + 1);
        index = temp.indexOf(letter);
      }

    System.out.println(str);
    System.out.println(count);
  }

}

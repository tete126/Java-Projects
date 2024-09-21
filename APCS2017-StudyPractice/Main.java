import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    StudyPractice p1 = new MultiPractice(7, 3);
    System.out.println(p1.getProblem());

    p1.nextProblem();
    System.out.println(p1.getProblem());

    p1.nextProblem();
    System.out.println(p1.getProblem());

    System.out.println();

    StudyPractice p2 = new MultiPractice(4, 12);

    p2.nextProblem();
    System.out.println(p2.getProblem());
    System.out.println(p2.getProblem());

    p2.nextProblem();
    p2.nextProblem();
    System.out.println(p2.getProblem());

    p2.nextProblem();
    System.out.println(p2.getProblem());

    System.out.println();

    System.out.println("Practice");

    for(int i = 0; i < 10; i++)
      {
        int a1 = (int)(Math.random() * 9 + 1);
        int a2 = (int)(Math.random() * 9 + 1);
        System.out.println(a1 + " * " + a2);
        int answer = input.nextInt();
        
        while(answer != a1 * a2)
          {
            System.out.println("Incorrect");
            answer = input.nextInt();
          }
        
      }
           
    System.out.println("Good job!");
   
  }
}

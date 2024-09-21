import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("TicTacToe");

    System.out.println("You play as X");


    //String x = input.nextLine();

    String[][] board = new String[3][3];
    for(int i = 0; i < board.length; i++)
      {
        for(int j = 0; j < board[0].length; j++)
          {
            board[i][j] = "-";
          }
      }

    

    
  }

 
}

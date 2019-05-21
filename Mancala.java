
import java.util.Scanner;

public class Mancala {

  public static void main(String[] args) {
    int[] board = new int[14];

    for (int k = 0; k < board.length; k++) {
      if ((k + 1) % 7 == 0)
        board[k] = 4;
    }

    startGame(board);

  }
}

class User {

  private static int numSeeds;
  private static int points;
 
  static void startGame(int[] board){
      Scanner in = new Scanner(System.in);
  
      System.out.println("Your move. Enter an integer between 0 and 5:");
      int move = in.nextInt();
      
      int ogIndex = move;
      numSeeds = board[move];
      
      for(int k = 0; k <= numSeeds; k++){
        if(k + move == 14)
          ogIndex = 0;
        
      }

      for (int k = move + 1; k <= move + numSeeds; k++){
          if (k == 14){
            k=0;
            
          board[k]+=1;
          }
  
        }
  
  }
  
}

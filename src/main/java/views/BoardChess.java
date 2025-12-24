package views;

import util.SingletonChessBoard;
import model.pieces.AbstractPiece;
import util.Util;

public class BoardChess {

  public static void showBoardChess() {
    int counter = 0;
    int indexSquare;
    int divisor2 = 2, divisor8 = 8;
    for (AbstractPiece piece : SingletonChessBoard.getInstance().getChessBoard()) {
      if (!piece.isEmpty()) {
        System.out.print(piece.getName() + '\t');
      } else {
        indexSquare = (counter / divisor8 + counter);
        if (Util.isMod(indexSquare, divisor2)) {
          System.out.print('⬛' + " \t");
        } else {
          System.out.print('⬜' + " \t");
        }
      }
      counter++;
      if (Util.isMod(counter, divisor8)) {
        System.out.println();
      }
    }
    System.out.println();
  }


}




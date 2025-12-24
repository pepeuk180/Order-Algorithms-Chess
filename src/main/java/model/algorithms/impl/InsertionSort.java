package model.algorithms.impl;

import model.algorithms.AbstractAlgorithm;
import model.pieces.AbstractPiece;
import util.Delay;
import util.SingletonChessBoard;
import views.BoardChess;

public class InsertionSort extends AbstractAlgorithm {


  public InsertionSort(int speed, String colorPiece, String quantityPiece) {
    setSpeed(speed);
    setColorPiece(colorPiece);
    setQuantityPiece(quantityPiece);
  }

  @Override
  public void sort() {
    int n = getChess().getChessBoard().size();
    for (int index = 1; index < n; index++) {
      AbstractPiece key = getChess().getChessBoard()
          .get(index);
      int indexJ = index - 1;
      while (indexJ >= 0 && selectTypeColor(indexJ, key)) {
        getChess().getChessBoard()
            .set(indexJ + 1, getChess().getChessBoard().get(indexJ));
        indexJ--;
      }
      getChess().getChessBoard().set(indexJ + 1, key);
      BoardChess.showBoardChess();
      Delay.delay(getSpeed());
    }
  }

  @Override
  public boolean sortNormal(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) > 0;
  }

  @Override
  public boolean sortReverse(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) < 0;
  }


}

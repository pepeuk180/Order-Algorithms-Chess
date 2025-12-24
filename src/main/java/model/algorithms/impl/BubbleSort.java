package model.algorithms.impl;

import java.util.Collections;
import model.algorithms.AbstractAlgorithm;
import model.pieces.AbstractPiece;

import util.Delay;
import views.BoardChess;

public class BubbleSort extends AbstractAlgorithm {


  public BubbleSort(int speed, String colorPiece, String quantityPiece) {
    setSpeed(speed);
    setColorPiece(colorPiece);
    setQuantityPiece(quantityPiece);
  }

  @Override
  public void sort() {
    int n = getChess().getSizeChessBoard();
    for (int index = 0; index < n - 1; index++) {
      for (int indexJ = 0; indexJ < n - index - 1; indexJ++) {
        AbstractPiece key = getChess().getChessBoard().get(indexJ + 1);
        if (selectTypeColor(indexJ, key)) {
          Collections.swap(getChess().getChessBoard(), indexJ, indexJ + 1);
        }
        Delay.delay(getSpeed());
        BoardChess.showBoardChess();
        if (isOrdered()){
          break;
        }

      }
    }
  }

  @Override
  public boolean sortReverse(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) < 0;

  }

  @Override
  public boolean sortNormal(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) > 0;
  }


}

package model.algorithms.impl;


import java.util.Collections;
import model.algorithms.AbstractAlgorithm;
import model.pieces.AbstractPiece;
import util.Delay;
import util.SingletonChessBoard;
import views.BoardChess;

public class SelectionSort extends AbstractAlgorithm {


  public SelectionSort(int speed, String colorPiece, String quantityPiece) {
    setSpeed(speed);
    setColorPiece(colorPiece);
    setQuantityPiece(quantityPiece);
  }

  @Override
  public void sort() {

    int size = getChess().getSizeChessBoard();

    for (int index = 0; index < size - 1; index++) {
      int min_idx = index;

      for (int indexJ = index + 1; indexJ < size; indexJ++) {
        AbstractPiece pieceMin = getChess().getChessBoard().get(min_idx);
        if (selectTypeColor(indexJ, pieceMin)) {
          min_idx = indexJ;
        }
      }

      if (min_idx != index) {
        Collections.swap(SingletonChessBoard.getInstance().getChessBoard(), index, min_idx);
      }
      Delay.delay(getSpeed());
      BoardChess.showBoardChess();
      if (isOrdered()){
        index = size - 1;
      }
    }

  }

  @Override
  public boolean sortNormal(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) < 0;
  }

  @Override
  public boolean sortReverse(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) > 0;
  }
}

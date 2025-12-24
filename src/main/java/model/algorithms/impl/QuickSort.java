package model.algorithms.impl;

import model.algorithms.AbstractAlgorithm;
import model.pieces.AbstractPiece;
import util.Delay;
import java.util.Collections;
import views.BoardChess;

public class QuickSort extends AbstractAlgorithm {

  private int startIndex;
  private int endIndex;

  public QuickSort(int speed, String colorPiece, String quantityPiece) {
    startIndex = 0;
    setSpeed(speed);
    setColorPiece(colorPiece);
    setQuantityPiece(quantityPiece);
    this.endIndex = getChess().getSizeChessBoard() - 1;
  }


  public int partition(int low, int high) {
    AbstractPiece pivot = getChess().getChessBoard().get(high);
    int index = low - 1;
    for (int indexJ = low; indexJ < high; indexJ++) {
      if (selectTypeColor(indexJ, pivot)) {
        index++;
        Collections.swap(getChess().getChessBoard(), index, indexJ);
      }
    }
    Collections.swap(getChess().getChessBoard(), index + 1, high);
    Delay.delay(getSpeed());
    BoardChess.showBoardChess();
    return index + 1;
  }


  @Override
  public void sort() {
    this.quickSorting(this.startIndex, this.endIndex);
  }

  @Override
  public boolean sortNormal(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) < 0;
  }

  @Override
  public boolean sortReverse(int indexJ, AbstractPiece piece) {
    return getChess().getChessBoard().get(indexJ).compareTo(piece) > 0;
  }

  public void quickSorting(int low, int high) {
    if (low < high) {
      int pivotIndex = partition(low, high);
      if (!isOrdered()) {
        quickSorting(low, pivotIndex - 1);
      }
      if (!isOrdered()) {
        quickSorting(pivotIndex + 1, high);
      }

    }
  }


}


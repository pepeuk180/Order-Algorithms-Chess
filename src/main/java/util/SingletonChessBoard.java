package util;

import java.util.ArrayList;
import java.util.Collections;
import lombok.Getter;
import lombok.Setter;
import model.pieces.AbstractPiece;
import model.pieces.impl.EmptyPiece;

public class SingletonChessBoard {

  private static SingletonChessBoard SingletonChessBoard;
  @Getter
  @Setter
  private ArrayList<AbstractPiece> chessBoard;
  @Getter
  private final int sizeChessBoard = 64;

  private SingletonChessBoard() {
    this.chessBoard = new ArrayList<>(sizeChessBoard);
  }

  public static SingletonChessBoard getInstance() {
    if (SingletonChessBoard == null) {
      SingletonChessBoard = new SingletonChessBoard();

    }
    return SingletonChessBoard;
  }

  public void loadChessBoardEmpty() {
    for (int index = 1; index <= SingletonChessBoard.sizeChessBoard; index++) {
      SingletonChessBoard.chessBoard.add(new EmptyPiece(index));
    }
  }

  private void insertPiecesOnBoard(ArrayList<AbstractPiece> pieces) {
    for (AbstractPiece pieceCurrent : SingletonChessBoard.getChessBoard()) {
      for (AbstractPiece pieceUpdate : pieces) {
        if (pieceCurrent.getId() == pieceUpdate.getId()) {
          pieceCurrent.setName(pieceUpdate.getName());
        }
      }
    }
  }

  private void shufflePiecesOnBoard() {
    Collections.shuffle(chessBoard);
  }

  public void readyForSort(ArrayList<AbstractPiece> pieces) {
    this.insertPiecesOnBoard(pieces);
    this.shufflePiecesOnBoard();
  }


}

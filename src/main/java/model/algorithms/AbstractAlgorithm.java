package model.algorithms;

import lombok.Getter;
import lombok.Setter;
import model.pieces.AbstractPiece;
import util.SingletonChessBoard;
import util.constants.InputParametersCli;

@Getter
@Setter
public abstract class AbstractAlgorithm {

  private int speed;
  private String colorPiece;
  private SingletonChessBoard chess = SingletonChessBoard.getInstance();
  private String quantityPiece;


  public abstract void sort();

  public abstract boolean sortNormal(int indexJ, AbstractPiece piece);

  public abstract boolean sortReverse(int indexJ, AbstractPiece piece);

  public boolean isWhite() {
    return this.colorPiece.equals("w");
  }

  public boolean selectTypeColor(int indexJ, AbstractPiece piece) {
    boolean typeColor;
    if (this.isWhite()) {
      typeColor = sortReverse(indexJ, piece);
    } else {
      typeColor = sortNormal(indexJ, piece);
    }
    return typeColor;
  }

  public boolean isOrdered() {
    String[] rangeIdPiece = InputParametersCli.NUMBER_PIECE.value(this.quantityPiece).split(",");
    int indexBegin = Integer.parseInt(rangeIdPiece[rangeIdPiece.length - 2]);
    int indexEnd = Integer.parseInt(rangeIdPiece[rangeIdPiece.length - 1]);
    boolean isOrdered = true;
    for (int index = indexBegin; index <= indexEnd; index++) {
      if (chess.getChessBoard().get(index - 1).getId() != index) {
        isOrdered = false;
      }
    }
    return isOrdered;
  }


}

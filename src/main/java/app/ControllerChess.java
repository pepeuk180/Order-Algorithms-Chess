package app;

import java.util.ArrayList;
import model.algorithms.AbstractAlgorithm;
import model.algorithms.AlgorithmFactory;
import model.pieces.AbstractPiece;
import model.pieces.FactoryPiece;
import util.SetterInputCLI;
import util.SingletonChessBoard;
import util.SingletonSortingTimer;
import util.constants.Constants;
import views.BoardChess;
import views.ConfigurationsChess;
import views.Timer;


public class ControllerChess {

  private ConfigurationsChess configurationsChess;
  private final SingletonChessBoard chessBoard = SingletonChessBoard.getInstance();

  public ControllerChess() {
      chessBoard.loadChessBoardEmpty();
  }

  public void start() {
    BoardChess.showBoardChess();
    AbstractAlgorithm listAbstractAlgorithm = AlgorithmFactory.getAlgorithm(configurationsChess);
    SingletonSortingTimer.getInstance().startIteration();
    listAbstractAlgorithm.sort();
    SingletonSortingTimer.getInstance().endIteration();
    Timer.showTimer();
  }

  public boolean checkload(String[] cliInput) {
    String[] setup = SetterInputCLI.onlySetup(cliInput);
    boolean isSuccess = true;
    for (String s : setup) {
      if (s.equals(Constants.INVALID)) {
        isSuccess = false;
      }
    }
    configurationsChess = new ConfigurationsChess(setup);
    configurationsChess.showSettings();

    return isSuccess;
  }

  public void load() {
    this.loadList();
  }

  public void loadList() {
    ArrayList<AbstractPiece> pieces = (ArrayList<AbstractPiece>) FactoryPiece.createPieces(
        configurationsChess.getNumberPieces());
    chessBoard.readyForSort(pieces);
  }

}




package model.algorithms;

import model.algorithms.impl.*;
import util.SingletonSortingTimer;
import views.ConfigurationsChess;


public class AlgorithmFactory {
  /*+
   * Pattern Method Factory on AbstractALgorithm
   * @param ConfigurationChess configurations this game
   *
   *
   */

  public static AbstractAlgorithm getAlgorithm(ConfigurationsChess configurationsChess) {
    int speed = Integer.parseInt(configurationsChess.getSpeed());
    String colorPiece = configurationsChess.getCharacter();
    String quantityPiece = configurationsChess.getNumberPieces();
    SingletonSortingTimer.getInstance();
    switch (configurationsChess.getAlgorithmsSort()) {
      case "i":
        return new InsertionSort(speed, colorPiece, quantityPiece);
      case "q":
        return new QuickSort(speed, colorPiece, quantityPiece);
      case "s":
        return new SelectionSort(speed, colorPiece, quantityPiece);
      case "b":
        return new BubbleSort(speed, colorPiece, quantityPiece);
      default:
        return null;
    }
  }
}

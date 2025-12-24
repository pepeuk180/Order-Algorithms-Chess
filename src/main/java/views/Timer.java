package views;

import util.SingletonSortingTimer;

public class Timer {

  public static void showTimer() {
    System.out.println(
        "Total Elapsed Time: " + SingletonSortingTimer.getInstance().getTotalElapsedTime()+" ms");

  }

}

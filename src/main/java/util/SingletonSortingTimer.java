package util;

import lombok.Getter;

public class SingletonSortingTimer {

  @Getter
  private long totalElapsedTime = 0;
  private long iterationStart;

  private static SingletonSortingTimer instance;

  private SingletonSortingTimer() {
  }

  public static SingletonSortingTimer getInstance() {
    if (SingletonSortingTimer.instance == null) {
      instance = new SingletonSortingTimer();
    }
    return instance;
  }

  public void startIteration() {
    iterationStart = System.currentTimeMillis();
  }

  public void endIteration() {
    long iterationEnd = System.currentTimeMillis();
    totalElapsedTime += (iterationEnd - iterationStart);
  }


}



package util;

public class Delay {

  public static void delay(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {

    }
  }
}

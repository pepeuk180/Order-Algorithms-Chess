package app;

public class Main {

  public static void main(String[] args) {
    ControllerChess controller = new ControllerChess();
    if (controller.checkload(args)) {
      controller.load();
      controller.start();
    } else {
      System.out.println("Error loading arguments");
    }
  }
}

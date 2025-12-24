package views;

import lombok.Getter;
import util.constants.InputParametersCli;

@Getter
public class ConfigurationsChess {

  private String algorithmsSort;
  private String listType;
  private String numberPieces;
  private String character;
  private String speed;

  public ConfigurationsChess(String[] inputClient) {
    this.algorithmsSort = inputClient[0];
    this.listType = inputClient[1];
    this.numberPieces = inputClient[2];
    this.character = inputClient[3];
    this.speed = inputClient[4];
  }


  public void showSettings() {
    System.out.println(
        "Algorithm Sort: [" + this.getEnumName(InputParametersCli.ORDER_ALGORITHMS,
            this.algorithmsSort)
            + "]");
    System.out.println(
        "List Type: [" + this.getEnumName(InputParametersCli.LIST_TYPE, this.listType) + "]");
    System.out.println("Number Pieces: [" + this.numberPieces + "]");
    System.out.println(
        "Character: [" + this.getEnumName(InputParametersCli.CHOOSE_CHARACTER, this.character)
            + "]");
    System.out.println("Speed: [" + this.speed + "]");
  }

  public String getEnumName(InputParametersCli parameters, String id) {
   return parameters.value(id);
  }

}

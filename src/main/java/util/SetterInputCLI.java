package util;

import java.util.Arrays;
import util.constants.Constants;
import util.constants.InputParametersCli;

public class SetterInputCLI {

  public final static String ORDER_ALGORITHMS = "a";
  public final static String LIST_TYPE = "t";
  public final static String NUMBER_PIECE = "r";
  public final static String CHOOSE_CHARACTER = "c";
  public final static String SPEED = "s";


  public static String[] onlySetup(String[] inputCli) {
    int quantityParameters = 5;
    String[] outputCli = new String[quantityParameters];
    outputCli = fillOut(outputCli);
    for (String inputCliStr : inputCli) {
      switch (inputCliStr.substring(0, 1)) {
        case SetterInputCLI.ORDER_ALGORITHMS:
          outputCli[0] = Validator.checkCharacter(InputParametersCli.ORDER_ALGORITHMS,
              SetterInputCLI.inputlower(inputCliStr));

          break;
        case SetterInputCLI.LIST_TYPE:
          outputCli[1] = Validator.checkCharacter(InputParametersCli.LIST_TYPE,
              SetterInputCLI.inputlower(inputCliStr));

          break;
        case SetterInputCLI.NUMBER_PIECE:
          outputCli[2] = Validator.checkNumber(InputParametersCli.NUMBER_PIECE,
              SetterInputCLI.inputlower(inputCliStr));

          break;
        case SetterInputCLI.CHOOSE_CHARACTER:
          outputCli[3] = Validator.checkCharacter(InputParametersCli.CHOOSE_CHARACTER,
              SetterInputCLI.inputlower(inputCliStr));
          break;
        case SetterInputCLI.SPEED:
          outputCli[4] = Validator.checkNumber(InputParametersCli.SPEED,
              SetterInputCLI.inputlower(inputCliStr));
          break;
        default:
          break;

      }
    }
    return outputCli;
  }

  public static String inputlower(String inputCliStr) {
    return inputCliStr.substring(2).toLowerCase();
  }

  public static String[] fillOut(String[] inputCli) {
    Arrays.fill(inputCli, Constants.INVALID);
    return inputCli;
  }
}

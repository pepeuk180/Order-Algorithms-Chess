package util;

import util.constants.InputParametersCli;

public class Validator {


  public static String checkCharacter(InputParametersCli inputParametersCli,
      String inputCharacter) {
    String outputCharacter = "Invalid";
    if (inputParametersCli.containsKey(inputCharacter)) {
      outputCharacter = inputCharacter;
    }
    return outputCharacter;
  }

  public static String checkNumber(InputParametersCli inputParametersCli,
      String inputCharacter) {
    String outputCharacter = "Invalid";
    if (inputParametersCli.containsKey(inputCharacter)) {
      outputCharacter = inputCharacter;
    }
    return outputCharacter;
  }



}

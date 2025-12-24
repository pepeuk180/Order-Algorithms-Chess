package util.constants;

import java.util.HashMap;
import java.util.Map;

public enum InputParametersCli {
  ORDER_ALGORITHMS(new HashMap<String, String>() {{
    put("i", "Insertion Sort");
    put("q", "Quick Sort");
    put("s", "Selection Sort");
    put("b", "Bubble Sort");
  }}),
  LIST_TYPE(new HashMap<String, String>() {{
    put("n", "Number");
    put("c", "Character");
  }}),
  NUMBER_PIECE(new HashMap<>() {{
    put("1", "5,5");
    put("2", "4,5");
    put("4", "3,6");
    put("6", "2,6");
    put("8", "1,8");
    put("10", "9,16");
    put("16", "1,16");
  }}),
  CHOOSE_CHARACTER(new HashMap<>() {{
    put("b", "Black");
    put("w", "White");
  }}),
  SPEED(new HashMap<>() {{
    put("100", "min rank");
    put("1000", "max rank");
  }});
  private HashMap<String, String> parameters;



  InputParametersCli(HashMap<String, String> parameters) {
    this.parameters = parameters;
  }

  public boolean containsKey(String key) {
    return parameters.containsKey(key);
  }
  public String value(String key) {
    return parameters.get(key);
  }
}

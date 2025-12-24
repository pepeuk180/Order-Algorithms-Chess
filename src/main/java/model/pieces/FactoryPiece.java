package model.pieces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactoryPiece {

  private static Map<String, List<AbstractPiece>> factoryPiece = new HashMap<>();

  static {
    BuilderPiece builder = new BuilderPiece();
    factoryPiece.put("1", new ArrayList<>(builder.king()));
    factoryPiece.put("2", new ArrayList<>(builder.kings()));
    factoryPiece.put("4", new ArrayList<>(builder.kingsBishops()));
    factoryPiece.put("6", new ArrayList<>(builder.kingsBishopKnights()));
    factoryPiece.put("8", new ArrayList<>(builder.specialPieces()));
    factoryPiece.put("10", new ArrayList<>(builder.pawnPieces()));
    factoryPiece.put("16", new ArrayList<>(builder.allPieces()));
  }
  public static List<AbstractPiece> createPieces(String index) {
    return factoryPiece.getOrDefault(index, Collections.emptyList());
  }

}

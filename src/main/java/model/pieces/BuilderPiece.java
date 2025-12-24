package model.pieces;

import java.util.ArrayList;
import java.util.List;
import model.pieces.impl.*;

public class BuilderPiece {

  public BuilderPiece() {
  }

  public List<AbstractPiece> king() {
    return List.of(new KingPiece());
  }

  public List<AbstractPiece> kings() {
    List<AbstractPiece> kingsPieces = new ArrayList<>(king());
    kingsPieces.add(new QueenPiece());
    return kingsPieces;
  }

  public List<AbstractPiece> bishops() {
    int[] indexBishop = {3, 6};
    List<AbstractPiece> bishopPieces = new ArrayList<>();
    for (int index : indexBishop) {
      bishopPieces.add(new BishopPiece(index));
    }
    return bishopPieces;
  }

  public List<AbstractPiece> kingsBishops() {
    List<AbstractPiece> kingsBishopPieces = new ArrayList<>(kings());
    kingsBishopPieces.addAll(bishops());
    return kingsBishopPieces;
  }

  public List<AbstractPiece> knights() {
    int[] indexKnight = {2, 7};
    List<AbstractPiece> knightPieces = new ArrayList<>();
    for (int index : indexKnight) {
      knightPieces.add(new KnightPiece(index));
    }
    return knightPieces;
  }

  public List<AbstractPiece> rook() {
    int[] indexRook = {1, 8};
    List<AbstractPiece> rookPieces = new ArrayList<>();
    for (int index : indexRook) {
      rookPieces.add(new RookPiece(index));
    }
    return rookPieces;
  }

  public List<AbstractPiece> kingsBishopKnights() {
    List<AbstractPiece> pieces = new ArrayList<>(kingsBishops());
    pieces.addAll(knights());
    return pieces;
  }

  public List<AbstractPiece> specialPieces() {
    List<AbstractPiece> pieces = new ArrayList<>(kingsBishopKnights());
    pieces.addAll(rook());
    return pieces;
  }

  public List<AbstractPiece> pawnPieces() {
    int quantityBuildPawns = 8;
    int indexPawn = 9;
    List<AbstractPiece> pawnPieces = new ArrayList<>();
    for (int i = 0; i < quantityBuildPawns; i++) {
      pawnPieces.add(new PawnPiece(indexPawn + i));
    }
    return pawnPieces;
  }

  public List<AbstractPiece> allPieces() {
    List<AbstractPiece> allPieces = new ArrayList<>(specialPieces());
    allPieces.addAll(pawnPieces());
    return allPieces;
  }
}

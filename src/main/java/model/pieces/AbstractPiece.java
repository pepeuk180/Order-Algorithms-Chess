package model.pieces;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
public class AbstractPiece implements Comparable<AbstractPiece> {

  @Setter
  protected String name;
  protected int id;


  public boolean isEmpty() {
    return Objects.requireNonNullElse(name, "").isEmpty();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof AbstractPiece that)) {
      return false;
    }
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public int compareTo(AbstractPiece o) {
   return Integer.compare(this.id, o.id);
  }

}

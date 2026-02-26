package shared;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Transaction {

  private String id;
  private Long accountId;
  private Direction direction;
  private BigDecimal amount;
  private String mccCode;

  enum Direction {
    IN,
    OUT
  }

}

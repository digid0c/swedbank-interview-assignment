package categorization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CategorizationRule {

  private String id;
  private Long categoryId;
  private BigDecimal score;
  private String mccCode;
}

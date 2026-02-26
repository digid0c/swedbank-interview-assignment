package categorization;

import java.util.List;

import static java.math.BigDecimal.valueOf;

public class CategorizationRuleRepository {

  private List<CategorizationRule> businessRules = List.of(
          new CategorizationRule("mcd", 1L, valueOf(0.4), "mcd_1"),
          new CategorizationRule("ccrd", 2L, valueOf(0.8), "ccrd_1")
  );
}

package categorization;

import shared.Transaction;

/**
 * API providing operations on categorization mechanism
 */

public interface CategorizationService {

  /**
   * Transaction categorization happens in 2 stages:
   * 1. Business rules are applied
   * 2. Customer rules are applied afterward (if any exist)
   *
   * Each rule can apply 0.1 to 1 point for specific category ID. Points are applied for each rule e.g. all existing business
   * rules and all customer-specific rules must be applied for single transaction. Category that gets the maximum points wins
   * (the max score possible is 1). In case many categories get the same amount of points then customer rules must prevail
   * business rules. Categorization rule score is applied if it's MCC code fully matches transaction's MCC code.
   *
   * Please note that only incoming transactions can be categorized.
   *
   * @param transaction to categorize
   * @return categorization result
   */
  Object categorizeTransaction(Transaction transaction);

  /**
   * Add customer rule to rules collection. Each rule is automatically evaluated with 0.33 points.
   * @param customerRule to add
   * @return rule addition confirmation
   */
  Object addCustomerRule(CategorizationRule customerRule);
}

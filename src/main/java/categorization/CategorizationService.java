package categorization;

import shared.Transaction;

public interface CategorizationService {

  Object categorizeTransaction(Transaction transaction);

  Object addCustomerRule(CategorizationRule customerRule);
}

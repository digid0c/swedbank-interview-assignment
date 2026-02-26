package statement;

import shared.Transaction;

/**
 * API processing transactions to categorize them for customers statements
 */

public interface StatementService {

  /**
   * Processes consented transactions by sending them to categorization. Categorized transactions must be persisted in a
   * storage.
   * @param transaction consented transaction to process
   * @return processing result
   */
  Object processTransaction(Transaction transaction);
}

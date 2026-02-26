package statement;

import shared.Transaction;

public interface StatementService {

  Object processTransaction(Transaction transaction);
}

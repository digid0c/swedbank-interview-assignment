package consent;

import shared.Transaction;

public interface ConsentService {

  Object hasConsent(Transaction transaction);

  Object registerConsent(Long accountId);

  Object deleteConsent(Long accountId);
}

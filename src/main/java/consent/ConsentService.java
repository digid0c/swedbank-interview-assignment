package consent;

import shared.Transaction;

/**
 *  API providing operations on accounts consents
 */

public interface ConsentService {

  /**
   * Checks specific account consent
   * @param transaction Transaction to check consent for
   * @return true if consent is granted
   */
  Object hasConsent(Transaction transaction);

  /**
   * Register consent for specific account
   * @param accountId to register consent for
   * @return consent registration confirmation
   */
  Object registerConsent(Long accountId);


  /**
   * Delete consent for specific account
   * @param accountId to delete consent for
   * @return consent deletion confirmation
   */
  Object deleteConsent(Long accountId);
}

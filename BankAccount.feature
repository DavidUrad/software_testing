Feature: BankAccount
  Scenario: Bank account transfer
    Given Bank account with 1000kc
    When A user withdraw 500kc
    And A user transfer 1500kc to this accouny
    Then A user account balance is 2000kc

  Scenario: Multiple bank account transfer
    Given Bank account with 1000kc
    And another Bank account with 2000kc
    When A user tranfer from first bank account to second one 500kc
    Then A user account balance is 500kc
    And A user second account balance is 2500kc

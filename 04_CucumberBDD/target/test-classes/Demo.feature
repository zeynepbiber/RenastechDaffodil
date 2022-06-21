Feature: Payment Gateway functional test

  Scenario: Verify that user can buy a product
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy
    Then The user wants to enter payment information as
    |CNumber|4444443334433333|
    |EMonth | 12             |
    |EYear  |2026            |
    |CVVCode| 777           |
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successful!"



    Scenario: Verify that user can buy multiple products
      Given The user  user wants to go to Payment Gateway Website
      When The wants to buy elephant toys as "5"
      Then The user wants to enter Credit Card Number as"44444333443333"
      And The user wants to enter Expiration Month as "11"
      And The user wants to enter Expiration Year as "2029"
      And The user wants to enter CVV Code as "177"
      Then The user wants to click on pay now
      And The user wants to verify message as "Payment successful!"
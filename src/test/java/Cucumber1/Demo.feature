Feature: Payment Gateway functional test

  @BuyingProduct_TC1  @BuyingProduct
  Scenario: Verify that user can buy a product
    Given The user wants to go Payment Gateway Website
    When The user wants to buy an elephant toy
    Then The user wants to provide payment information
    And The user wants to click on pay now
    Then The user wants to verify message is successful



    #First step is go to website
    #Second step is choose quantity and click and buy now button

  @BuyingProduct_TC2  @BuyingProduct
  Scenario: Verify that user can buy multiple products
    Given The user wants to go Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card Number as "5454545454545454"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2024"
    And The user wants to enter CVV Code as "177"
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"


  @TC_600
  Scenario: Verify that user can buy multiple products - using MAP
    Given The user wants to go Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter payment information as following
    #  key       value
    |CNumber|5555444433332222|
    |EMonth | 11             |
    |EYear  | 2025           |
    |CvvCode| 177            |
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"


  @TC_700
  Scenario: Verify that user can buy multiple products - using LIST
    Given The user wants to go Payment Gateway Website
    When The user wants to buy elephant toy as following
    | 5  |
    | 10 |
    | -0 |
    Then The user wants to enter payment information as following as a List
      |5555444433332222| 11 | 2025 | 177 |
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"





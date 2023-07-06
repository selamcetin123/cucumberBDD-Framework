Feature: Functional testing on Orange HRM


  Scenario: Login to Orange HRM
    Given The user wants to go OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard


  @ParameterizedDashboard
  Scenario: Login to Orange HRM
    Given The user wants to go OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"

   @TC200 @smoke
  Scenario: Adding a new employee
    Given The user wants to go OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM Module
    And The user wants to go to Add Empployee Page
    Then The user wants to add first name as "Bahar"
    Then The user wants to add last name as "Renastech"
    Then The user wants to save personal information
     Then The user should be able to see "Personal Details"

   @TC300  @smoke
  Scenario: Adding a new employee - different format using Map
    Given The user wants to go OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM Module
    And The user wants to go to Add Empployee Page
    Then The user wants to go to Add Employee's first and last name as following
    |FirstName| MEKWSShahnaz12223y  |
    |LastName | MEKWSRenastech12223y|
    Then The user wants to add login details as following
    |UserName| MEKWshahnaz123322461y    |
    |Password| MEKWRenastech!123@361y   |
    |Status  | Enabled                 |
    Then The user wants to save personal information
     Then The user should be able to see "Personal Details"



   @TC_400
  Scenario: Adding a new employee - Third format using List
    Given The user wants to go OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM Module
    And The user wants to go to Add Empployee Page
    Then The user wants to go to Add Employee's first and last name as following List
    # Firstname       Lastname
    |Serhatt  |      Renastech322|
    |Bahar    |      Renastech32222|
    Then The user wanst to add Login in a List way
    # Username       password      status
    |renastech234    |   MRenastech202223.| Disable|
    |abcRenastech234 |   MRenastech202224.| Enable|
    |abcRenastech234 |   MRenastech20222. | Enable|
    Then The user wants to save personal information












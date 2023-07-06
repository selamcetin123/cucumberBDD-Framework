Feature: Google search box Verification

  Scenario: User search a text in google search box
  Given user wants to go to Google Home page
  And User wants to verify that user is on Google home page
  When User wants to enter a text on Google search box
    And User wants to search the text
  Then User wants to mach verify that title match with search text


#Gherkin language
# positive scenario
  Scenario: Login to Amazon with correct Username and correct Password
    Given User wants to go to Amazon website
    When User wants to enter correct Username
    Then User wants to enter correct Username
    And User wants to click on login button



# negative scenario
  Scenario: Login to Amazon with correct Username and Incorrect Password
    Given User wants to go to Amazon website
    When User wants to enter correct Username
    Then User wants to enter Incorrect Username
    And User wants to click on login button
    And User wants to verify that login was unsuccessful


# negative scenario
  Scenario: Login to Amazon with Incorrect Username and correct Password
    Given User wants to go to Amazon website
    When User wants to enter Incorrect Username
    Then User wants to enter correct Username
    And User wants to click on login button
    And User wants to verify that login was unsuccessful
Feature: Login to Gmail




  # positive scenario
  Scenario: Verify that login to gmail with positive credentials is succesful
  Given User wants to go to Google
  When User wants to click on Gmail
  And User wants to enter email address
  And User wants to enter password
    And  User wants to click on login button
    Then User wants to verify that signing was successful







  # make a search Google and click on first related website
  # go to goggle , search for Amazon and verify search is succesful
  Scenario: Search on Google for RenasTech
    Given User wants to go to Google
    When User wants to search for renastech
    And User wants to click on google search Button
    And User wants to click on renastech in results
    Then User wants to verify that renastech website is opened


# Each step is sentence sensitive. so you need to pass the sentence exactly if you want to use it somewhere else
  Scenario: Verify that user is able to go to Renastech by clicking Feeling Lucky button
    Given User wants to go to Google website
    When User wants to search for renastech.com
    And User wants to click on I'm Feeling Lucky search Button
    Then User wants to verify that browser is directted to renastech.com


    #selenium --- automation tool web browser
  #TestNG is a testing framework
  #JUnit is also testing frf\amework
  #cucumber



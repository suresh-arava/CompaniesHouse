Feature: CH Home page

  Scenario: Search for Companies house
    Given i enter url
    When i search for companies house
    Then i click on search button
    And i click on companies house title

  Scenario: Goto Benefits page
    Given i enter url
    When i click on Benefits title
    Then i click on How benefits work
    Then i click on Benefits calculator
    Then i clcik on Policy in Practice
    Then i click on Start Calculation button
    And i enter Name
    And i select Relationship status
    And i enter Post code
    And i enter Date of Birth
    And i enter your Partners date of birth
    And i enter benefit claim start date
    And i select no of dependant children
    And i select no of other Adults in household
    And i select any one disabled person
    And i click on continue to property details button

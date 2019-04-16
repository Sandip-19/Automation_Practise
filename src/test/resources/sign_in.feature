Feature: Sign in

  @regression
  Scenario: Sign in with invalid details
    Given I enter url as "https://www.d3dsecurity.co.uk"
    When  I click login button on home page
    Given I enter user name as "test@hotmail.co.uk"
    Given I enter password as "password123"
    When I click login button on login page
    Then I should see error message "Wrong credentials"
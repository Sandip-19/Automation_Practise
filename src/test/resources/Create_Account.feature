Feature: Create_an_account

  @Create
  Scenario: Create_account
    Given I click onto singin button onto home page
    And I entered an email address for create an account as "qatestpractice@hotmail.com"
    When I click create an account Button
    Given I select "MR" as tiltle
    Given I enter First Name as "Qatest"
    Given I enter Last Name as "Practice"
    Given I enter Password as "12345"
    And I select Date as "2"
    And I select Month as "April"
    And I select Year as "2019"
    When  I click sign up for Newsletter
    When  I click special offers
    Given I enter company as "123.com"
    Given I enter addess as "123 test Test Street"
    Given I enter address line 2 as "Street 2"
    Given I enter city Name as "Los Angeles"
    Given I enter State Name as "California"
    Given I eneter Zip Postcode as "90001"
    Given I enter Country Name as "United States"
    Given I enter additional info as "Wrong Address"
    Given I enter enter mobile number as "01234567"
    Given I enter Adress Alias as "as_above"
    When I click Register Button onto the create an acoount page
#    Then  I should see My Account page












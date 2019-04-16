Feature: D3D Quote Scenarios

  @regression @high
  Scenario: Get a Quotation with  InValid Details-email
    Given I enter url as "https://www.d3dsecurity.co.uk"
    When I click login button on home page
    Given I entered first name as "First"
    Given I entered last name as "Last"
    Given I entered email address as "quote@email.com"
    Given I entered phone number as "01234567890"
    Given I entered subject as a "quote"
    Given I entered message as "Hello Quote"
    Given I entered captcha code as per shown on the page as "12345"
    When  I click send message button
#    Then I should see a pop up box with message " "


  @regression @smoke
  Scenario: Entered all valid details except Invalid First name
    Given I enter url as "https://www.d3dsecurity.co.uk"
    When  I click login button on home page
    Given I entered first name as ""
    Given I entered last name as "Last"
    Given I entered email address as "quote@email.com"
    Given I entered phone number as "01234567890"
    Given I entered subject as a "quote"
    Given I entered message as "Hello Quote"
    Given I entered captcha code as per shown on the page as "12345"
    When  I click send message button
#    Then  I should see a pop up box with error message "First Name is not valid"

  @regression @smoke
  Scenario: Entered All Valid Details Except only Invalid Last Name
    Given I enter url as "https://www.d3dsecurity.co.uk"
    When  I click login button on home page
    Given I entered first name as "First"
    Given I entered last name as " "
    Given I entered email address as "quote@email.com"
    Given I entered phone number as "01234567890"
    Given I entered subject as a "quote"
    Given I entered message as "Hello Quote"
    Given I entered captcha code as per shown on the page as "12345"
    When  I click send message button
#    Then  I should see a pop up box with error message "Last Name is not valid"

  @regression @medium @smoke
  Scenario: Entered all valid details except Only Invalid email ID
    Given I enter url as "https://www.d3dsecurity.co.uk"
    When  I click login button on home page
    Given I entered first name as "First"
    Given I entered last name as "Last"
    Given I entered email address as "email.com"
    Given I entered phone number as "01234567890"
    Given I entered subject as a "quote"
    Given I entered message as "Hello Quote"
    Given I entered captcha code as per shown on the page as "12345"
    When  I click send message button
#    Then  I should see a pop up box with error message "Email address is not valid"

  @regression @medium
  Scenario: Entered all valid details only Invalid Phone number
    Given I enter url as "https://www.d3dsecurity.co.uk"
    When  I click login button on home page
    Given I entered first name as "First"
    Given I entered last name as "Last"
    Given I entered email address as "quote@email.com"
    Given I entered phone number as "0"
    Given I entered subject as a "quote"
    Given I entered message as "Hello Quote"
    Given I entered captcha code as per shown on the page as "12345"
    When  I click send message button
#    Then I should see a pop up box with error message "Phone number is not correct"


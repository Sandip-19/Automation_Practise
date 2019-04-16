#Feature: D3D Quote Scenarios Outline
##
##  Background:
##    Given I enter url as "https://www.d3dsecurity.co.uk"
##    When  I click login button on home page
##    Then  I should see the login page with free quote fields on the left
##
##  Scenario Outline  :Enter all Valid details
##    Given I entered first name as "<FirstName>"
##    Given I entered last name as "<LastName>"
##    Given I entered email address as "<Email>"
##    Given I entered phone number as "<PhoneNumber>"
##    Given I entered subject as a "<Subject>"
##    Given I entered message as "<Message>"
##    When  I click send message button
##    Then  I should see a "<Result>
##
##    Examples:
##      | FirstName | LastName | Email           | PhoneNumber | Subject | Message  | Result                              |
##      | First     | Last     | quote@email.com | 012345      | Quote   | Hi Quote | Thank you                           |
##      |           | Last     | qoute@email.com | 012345      | Quote   | Hi Quote | All fields with *are mandatory      |
##      | First     |          | quote@email.com | 012345      | Quote   | Hi Quote | All fields with *are mandatory      |
##      | First     | Last     |                 | 012345      | Quote   | Hi Quote | All field with *are mandatory       |
##      | First     | Last     | quote@email.com |             | Quote   | Hi Quote | All fields with *are mandatory      |
##      | First     | Last     | quote@email.com | 012345      |         | Hi Quote | All fields with *sign are mandatory |
##      | First     | Last     | quote@email.com | 012345      | Quote   |          | All fields with *sign are mandatory |
##      | First     | Last     | quote@email.com | 012345      | Quote   | Hi Quote | All fields with *sign are mandatory |
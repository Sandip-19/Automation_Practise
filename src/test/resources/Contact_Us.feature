Feature: Automation_Website

  @contactus
  Scenario Outline:
    Given I click on contact us button on the home page
    Then I should see partial url contains "contact"
    And I select  "Customer service" from subject heading
    And I entered an email address as "<Emailid>"
    And I entered ref number as "<Ref_Number>"
    And I attached a file
    And I entered a message as "<Hello_message>"
    When I click send button
    Then I should see message as "<message>"
    And I should not see signout button
    And I should see sign in button
    And I should see contact us buton
    When I click browser back button
    Then I should not see error message as "There is 1 error          Invalid email address."
    When I click browser forward button
    Then I should see message as "<message>"

    Examples:
      | Emailid         | Ref_Number | Hello_message | message                                               |
      | quote@gmai.com  | 0123A      | Hello_1       | Your message has been successfully sent to our team.  |
      | quote@gmail     | 0123B      | Hello_2       | There is 1 error          Invalid email address.      |
      | quote@gmail.com | 0123C      |               | There is 1 error         The message cannot be blank. |


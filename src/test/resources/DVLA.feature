Feature: DVLA

  @vehicle_info
  Scenario: Get_vehicle_info

    When I click onto Get vehicle information from DVLA on the first page
    Then I should see start now button
    When I click start now button
    Given I am reading the data from excel file "Data_for_DVLA.xlsx"
    Given I enter registration number
    When I click Continue button
    Then I should see vehicle Reg number, make,colour
    Then I select no,search again button
    Then I click Continue button
#    Then I should see enter the registration number page

  @multiple_vehicle_info
  Scenario:
    When I click onto Get vehicle information from DVLA on the first page
    Then I should see start now button
    When I click start now button
    Given I am reading the data from excel file "Data_for_DVLA.xlsx"
    Then I verify the vehicle data

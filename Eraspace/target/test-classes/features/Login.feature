Feature: Login functionality

  Background:
    Given User is on login page

  Scenario: TC 1.1 User login with invalid phone number
    When User input username "085860880691" and password "invalidPass26$"
    And User can't clicks on login button
    Then User should see an error message "No. Handphone belum terdaftar"

  Scenario: TC 1.2 User login with valid data with phone number
    When User input username "085860880695" and password "validPass26$"
    And User clicks on login button
    Then Successfully login user is navigated to the home page

  Scenario: TC 1.1 User login with invalid email
    When User input username "kikitest@gmail.com" and password "invalidPass26$"
    And User can't clicks on login button
    Then User should see an error message "Email belum terdaftar"

  Scenario: TC 1.2 User login with valid data with email
    When User input username "kikisahnakri18@gmail.com" and password "validPass26$"
    And User clicks on login button
    Then Successfully login user is navigated to the home page

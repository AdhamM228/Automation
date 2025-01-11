@smoke
Feature: SignUp

  Scenario: valid SignUp
    Given user click on login signup button
    When user Enter name
    And user Enter Email
    And user click on signup button
    When user Enter password
    And user Enter First name
    And user Enter Last name
    And user Enter Address
    And user select country
    And user Enter State
    And user Enter City
    And user Enter zipcode
    And user Enter Mobile Number
    And user click on Create Account button
    Then user can signup successfully


  Scenario Outline: invalid SignUp
    Given user click on login signup button
    When user Enter name
    And user Enter Email "<Email>"
    And user click on signup button
    When user Enter password
    And user Enter first name "<First name>"
    And user Enter last name "<Last name>"
    And user Enter Address "<Address>"
    And user select "<country>"
    And user Enter State
    And user Enter City
    And user Enter zipcode
    And user Enter Mobile Number
    And user click on Create Account button
    Then user can signup successfully
    Examples:
      | First name |Last name|Address|country|Email|
      | ali        |666666666|#######|Egypt  |ahmed2g2@gmail.com|
      | 666666666 |666666666|#######|Canada  |ahmed2a2h@gmail.com|

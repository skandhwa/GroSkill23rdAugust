@sanity @smoke
Feature: Validate the Login Scenario

@test1
  Scenario Outline: Validate the login functionality with correct username and password
    Given User logins to the facebook application
    And user enters the "<username>" in the username field
    And user enters the "<password>" in the password field
    When user clicks on the submit button
    Then user will be navigated to homepage of application

    Examples: 
      | username | password  |
      | sk1234   | test@1234 |
      | ab4567   | test@5678 |
 
@test2
  Scenario: Validate the login functionality with correct username and incorrectpassword
    Given User logins to the facebook application
    And user enters the username in the username field
    And user enters the password in the password field
    When user clicks on the submit button
    But user will get an error on the login page of application
    
    
    
    

@smoke
Feature: Validate the Login Scenario and check Correct Navigations

  Background: 
    Given User logins to the facebook application
    And user enters the "skandhwa" in the username field
    And user enters the "test@1234" in the password field
    When user clicks on the submit button
    Then user will be navigated to homepage of application


  @test1
  Scenario: Validate the login functionality with correct username and password
    And user will validate the page title

  Scenario: Validate that Friends Page is opening on click of that
    Then User will click on Friend icon
    And user will validate that he landed on the correct page
